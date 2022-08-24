package de.smartsquare.solidlint.dependencyinversion

import de.smartsquare.solidlint.Event

class EmailNotifier {
    fun sendMail(event: Event) {
        println("Email: $event")
    }
}
