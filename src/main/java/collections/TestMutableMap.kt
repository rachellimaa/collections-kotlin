package collections

fun main() {
    val joao = Funcionario("Joao", 100.0, "CLT")
    val maria = Funcionario("Maria", 100000.0, "PJ")
    val jose = Funcionario("Jose", 1000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(maria.nome, maria)
    repositorio.create(jose.nome, jose)

    println(repositorio.findById(joao.nome))

    println(""""""""")
    repositorio.findAll().forEach { println(it) }

    println(""""""""")
    repositorio.remove(joao.nome)
    repositorio.findAll().forEach { println(it) }

}