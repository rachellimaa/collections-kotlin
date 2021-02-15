package collections

fun main(){
    val nomes = Array(5){""}
    nomes[0] = "Maria"
    nomes[1] = "João"
    nomes[2] = "Paulo"
    nomes[3] = "José"
    nomes[4] = "Rachel"

    nomes.forEach {
        println(it)
    }

    println("""""""")

    val nomes2 = arrayOf("teste", "test2")
    nomes2.forEach {
        println(it)
    }
}