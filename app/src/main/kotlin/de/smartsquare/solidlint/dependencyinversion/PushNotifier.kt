package de.smartsquare.solidlint.dependencyinversion

import de.smartsquare.solidlint.Event
import de.smartsquare.solidlint.UserSettings

class PushNotifier : Notifier {
    override fun sendNotification(userSettings: UserSettings, event: Event) {
        if (userSettings.pushActive) {
            println("Push: $event")
        }
    }
}
