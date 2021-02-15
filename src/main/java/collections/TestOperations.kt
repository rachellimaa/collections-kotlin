package collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 10.0, 2.0, 6000.0)

    println("maior ${salarios.maxOrNull()}")
    println("menor ${salarios.minOrNull()}")
    println("media ${salarios.average()}")

    println("""""""""""""")

    val salariosMaior2500 = salarios.filter { it > 2500}

    salariosMaior2500.forEach {
        println(it)
    }

    println("""""""""""""")
    println(salarios.count { it in 1000.0..6000.0})

    println("""""""""""""")
    println(salarios.find { it==1000.0})
    println(salarios.find { it==500.0})

    println("""""""""""""")
    println(salarios.any { it==1000.0})
    println(salarios.any { it==1.0})
}