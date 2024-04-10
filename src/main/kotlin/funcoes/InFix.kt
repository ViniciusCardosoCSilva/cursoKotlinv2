package funcoes

class Produto(val nome: String, val preco: Double)

infix fun Produto.maisCaroQue(produto: Produto):
        Boolean = this.preco > produto.preco

fun main(args: Array<String>) {
    val p1 = Produto("iPad", 2349.00)
    val p2 = Produto(preco = 3.48, nome = "Caneta")
    println(p1 maisCaroQue p2)
}