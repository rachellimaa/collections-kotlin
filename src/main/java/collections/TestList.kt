package collections

fun main() {
    val joao = Funcionario("Joao", 100.0, "CLT")
    val maria = Funcionario("Maria", 100000.0, "PJ")
    val jose = Funcionario("Jose", 1000.0, "CLT")

    val funcionario = listOf(joao, maria, jose)

    funcionario.forEach {
        println(it)
    }

    println("""""")
    println(funcionario.find { it.nome == "Maria" })

    println("""""")
    funcionario.sortedBy { it.salario }.forEach {
        println(it)
    }

    println("""""")
    funcionario.groupBy { it.tipo }.forEach {
        println(it)
    }

}

