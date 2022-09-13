package de.smartsquare.solidlint.dependencyinversion

import de.smartsquare.solidlint.Event
import de.smartsquare.solidlint.UserSettings

interface Notifier {
    fun sendNotification(userSettings: UserSettings, event: Event)
}
