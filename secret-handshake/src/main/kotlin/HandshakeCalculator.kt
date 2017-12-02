import Signal.*

object HandshakeCalculator {

    fun calculateHandshake(decimal: Int): List<Signal> = Integer
            .toBinaryString(decimal)
            .reversed()
            .toList()
            .zip(listOf(WINK, DOUBLE_BLINK, CLOSE_YOUR_EYES, JUMP))
            .fold(emptyList<Signal>()) { acc: List<Signal>, handShakeMapping: Pair<Char, Signal> ->
                if (handShakeMapping.first == '1') acc.plus(handShakeMapping.second) else acc
            }
            .let { result -> result.takeIf { decimal < 16 } ?: result.reversed() }

}