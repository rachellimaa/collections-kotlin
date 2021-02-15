package collections

fun main(){
    val values = IntArray(5)
    values[0] = 1
    values[1] = 2
    values[2] = 3
    values[3] = 4
    values[4] = 5

    /*for (va in values) {
        println(va)
    }*/

  /*  values.forEach {
        println(it)
    }*/
    values.sort()
    for (index in values.indices){
        println(values[index])
    }
}