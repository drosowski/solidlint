package de.smartsquare.solidlint

data class UserSettings(
    val notificationsActive: Boolean = true,
    val notifyOnAndAbove: Event.Severity = Event.Severity.WARN,
    val emailActive: Boolean = true,
    val pushActive: Boolean = true,
    val smsActive: Boolean = true,
    val slackActive: Boolean = true,
    val whatsAppActive: Boolean = true,
    val signalActive: Boolean = true,
    val user: User = User(1, "bebob", "Be", "Bob", "bebob@somewhere.invalid"),
) {
    fun notifyFor(severity: Event.Severity) = severity.prio >= notifyOnAndAbove.prio
}
