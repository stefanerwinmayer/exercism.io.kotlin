object Hamming {
    fun compute(strandA: String, strandB: String): Int {
        require(strandA.length == strandB.length) { "left and right strands must be of equal length." }

        return strandA
                .zip(strandB)
                .count { (nucleotideA, nucleotideB) -> nucleotideA != nucleotideB }
    }
}