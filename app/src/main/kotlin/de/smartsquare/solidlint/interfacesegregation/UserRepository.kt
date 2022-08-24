package de.smartsquare.solidlint.interfacesegregation

import de.smartsquare.solidlint.User

/**
 * ISP is violated as indicated by too many functions
 */
@Suppress("TooManyFunctions")
interface UserRepository {

    fun findById(id: Long): User?

    fun findByEmail(email: String): User?

    fun findByUsername(username: String): User?

    fun findAllByLastName(lastName: String): Iterable<User>

    fun save(user: User)

    fun update(id: Long)

    fun delete(user: User)

    fun deleteById(id: Long)

    fun deleteByUsername(username: String)

    fun deleteByEmail(email: String)

    fun deleteAll()
}
