package de.smartsquare.solidlint.openclose

val decorators = mapOf(
    DecoratorType.YELL to { msg: String -> msg.uppercase() },
    DecoratorType.WHISPER to { msg: String -> msg.lowercase() },
    DecoratorType.CAMEL to { msg: String -> msg.capitalize() },
    DecoratorType.LEET to { msg: String -> msg },
    DecoratorType.GREEN to { msg: String -> msg },
    DecoratorType.RED to { msg: String -> msg },
    DecoratorType.YELLOW to { msg: String -> msg },
    DecoratorType.BLUE to { msg: String -> msg },
    DecoratorType.BLACK to { msg: String -> msg },
    DecoratorType.WHITE to { msg: String -> msg }
)
