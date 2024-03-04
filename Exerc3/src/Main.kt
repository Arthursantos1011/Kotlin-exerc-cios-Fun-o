fun AreaTrianguloIsosceles(base: Double, altura: Double): Double {
    return (base * altura) / 2
}

fun main() {
    val base = 10.0
    val altura = 10.0
    val area = AreaTrianguloIsosceles(base, altura)

    println("A área do Triângulo Isósceles de base $base e altura $altura é: $area")
}