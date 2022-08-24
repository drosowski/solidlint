package de.smartsquare.solidlint.dependencyinversion

import de.smartsquare.solidlint.Event

class SmsNotifier {
    fun sendSms(event: Event) {
        println("SMS: $event")
    }
}
