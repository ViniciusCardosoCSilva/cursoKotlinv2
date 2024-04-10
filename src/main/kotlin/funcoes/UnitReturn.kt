package funcoes

fun imprimeMaior1(a: Int, b: Int){
    println(a.coerceAtLeast(b))
}

fun imprimeMaior2(a : Int, b: Int){
    println(a.coerceAtLeast(b))
}

fun imprimeMaior3(a: Int, b: Int){
    println(a.coerceAtLeast(b))
    return
}

fun imprimeMaior4(a: Int, b: Int){
    println(a.coerceAtLeast(b))
    return Unit
}

fun imprimeMaior5(a: Int,b: Int){
    println(a.coerceAtLeast(b))
}

fun main() {
    imprimeMaior1(2,3)
    imprimeMaior2(2,3)

}