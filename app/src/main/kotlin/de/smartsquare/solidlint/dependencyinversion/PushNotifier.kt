package de.smartsquare.solidlint.dependencyinversion

import de.smartsquare.solidlint.Event

class PushNotifier {
    fun sendPush(event: Event) {
        println("Push: $event")
    }
}
