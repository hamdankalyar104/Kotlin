import java.util.*

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)
    var firstNum : Double
    var secondNum : Double
    var sign : Char
    println("Enter First Num : ")
    firstNum = input.nextDouble()
    println("Enter Second Num : ")
    secondNum = input.nextDouble()
    println("Enter Opreation : ")
    sign = input.next().single()
    println("Result is ")
    when(sign){

        '+' -> println(firstNum + secondNum)
        '-' -> println(firstNum - secondNum)
        '*' -> println(firstNum * secondNum)
        '/' -> println(firstNum / secondNum)
    }
}


