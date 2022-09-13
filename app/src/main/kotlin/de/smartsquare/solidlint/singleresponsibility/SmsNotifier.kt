package de.smartsquare.solidlint.singleresponsibility

import de.smartsquare.solidlint.Event

class SmsNotifier(private val notificationSettings: NotificationSettings) {

    fun sendSms(event: Event) {
        if (notificationSettings.smsSettings() != null) {
            println("SMS: $event")
        }
    }
}
