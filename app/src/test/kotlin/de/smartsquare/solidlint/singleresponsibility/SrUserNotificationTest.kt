package de.smartsquare.solidlint.singleresponsibility

import de.smartsquare.solidlint.Event
import de.smartsquare.solidlint.SecurityContext
import de.smartsquare.solidlint.User
import de.smartsquare.solidlint.UserSettings
import org.amshove.kluent.shouldContainAll
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class SrUserNotificationTest {
    private lateinit var userNotification: SrUserNotification

    val outputStream = ByteArrayOutputStream()

    @Before
    fun setUp() {
        val notificationSettings = NotificationSettings()
        userNotification = SrUserNotification(
            SecurityContext(),
            EmailNotifier(notificationSettings),
            PushNotifier(notificationSettings),
            SlackNotifier(notificationSettings),
            SmsNotifier(notificationSettings),
            WhatsAppNotifier(notificationSettings),
            SignalNotifier(notificationSettings)
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
            "Slack: Hello world!",
            "SMS: Hello world!",
            "WhatsApp: Hello world!"
        )
    }
}
