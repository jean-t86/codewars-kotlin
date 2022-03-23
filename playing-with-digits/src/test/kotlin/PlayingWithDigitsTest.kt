import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PlayingWithDigitsTest {
    @Test
    fun `when n is 89, k is 1`() {
        val actual = PlayingWithDigits.digPow(89, 1)

        assertEquals(1, actual)
    }

    @Test
    fun `when n is 46288, k is 51`() {
        val actual = PlayingWithDigits.digPow(46288, 3)

        assertEquals(51, actual)
    }

    @Test
    fun `when n is 92, k is -1`() {
        val actual = PlayingWithDigits.digPow(92, 1)

        assertEquals(-1, actual)
    }
}
