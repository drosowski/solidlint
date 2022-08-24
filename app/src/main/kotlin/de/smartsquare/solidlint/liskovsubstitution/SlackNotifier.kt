package de.smartsquare.solidlint.liskovsubstitution

import de.smartsquare.solidlint.Event

class SlackNotifier : Notifier {
    override fun notifySync(event: Event) {
        println("Sync notification slack")
    }

    @Suppress("EmptyFunctionBlock")
    override fun notifyAsync(event: Event) {
    }
}
