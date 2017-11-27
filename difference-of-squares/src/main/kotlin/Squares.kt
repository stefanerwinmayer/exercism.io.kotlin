fun Int.square(): Int = this * this

class Squares(ceiling: Int) {

    private val numbers = 1..ceiling

    fun squareOfSum(): Int = numbers.sum().square()

    fun sumOfSquares(): Int = numbers.map(Int::square).sum()

    fun difference(): Int = squareOfSum() - sumOfSquares()

}