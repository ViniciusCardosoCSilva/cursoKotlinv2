package funcoes

fun ordenar(vararg numeos: Int): IntArray{
    return numeos.sortedArray()
}

fun main() {
    for (n in ordenar(38, 3, 456, 8, 51, 1, 88, 79)){
        println("$n ")
    }

}