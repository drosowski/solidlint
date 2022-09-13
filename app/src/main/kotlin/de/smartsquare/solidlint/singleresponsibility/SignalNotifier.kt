package de.smartsquare.solidlint.singleresponsibility

import de.smartsquare.solidlint.Event

class SignalNotifier(private val notificationSettings: NotificationSettings) {

    fun sendSignal(event: Event) {
        if (notificationSettings.signalSettings() != null) {
            println("Signal: $event")
        }
    }
}
