fun AreaRetangulo(base: Double, altura: Double): Double {
    return base * altura
}

fun main() {
    val base = 8.65
    val altura = 5.45
    val area = AreaRetangulo(base, altura)

    println("A área do retângulo de base $base e altura $altura é: $area")
}