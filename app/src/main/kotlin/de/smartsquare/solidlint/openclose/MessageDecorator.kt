package de.smartsquare.solidlint.openclose

/**
 * OCP is violated as indicated by too many functions.
 * Other indicators include cyclic complexity or large class.
 */
class MessageDecorator {

    fun decorate(msg: String, decorationType: DecoratorType): String {
        val decorator = checkNotNull(decorators[decorationType])
        return decorator(msg)
    }
}
