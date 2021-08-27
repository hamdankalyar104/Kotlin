package fundamentals



fun main() {
//    There are two types of arguments in Kotlin –
//    1.named arguments (named functions)
//    2.default arguments (default functions)

//    1. Default Functions- those in which parameters are predefined by default values
//    There are three cases for default arguments-

//    i.No arguments are passed while calling a function
//    ii.Partial arguments are passed while calling a function
//    iii.All arguments are passed while calling a function

//    i.No arguments are passed while calling a function

    // default arguments in function definition name, standard and roll_no
    fun student(name: String="Praveen", standard: String="IX" , roll_no: Int=11) {
        println("Name of the student is: $name")
        println("Standard of the student is: $standard")
        println("Roll no of the student is: $roll_no")
    }

    var name_of_student = "Gaurav"
    var standard_of_student = "VIII"
    var roll_no_of_student = 25
    student()		 // passing no arguments while calling student

//    ii.Partial arguments are passed while calling a function

    name_of_student = "Gaurav"
    standard_of_student = "VIII"
    roll_no_of_student = 25
    // passing only two arguments name and standard of student
    student(name_of_student,standard_of_student)

//    iii.All arguments are passed while calling a function

    name_of_student = "Gaurav"
    standard_of_student = "VIII"
    roll_no_of_student = 25

    //passing all the arguments of student name,
    //standard and roll_no in same order as defined in function
    student(name_of_student,standard_of_student,roll_no_of_student)

    // note if we change order of passing arguments then program crash here comes named function

//  2.Named Fucntions - those in which arguments are passed by using parameters name

    name_of_student = "Gaurav"
    standard_of_student = "VIII"
    roll_no_of_student = 25

    // passing the arguments with name as defined in function
    student(name=name_of_student,roll_no=roll_no_of_student)

//  3.Function Inside Another Function

    fun hello(){
        kotlin.io.println("hello")
        fun moo(){
            kotlin.io.println("moo")
        }
        moo()
    }
    hello()
}