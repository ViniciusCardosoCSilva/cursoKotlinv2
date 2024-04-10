import kotlin.math.pow
fun main() {
    println("Digite o primeiro número (n1): ")
    val n1 = readLine()?.toFloatOrNull()
    println("Digite o segundo número (n2): ")
    val n2 = readLine()?.toFloatOrNull()
    println("Digite a operação desejada (1 para: Adição, 2 para: Subtração, 3 para: Multiplicação, 4 para: Divisão, 5 para: Fatorial, 6 para: Potência, 7 para: Porcentagem): ")
   val select = readLine()?.toIntOrNull()
    if (n1 != null && n2 != null && select != null) {
        println(calculate(n1, n2, select))
   } else {
        println("Entrada inválida.")
    }
}
fun calculate(a:Float?,b:Float?,s:Int?):String{
    val result:Float
    val op:String
    when{
        a==null -> {
            op="\nNão foi possível calcular!\n"+
                    """Valor de "n1" é do tipo nulo!"""
        }
        b==null -> {
            op="\nNão foi possível calcular!\n"+
                    """Valor de "n2" é do tipo nulo!"""
        }
        s==null -> {
            op="\nNão foi possível calcular!\n"+
                    """Valor de "select" é do tipo nulo!"""
        }
        s==1 -> {
            result=a+b
            op="\n$a + $b = $result"
        }
        s==2 -> {
            result=a-b
            op="\n$a - $b = $result"
        }
        s==3 -> {
            result=a*b
            op="\n$a × $b = $result"
        }
        s==4 -> {
            result=a/b
            val remainder: Float = a%b
            op="\n$a ÷ $b = $result\n" +
                    "Resto: $remainder"
        }
        s==5 -> {
            var factorial=1
            for(i in 1..a.toInt()) factorial*=i
            op="\n${String.format("%.0f",a)}! = $factorial"
        }
        s==6 -> {
            result= a.pow(b)
            op="\n$a ^ $b = $result"
        }
        s==7 -> {
            result=(a/100)*b
            op="\n$a% de $b = ${String.format("%.2f",result)}"
        }
        else ->{op="\nOpção inválida!"}
    }
    return op
}