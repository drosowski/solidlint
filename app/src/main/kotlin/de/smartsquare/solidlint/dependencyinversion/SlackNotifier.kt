package de.smartsquare.solidlint.dependencyinversion

import de.smartsquare.solidlint.Event

class SlackNotifier {
    fun sendSlack(event: Event) {
        println("Slack: $event")
    }
}
