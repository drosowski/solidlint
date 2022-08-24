package de.smartsquare.solidlint.openclose

/**
 * OCP is violated as indicated by too many functions.
 * Other indicators include cyclic complexity or large class.
 */
@Suppress("TooManyFunctions")
class MessageDecorator {

    fun decorate(msg: String, decorationType: Type): String {
        return when (decorationType) {
            Type.YELL -> yell(msg)
            Type.WHISPER -> whisper(msg)
            Type.CAMEL -> camel(msg)
            Type.LEET -> leet(msg)
            Type.GREEN -> green(msg)
            Type.RED -> red(msg)
            Type.YELLOW -> yellow(msg)
            Type.BLUE -> blue(msg)
            Type.BLACK -> black(msg)
            Type.WHITE -> white(msg)
        }
    }

    private fun yell(msg: String): String {
        return msg.uppercase()
    }

    private fun whisper(msg: String): String {
        return msg.lowercase()
    }

    private fun camel(msg: String): String {
        return msg.capitalize()
    }

    private fun leet(msg: String): String {
        return msg
    }

    private fun green(msg: String): String {
        return msg
    }

    private fun red(msg: String): String {
        return msg
    }

    private fun yellow(msg: String): String {
        return msg
    }

    private fun blue(msg: String): String {
        return msg
    }

    private fun black(msg: String): String {
        return msg
    }

    private fun white(msg: String): String {
        return msg
    }

    enum class Type {
        YELL, WHISPER, CAMEL, LEET, GREEN, RED, YELLOW, BLUE, BLACK, WHITE
    }
}
