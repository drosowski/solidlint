package de.smartsquare.solidlint.liskovsubstitution

import de.smartsquare.solidlint.Event

/**
 * LSP is violated as indicated by empty functions in implementation
 * UnsupportedOperationException can also be an indicator.
 */
interface Notifier {

    fun notifySync(event: Event)

    fun notifyAsync(event: Event)
}
