package de.smartsquare.solidlint.dependencyinversion

import de.smartsquare.solidlint.Event
import de.smartsquare.solidlint.UserSettings

class SignalNotifier : Notifier {
    override fun sendNotification(userSettings: UserSettings, event: Event) {
        if (userSettings.signalActive) {
            println("Signal: $event")
        }
    }
}
