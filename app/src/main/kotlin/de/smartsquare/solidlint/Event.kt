package de.smartsquare.solidlint

data class Event(
    val msg: String,
    val severity: Severity,
    val originator: User
) {
    enum class Severity(
        val prio: Int
    ) {
        INFO(0), WARN(1), ERROR(2)
    }

    override fun toString(): String {
        return msg
    }
}
