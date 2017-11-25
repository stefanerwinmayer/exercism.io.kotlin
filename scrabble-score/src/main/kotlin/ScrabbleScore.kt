object ScrabbleScore {
    fun scoreWord(input: String): Int = input.fold(0) { score, letter ->
        score + when (letter.toUpperCase()) {
            'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T' -> 1
            'D', 'G' -> 2
            'B', 'C', 'M', 'P' -> 3
            'F', 'H', 'V', 'W', 'Y' -> 4
            'K' -> 5
            'J', 'X' -> 8
            'Q', 'Z' -> 10
            else -> throw IllegalArgumentException("Input not a letter")
        }
    }

}