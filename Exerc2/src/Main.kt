fun AreaTrianguloEquilatero(lado: Double): Double {
    return (Math.sqrt(3.0) / 4) * lado * lado
}

fun main(args: Array<String>) {
    val lado = 12.0
    val area = AreaTrianguloEquilatero(lado)

    println("A área do Triangulo Equilatero é: $area")
}



