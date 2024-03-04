package  funcoes

fun main(args: Array<String>) {
    for(n in ordenar(38, 456, 8, 51, 1, 88, 73)) {
        println("$n")
    }
}

fun ordenar(vararg numeros: Int): IntArray {
    return numeros.sortedArray()
}
