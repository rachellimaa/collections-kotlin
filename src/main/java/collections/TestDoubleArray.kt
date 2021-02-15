package collections

fun main(){
//    val salarios = DoubleArray(3)

    val salarios = doubleArrayOf(100.0, 50.0, 1.0)

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario
    }

    salarios.forEach {
        println(it)
    }
}