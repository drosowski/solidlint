package de.smartsquare.solidlint.singleresponsibility

import de.smartsquare.solidlint.Event

class PushNotifier(private val notificationSettings: NotificationSettings) {

    fun sendPush(event: Event) {
        if (notificationSettings.pushSettings() != null) {
            println("Push: $event")
        }
    }
}
