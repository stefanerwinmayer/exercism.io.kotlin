object SumOfMultiples {

    fun sum(numbers: Set<Int>, ceiling: Int): Int = numbers
            .flatMap { it until ceiling step it }
            .toSet()
            .sum()

}