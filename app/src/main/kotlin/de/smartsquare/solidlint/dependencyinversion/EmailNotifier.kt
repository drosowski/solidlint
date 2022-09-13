package de.smartsquare.solidlint.dependencyinversion

import de.smartsquare.solidlint.Event
import de.smartsquare.solidlint.UserSettings

class EmailNotifier : Notifier {
    override fun sendNotification(userSettings: UserSettings, event: Event) {
        if (userSettings.emailActive) {
            println("Email: $event")
        }
    }
}
