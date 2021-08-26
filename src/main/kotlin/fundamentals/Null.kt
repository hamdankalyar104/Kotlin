package fundamentals
/*  1.what is null ?
    *null is literal, and it means nothing
    2.type of null ?
    * any referenced type like enums,class,array etc.
    3.how we can assign type to null
    * using dataType? like String?
    4.why we use null ?
    * we used null to delocalized or dereference a variable in memory.
    * used where no instant value is used and value should be used assign later
*/
// main feature of kotlin is null safety
/*
null is the thing that can crash your whole application as there is quote that "it is of billion-dollar mistake"
* how it can crash application ?
if we define any variable to nll then using .length to find it length than if there is null program crashes and here we get nullPointerException
so for this problem kotlin gives surity parameters to avoid nullPointerException.
* let's talk about kotlin null safety
in kotlin all data types have further two types nullable and non-nullable
 */
fun main() {
    // variable is declared as non-nullable
    var s1 : String = "Geeks"
    //s1 = null  // gives compiler error
    print("The length of string s1 is: "+s1.length)//The length of string s1 is: 5

    // variable is declared as nullable
    var s2: String? = "GeeksforGeeks"
    s2 = null    // no compiler error
    //println(s2.length)  // compiler error because string can be null

    //we should use the safe operator to get the length of the string.

    //1. using if condition

    // variable declared as nullable
    var s: String? = "GeeksforGeeks"
    println(s)
    if (s != null) {
        println("String of length ${s.length}")
    } else {
        println("Null string")
    }
    // assign null
    s = null
    println(s)
    if (s != null) {
        println("String of length ${s.length}")
    } else {
        println("Null String")
    }

    //2.Safe Call operator(?.) –
    // this operator reduces if else and automatically check if it is not null then do function otherwise print null on screen
    var firstName: String? = "Praveen"
    var lastName: String? = null

    println(firstName?.toUpperCase()) //PARVEEN
    println(firstName?.length) //7
    println(lastName?.toUpperCase()) //null

    //there are further three funtions with safe call but we discuss them in list

    //3.Elvis Operator(?:) –
    // this is same like ternary opreator in other language if variable is null then assign it another value

    var str : String?  = "GeeksforGeeks"
    println(str?.length)
    str = null
    println(str?.length ?: "-1") //first it check that str?.lenth is null then it assign -1 to it

    //4.Not null assertion : !! Operator
    //The not null assertion (!!) operator converts any value to a non-null type and throws an exception if the value is null.
    //If anyone want NullPointerException then he can ask explicitly using this operator.
    fun main(args: Array<String>) {
        var str : String? = "GeeksforGeeks"
        println(str!!.length)
        str = null
        str!!.length
    }

}
