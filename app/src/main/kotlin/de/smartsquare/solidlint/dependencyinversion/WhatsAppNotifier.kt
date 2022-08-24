package de.smartsquare.solidlint.dependencyinversion

import de.smartsquare.solidlint.Event

class WhatsAppNotifier {
    fun sendWhatsApp(event: Event) {
        println("WhatsApp: $event")
    }
}
