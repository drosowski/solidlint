package de.smartsquare.solidlint.openclose

/**
 * OCP is violated as indicated by too many functions.
 * Other indicators include cyclic complexity or large class.
 */
class MessageDecorator {

    fun decorate(msg: String, decorationType: Type): String {
        val decorator = checkNotNull(decorators[decorationType])
        return decorator(msg)
    }

    val decorators = mapOf(
        Type.YELL to { msg: String -> msg.uppercase() },
        Type.WHISPER to { msg: String -> msg.lowercase() },
        Type.CAMEL to { msg: String -> msg.capitalize() },
        Type.LEET to { msg: String -> msg },
        Type.GREEN to { msg: String -> msg },
        Type.RED to { msg: String -> msg },
        Type.YELLOW to { msg: String -> msg },
        Type.BLUE to { msg: String -> msg },
        Type.BLACK to { msg: String -> msg },
        Type.WHITE to { msg: String -> msg }
    )

    enum class Type {
        YELL, WHISPER, CAMEL, LEET, GREEN, RED, YELLOW, BLUE, BLACK, WHITE
    }
}
