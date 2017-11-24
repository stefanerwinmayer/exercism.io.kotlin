fun transcribeToRna(dna: String): String =
        when (dna) {
            "C" -> "G"
            "G" -> "C"
            "T" -> "A"
            "A" -> "U"
            else -> transcribeToRna(dna.take(1)) + transcribeToRna(dna.drop(1))
        }