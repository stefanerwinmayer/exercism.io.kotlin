object Acronym {
    fun generate(phrase: String): String = phrase
            .split(" ", "-")
            .fold("") { acronym, word -> acronym + word.first().toUpperCase() }
}