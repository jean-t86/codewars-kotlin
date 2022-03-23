import kotlin.math.min

object RectangleIntoSquares {
    fun sqInRect(length: Int, width: Int): List<Int>? {
        if (length == width) return null

        var mutableLength = length
        var mutableWidth = width

        val squares = mutableListOf<Int>()
        do {
            val smallestDimension = min(mutableLength, mutableWidth)
            squares.add(smallestDimension)
            if (mutableLength == smallestDimension) {
                mutableWidth -= smallestDimension
            } else {
                mutableLength -= smallestDimension
            }
        } while (smallestDimension != 0)
        squares.removeIf { it == 0 }

        return squares
    }
}
