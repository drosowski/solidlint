package de.smartsquare.solidlint

class SecurityContext {
    fun loggedInUser() = User(1, "foobar", "Foo", "Bar", "foobar@somewhere.invalid")
}
