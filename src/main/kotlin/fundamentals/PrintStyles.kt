package fundamentals

fun main() {
    var a = """what we write here as it is 
    ;it will be 
    ;printed
""".trimMargin(";")// this will only trim indent if there is some special character at the start of the string

    println(a)
    var b = """what we write here as it is 
    ;it will be 
    ;printed
""".trimIndent()// this will only trim indent and character

    println(a)
}

