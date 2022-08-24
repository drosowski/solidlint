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
    private val notificationSettings: NotificationSettings
) {

    @Suppress("ComplexMethod")
    fun notifyUser(userSettings: UserSettings, event: Event) {
        if (!userSettings.notificationsActive ||
            securityContext.loggedInUser() == event.originator ||
            !userSettings.notifyFor(event.severity)
        ) {
            return
        }

        if (userSettings.emailActive && notificationSettings.emailSettings() != null) {
            sendMail(event)
        }
        if (userSettings.pushActive && notificationSettings.pushSettings() != null) {
            sendPush(event)
        }
        if (userSettings.slackActive && notificationSettings.slackSettings() != null) {
            sendSlack(event)
        }
        if (userSettings.smsActive && notificationSettings.smsSettings() != null) {
            sendSms(event)
        }
        if (userSettings.whatsAppActive && notificationSettings.whatsappSettings() != null) {
            sendWhatsApp(event)
        }
        if (userSettings.signalActive && notificationSettings.signalSettings() != null) {
            sendSignal(event)
        }
    }

    private fun sendSignal(event: Event) {
        println("Signal: $event")
    }

    private fun sendWhatsApp(event: Event) {
        println("WhatsApp: $event")
    }

    private fun sendSms(event: Event) {
        println("SMS: $event")
    }

    private fun sendSlack(event: Event) {
        println("Slack: $event")
    }

    private fun sendPush(event: Event) {
        println("Push: $event")
    }

    private fun sendMail(event: Event) {
        println("Email: $event")
    }
}
