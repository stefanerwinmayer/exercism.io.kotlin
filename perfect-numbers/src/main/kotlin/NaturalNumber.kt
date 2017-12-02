import Classification.*

enum class Classification {
    DEFICIENT, PERFECT, ABUNDANT
}

fun classify(naturalNumber: Int): Classification =
        naturalNumber.let {
            require(it >= 1)

            return when {
                it.aliquotSum() < it -> DEFICIENT
                it.aliquotSum() == it -> PERFECT
                else -> ABUNDANT
            }
        }

private fun Int.aliquotSum(): Int = this
        .factors()
        .dropLast(1)
        .sum()

private fun Int.factors(): List<Int> = (1..this).filter { this % it == 0 }
