object MultiplesOf3Or5 {
    fun solution(number: Int): Int {
        if (number < 0) {
            return 0
        }

        return (0 until number).filter { num ->
            num % 3 == 0 || num % 5 == 0
        }.sum()
    }
}
