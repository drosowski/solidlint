package de.smartsquare.solidlint.dependencyinversion

import de.smartsquare.solidlint.Event
import de.smartsquare.solidlint.UserSettings

class WhatsAppNotifier : Notifier {
    override fun sendNotification(userSettings: UserSettings, event: Event) {
        if (userSettings.whatsAppActive) {
            println("WhatsApp: $event")
        }
    }
}
