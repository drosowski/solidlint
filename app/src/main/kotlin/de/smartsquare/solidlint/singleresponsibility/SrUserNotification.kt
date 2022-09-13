package de.smartsquare.solidlint.singleresponsibility

import de.smartsquare.solidlint.Event
import de.smartsquare.solidlint.SecurityContext
import de.smartsquare.solidlint.UserSettings

/**
 * SRP is violated as indicated by high cyclomatic complexity
 * LargeClass and TooManyFunctions are indicators as well.
 */
class SrUserNotification(
    private val securityContext: SecurityContext,
    private val emailNotifier: EmailNotifier,
    private val pushNotifier: PushNotifier,
    private val slackNotifier: SlackNotifier,
    private val smsNotifier: SmsNotifier,
    private val whatsAppNotifier: WhatsAppNotifier,
    private val signalNotifier: SignalNotifier
) {

    fun notifyUser(userSettings: UserSettings, event: Event) {
        if (!userSettings.notificationsActive ||
            securityContext.loggedInUser() == event.originator ||
            !userSettings.notifyFor(event.severity)
        ) {
            return
        }

        if (userSettings.emailActive) {
            emailNotifier.sendMail(event)
        }
        if (userSettings.pushActive) {
            pushNotifier.sendPush(event)
        }
        if (userSettings.slackActive) {
            slackNotifier.sendSlack(event)
        }
        if (userSettings.smsActive) {
            smsNotifier.sendSms(event)
        }
        if (userSettings.whatsAppActive) {
            whatsAppNotifier.sendWhatsApp(event)
        }
        if (userSettings.signalActive) {
            signalNotifier.sendSignal(event)
        }
    }
}
