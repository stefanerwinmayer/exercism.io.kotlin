class Triangle(a: Double, b: Double, c: Double) {

    constructor(a: Number, b: Number, c: Number) : this(a.toDouble(), b.toDouble(), c.toDouble())

    init {
        require(a > 0 && b > 0 && c > 0)
        require(a < b + c && b < a + c && c < a + b)
    }

    val isEquilateral: Boolean = a == b && a == c && b == c
    val isScalene: Boolean = a != b && a != c && b != c
    val isIsosceles: Boolean = !isScalene

}