//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun AreaTrapezio(baseMaior: Double, baseMenor: Double, altura: Double): Double {
    return ((baseMaior + baseMenor) * altura) / 2
}
    fun main() {
        val baseMaior = 5.0
        val baseMenor = 5.0
        val altura = 5.0
        val area = AreaTrapezio(baseMaior, baseMenor, altura)

        println("A área do Trapézio é: $area")
    }