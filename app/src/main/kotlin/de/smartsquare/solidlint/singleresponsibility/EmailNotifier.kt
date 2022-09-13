package de.smartsquare.solidlint.singleresponsibility

import de.smartsquare.solidlint.Event

class EmailNotifier(private val notificationSettings: NotificationSettings) {
    fun sendMail(event: Event) {
        if (notificationSettings.emailSettings() != null) {
            println("Email: $event")
        }
    }
}
