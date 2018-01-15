import java.math.BigInteger

object Board {

    private val cache = mutableMapOf<Int, BigInteger>()

    fun getGrainCountForSquare(squareNo: Int): BigInteger {

        require(squareNo in 1..64) { "Only integers between 1 and 64 (inclusive) are allowed" }

        return cache.getOrPut(squareNo) {
            if (squareNo == 1) BigInteger.ONE
            else getGrainCountForSquare(squareNo - 1) * BigInteger("2")
        }
    }

    fun getTotalGrainCount(): BigInteger =
            (1..64).fold(BigInteger.ZERO) { acc, i -> acc + getGrainCountForSquare(i) }

}