package de.smartsquare.solidlint.dependencyinversion

import de.smartsquare.solidlint.Event
import de.smartsquare.solidlint.SecurityContext
import de.smartsquare.solidlint.UserSettings

/**
 * DIP is violated as indicated by excessive use of constructor parameters
 */
class DipUserNotification(
    private val securityContext: SecurityContext,
    private val notifiers: List<Notifier>
) {

    fun notifyUser(userSettings: UserSettings, event: Event) {
        if (!userSettings.notificationsActive ||
            securityContext.loggedInUser() == event.originator ||
            !userSettings.notifyFor(event.severity)
        ) {
            return
        }

        notifiers.forEach { it.sendNotification(userSettings, event) }
    }
}
