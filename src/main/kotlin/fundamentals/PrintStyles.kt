package fundamentals

fun main() {
    //String interpolation and triple quotes

    var a = """what we write here as it is 
    it will be 
    printed
""".trimMargin(";")// this will only trim indent if there is some special character at the start of the string

    println(a)
//    var b = """what we write here as it is
//    it will be
//    printed
//""".trimIndent()// this will only trim indent and character

//   println(b)

    // print() prints all on the same line

    print("same")
    print("line\n")

    // println() prints all on the next line

    println("next")
    println("line")

    // $ format specifier used to print specific addressed data or computational data

    println("here is example ${1 + 2} of $ ")
    val num = 12
    println("here is example ${num} of $ ")

    //+ concatenation you can also use concatenation operator to attach data

    println("here is example " + 1 + 2 + " of + ")
    val num2 = 12
    println("here is example " + num2 + " of + ")


}

