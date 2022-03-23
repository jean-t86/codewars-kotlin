import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MaximumSubarraySumTest {
    @Test
    fun `returns 0 when input array is empty`() {
        val actual = MaximumSubarraySum.maxSequence(listOf())

        assertEquals(0, actual)
    }

    @Test
    fun `properly returns the correct maximum sum of a contiguous series`() {
        val actual = MaximumSubarraySum.maxSequence(listOf(-2, 1, -3, 4, -1, 2, 1, -5, 4))

        assertEquals(6, actual)
    }

    @Test
    fun `given list should return 360`() {
        val list = listOf(23, -42, 55, 27, 59, 24, -43, 67, 80, 68, 23, -49, -37, 74)
        val actual = MaximumSubarraySum.maxSequence(list)

        assertEquals(360, actual)
    }

    @Test
    fun `given list should return 509`() {
        val list = listOf(
            -14, 21, 31, 65, -28, 27, -45, -9, -41, 80, 21, 8, -9, 16, 30, -1, 4, 88, 69, -5, -28, 94,
            -33, 27, 89, -43, 34, 1, -30, 76
        )
        val actual = MaximumSubarraySum.maxSequence(list)

        assertEquals(509, actual)
    }

    @Test
    fun `given list should return 997`() {
        val list = listOf(
            35, 9, 34, -15, 54, 48, 69, -47, 80, -44, 26, 28, 20, 79, -23, -17, 89, -7, 88, 74, 57, 0,
            52, 29, 82, 52, 63, 82
        )
        val actual = MaximumSubarraySum.maxSequence(list)

        assertEquals(997, actual)
    }

    @Test
    fun `given list with only one negative number it should return 0`() {
        val list = listOf(-11)
        val actual = MaximumSubarraySum.maxSequence(list)

        assertEquals(0, actual)
    }

    @Test
    fun `given list with only one positive number it should return that number`() {
        val list = listOf(68)
        val actual = MaximumSubarraySum.maxSequence(list)

        assertEquals(68, actual)
    }
}
