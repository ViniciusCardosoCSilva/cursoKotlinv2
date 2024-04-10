package funcoes

fun relacaoDeTrabalho(chefe: String, funcionario: String): String {
    return "$funcionario é subordinado à $chefe"
}

fun main(){
    println(relacaoDeTrabalho("Joao", "Maria"))
    println(relacaoDeTrabalho(funcionario = "Joao", chefe = "Maria"))
}