package de.smartsquare.solidlint.dependencyinversion

import de.smartsquare.solidlint.Event
import de.smartsquare.solidlint.UserSettings

class SmsNotifier : Notifier {
    override fun sendNotification(userSettings: UserSettings, event: Event) {
        if (userSettings.smsActive) {
            println("SMS: $event")
        }
    }
}
