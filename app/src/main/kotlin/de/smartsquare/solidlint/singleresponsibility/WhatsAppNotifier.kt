package de.smartsquare.solidlint.singleresponsibility

import de.smartsquare.solidlint.Event

class WhatsAppNotifier(private val notificationSettings: NotificationSettings) {

    fun sendWhatsApp(event: Event) {
        if (notificationSettings.whatsappSettings() != null) {
            println("WhatsApp: $event")
        }
    }
}
