fun areaTrianguloEscaleno(a: Double, b: Double, c: Double): Double {
    val s = (a + b + c) / 2
    return Math.sqrt(s * (s - a) * (s - b) * (s - c))
}

fun main() {
    val a = 9.0
    val b = 7.0
    val c = 14.0
    val area = areaTrianguloEscaleno(a, b, c)

    println("A área do Triângulo Escaleno é: $area")
}