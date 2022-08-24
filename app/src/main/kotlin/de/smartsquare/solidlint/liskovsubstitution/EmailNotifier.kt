package de.smartsquare.solidlint.liskovsubstitution

import de.smartsquare.solidlint.Event

class EmailNotifier : Notifier {

    @Suppress("EmptyFunctionBlock")
    override fun notifySync(event: Event) {
    }

    override fun notifyAsync(event: Event) {
        println("Async notification email")
    }
}
