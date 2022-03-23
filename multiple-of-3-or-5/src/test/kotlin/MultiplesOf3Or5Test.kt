import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class MultiplesOf3Or5Test {
    @Test
    fun `returns 0 if number passed in is negative`() {
        assertTrue(MultiplesOf3Or5.solution(-1) == 0)
    }

    @Test
    fun `returns 23 when number passed in is 10`() {
        assertEquals(23, MultiplesOf3Or5.solution(10))
    }

    @Test
    fun `returns 78 when number passed in is 20`() {
        assertEquals(78, MultiplesOf3Or5.solution(20))
    }

    @Test
    fun `returns 9168 when number passed in is 200`() {
        assertEquals(9168, MultiplesOf3Or5.solution(200))
    }
}
