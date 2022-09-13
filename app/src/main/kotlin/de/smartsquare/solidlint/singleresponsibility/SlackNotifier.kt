package de.smartsquare.solidlint.singleresponsibility

import de.smartsquare.solidlint.Event

class SlackNotifier(private val notificationSettings: NotificationSettings) {

    fun sendSlack(event: Event) {
        if (notificationSettings.slackSettings() != null) {
            println("Slack: $event")
        }
    }
}
