object MaximumSubarraySum {
    fun maxSequence(arr: List<Int>): Int {
        if (arr.isEmpty()) return 0
        if (arr.size == 1 && arr.first() < 0) return 0
        if (arr.size == 1) return arr.first()

        var startPointer = 0
        var endPointer = arr.lastIndex
        var total: Int
        var max = 0
        while (endPointer != 1) {

            for (j in startPointer..endPointer) {
                val series = arr.subList(j, endPointer + 1)
                total = series.sum()
                if (total > max) max = total
            }

            startPointer++
            if (startPointer == endPointer) {
                endPointer--
                startPointer = 0
            }
        }

        return max
    }
}
