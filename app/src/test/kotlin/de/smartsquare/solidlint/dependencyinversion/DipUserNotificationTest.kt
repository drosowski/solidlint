package de.smartsquare.solidlint.dependencyinversion

import de.smartsquare.solidlint.Event
import de.smartsquare.solidlint.SecurityContext
import de.smartsquare.solidlint.User
import de.smartsquare.solidlint.UserSettings
import org.amshove.kluent.shouldContainAll
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream

internal class DipUserNotificationTest {

    private lateinit var userNotification: DipUserNotification

    val outputStream = ByteArrayOutputStream()

    @Before
    fun setUp() {
        userNotification = DipUserNotification(
            SecurityContext(),
            EmailNotifier(),
            PushNotifier(),
            SlackNotifier(),
            WhatsAppNotifier(),
            SmsNotifier(),
            SignalNotifier()
        )
        System.setOut(PrintStream(outputStream))
    }

    @Test
    fun `should send every notification`() {
        val msg = "Hello world!"
        userNotification.notifyUser(
            UserSettings(),
            Event(
                msg = msg,
                severity = Event.Severity.WARN,
                originator = User(2, "barfoo", "Bar", "Foo", "barfoo@somewhere.invalid")
            )
        )

        val output = String(outputStream.toByteArray())
        output.shouldContainAll(
            "Email: Hello world!",
            "Push: Hello world!",
            "Signal: Hello world!",
            "Slack: Hello world!",
            "SMS: Hello world!",
            "WhatsApp: Hello world!"
        )
    }
}
