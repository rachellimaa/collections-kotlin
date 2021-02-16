package collections

fun main() {
    val joao = Funcionario("Joao", 100.0, "CLT")
    val maria = Funcionario("Maria", 100000.0, "PJ")
    val jose = Funcionario("Jose", 1000.0, "CLT")

    println("""""List"""")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.add(jose)

    funcionarios.remove(maria)

    funcionarios.forEach {
        println(it)
    }

    println("""""Set"""")

    val funcionarioSet = mutableSetOf(joao)

    funcionarioSet.add(jose)
    funcionarioSet.add(maria)

    funcionarioSet.remove(jose)
    funcionarioSet.forEach {
        println(it)
    }

}