package collections

fun main() {
    val salarios = arrayOf(
            "2000".toBigDecimal(),
            "1000".toBigDecimal(),
            "3000".toBigDecimal())

    println("""""""")
    println(salarios.somatorio())

    println("""""""")
    println(salarios.media())
}