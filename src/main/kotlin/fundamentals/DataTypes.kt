package fundamentals

import com.sun.jdi.ShortType

// there are any fundamental types are same as in java but one thing is that
// in kotlin there is no premitive data type all types are object of their classes

fun main() {
    var a :Byte = 8 // 8 bit data
    var b :Short = 16 // 16 bit
    var c :Int = 32 // 32 bit
    var d :Long = 64 // 64 bit

    // decimals
    var e :Float = 32f // 32 bit
    var f :Double = 64.0 // 64 bit

    println(a.toDouble())//every .to function is used for type casting

    var num = 1_000_000 // you can also write this values like that

    //character and String
    var g :String = "String"
    var h :Char = 'n' //stored 16 bit unicode



}
