package de.smartsquare.solidlint.liskovsubstitution

class SomeProcessor : Processor() {

    @Suppress("EmptyFunctionBlock")
    override fun preprocess() {
    }

    override fun postprocess() {
        // do something
    }
}
