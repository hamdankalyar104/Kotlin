package fundamentals

fun main() {
    //there is two types of equalities in the kotlin
    //1.Structural Equality (==)
    var eq = 12
    var eq2 = 12
    println(eq == eq2) // true // it will check content of variables

    //2. Referential Equality (===) it is used to compare address of classes (referential data types)

    var eq3 = 12
    var eq4 = 12
    println(eq3 === eq4) // true

    /*Note
    * in kotlin number,boolean,chars they are primitive types at runtime but
    * in real these are the ordinary classes that's why above example shows same result in
    * in both cases
    * so in case of primitive data types == and === works same
    */

    // .equal method compares the content of one data to another
    //lets demostrate all in one example
    var first = Integer(10)
    var second = Integer(10)


    println(first == second)       //true
    println(first.equals(second))  //true
    println(first === second)      //false

    //if we assign same addresses to both objects
    first=second
    println(first === second)      //true

    /* Note
        * As there is no constructor as String(“”) in Kotlin, all string comparison will give true if the content will be equal.
        * There’s no point in optimizing code when comparing to null explicitly. a == null will be automatically translated to a === null
        * as null is a reference and at the end, it will a reference check
    */




}