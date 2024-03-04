//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun areaLosango(diagMaior: Double, diagMenor: Double): Double {
    return (diagMaior * diagMenor) / 2
}
    fun main() {
        val diagMaior = 10.0
        val digMenor = 5.0
        val area = areaLosango(diagMaior, digMenor)

        println("A área do Losango é: $area")
    }