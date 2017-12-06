import java.lang.Character.getNumericValue
import java.lang.Character.isDigit

object Luhn {
    fun isValid(id: String): Boolean = id
            .replace(oldValue = " ", newValue = "")
            .takeIf { it.length > 1 && it.all(::isDigit) }
            ?.map(::getNumericValue)
            ?.asReversed()
            ?.mapIndexed { index, number ->
                if (index % 2 != 0 && number != 9) number * 2 % 9
                else number
            }
            ?.sum()
            ?.rem(10) == 0

}