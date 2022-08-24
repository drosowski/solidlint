package de.smartsquare.solidlint.liskovsubstitution

abstract class Processor {

    abstract fun preprocess()

    fun process() {
        preprocess()

        // do something

        postprocess()
    }

    abstract fun postprocess()
}
