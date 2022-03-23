import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class RectangleIntoSquaresTest {
    @Test
    fun `return null if length = width`() {
        assertNull(RectangleIntoSquares.sqInRect(4, 4))
    }

    @Test
    fun `returns the right amount of squares when length is 5 and width is 3`() {
        assertEquals(listOf(3, 2, 1, 1), RectangleIntoSquares.sqInRect(5, 3))
    }

    @Test
    fun `returns the right amount of squares when length is 20 and width is 14`() {
        assertEquals(listOf(14, 6, 6, 2, 2, 2), RectangleIntoSquares.sqInRect(20, 14))
    }
}
