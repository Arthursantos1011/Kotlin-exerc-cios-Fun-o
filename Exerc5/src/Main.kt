fun AreaCircunferencia(raio: Double): Double {
    return Math.PI * raio * raio
}


fun main() {
        val raio = 1.0
        val area = AreaCircunferencia(raio)

        println("A área da Circunferencia é: $area")
    }