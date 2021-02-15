package collections

fun main() {
    val joao = Funcionario("Joao", 100.0, "CLT")
    val maria = Funcionario("Maria", 100000.0, "PJ")
    val jose = Funcionario("Jose", 1000.0, "CLT")

    val funcionario1 = setOf(joao, jose)
    val funcionario2 = setOf(maria)

    val resultUnion = funcionario1.union(funcionario2)
    resultUnion.forEach { println(it) }

    println("""""""")
    val funcionario3 = setOf(joao, jose,maria)
    val resultSub = funcionario3.subtract(funcionario2)
    resultSub.forEach { println(it) }

    println("""""""")
    val resultIntersect = funcionario3.intersect(funcionario2)
    resultIntersect.forEach { println(it) }
}