fun main() {
    println("Bem vindo ao Bytebank")
    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1000
    contaAlex.saldo = 200.00
    contaAlex.agencia = 2
    // instancia => obj

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.saldo = 300.00
    contaFran.agencia = 1

//    println("\nTitular:\n" + contaAlex.titular + "\nConta:\n" + contaAlex.numero + "\nAgência:\n" + contaAlex.agencia)
//    println("\nTitular:\n" + contaFran.titular + "\nConta:\n" + contaFran.numero + "\nAgência:\n" + contaFran.agencia)

    println("Titular: ${contaFran.titular} \nConta:  ${contaFran.numero}  \nAgência:  ${contaFran.agencia}")
    println("Titular: ${contaAlex.titular} \nConta: ${contaAlex.numero}  \nAgência:  ${contaAlex.agencia}")
}

//primeira letra smp em maiusculo
class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
    var agencia = 1
}


fun testaLacos() {
    var i = 0
    while (i < 5) {
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0


        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta \n$saldo")
        i++
    }
}

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }

    //o when acima é equivalente ao if abaixo
    if (saldo > 0.0) {
        println("Conta é positiva")
    } else if (saldo == 0.0) {
        println("conta é neutra")
    } else {
        println("Conta é negativa")
    }
}