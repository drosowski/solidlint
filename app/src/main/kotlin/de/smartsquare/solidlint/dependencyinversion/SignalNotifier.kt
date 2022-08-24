package de.smartsquare.solidlint.dependencyinversion

import de.smartsquare.solidlint.Event

class SignalNotifier {
    fun sendSignal(event: Event) {
        println("Signal: $event")
    }
}
