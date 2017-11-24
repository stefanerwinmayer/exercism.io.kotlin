val letters = CharRange('a', 'z').toList()

object Pangram {
    fun isPangram(sentence: String): Boolean =
            sentence.toLowerCase()
                    .toList()
                    .containsAll(letters)
}
