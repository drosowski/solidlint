package de.smartsquare.solidlint.dependencyinversion

import de.smartsquare.solidlint.Event
import de.smartsquare.solidlint.SecurityContext
import de.smartsquare.solidlint.UserSettings

/**
 * DIP is violated as indicated by excessive use of constructor parameters
 */
@Suppress("LongParameterList")
class DipUserNotification(
    private val securityContext: SecurityContext,
    private val emailNotifier: EmailNotifier,
    private val pushNotifier: PushNotifier,
    private val slackNotifier: SlackNotifier,
    private val whatsappNotifier: WhatsAppNotifier,
    private val smsNotifier: SmsNotifier,
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
            whatsappNotifier.sendWhatsApp(event)
        }
        if (userSettings.signalActive) {
            signalNotifier.sendSignal(event)
        }
    }
}
