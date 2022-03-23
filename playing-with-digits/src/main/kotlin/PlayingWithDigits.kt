import kotlin.math.pow

object PlayingWithDigits {
    fun digPow(n: Int, p: Int): Int {
        val numStr = n.toString()
        val sumOfPowers = numStr.foldIndexed(0) { index: Int, acc: Int, char: Char ->
            val num = char.toString().toDouble()
            acc + num.pow(p + index).toInt()
        }

        return if (sumOfPowers % n == 0) sumOfPowers / n
        else -1
    }
}
