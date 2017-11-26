val numberToStringMap = mapOf(
        3 to "Pling",
        5 to "Plang",
        7 to "Plong"
)

object Raindrops {

    fun convert(number: Int): String = numberToStringMap
            .filterKeys { factor -> number.rem(factor) == 0 }
            .values.joinToString("")
            .takeUnless { it.isEmpty() } ?: number.toString()

}