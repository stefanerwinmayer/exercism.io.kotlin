import java.lang.Character.getNumericValue
import java.lang.Character.isDigit

class Series(private val digits: String) {

    init {
        require(digits.all(::isDigit))
    }

    fun getLargestProduct(subSeriesLength: Int): Int {

        require(subSeriesLength in 0..digits.length)

        return if (subSeriesLength == 0) 1
        else digits
                .map(::getNumericValue)
                .windowed(size = subSeriesLength)
                .map { it.reduce { product, number -> product * number } }
                .max()
                ?: 0
    }
}