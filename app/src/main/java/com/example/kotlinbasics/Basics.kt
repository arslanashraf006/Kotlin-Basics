package com.example.kotlinbasics

fun main(){
    // immutable variable
    // type string
    val myName = "Frank"
    //myName="Heidi "
    //type int 32 bit
    var myAge =31
    //Integer TYPES: Byte (8 bit), Short (16 bit),
    //type int (32 bit), Long (64 bit)
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 12_039_812_309_487_120

    // Floating Point number Types: Float (32 bit), Double (64 bit)
    val myFloat: Float = 13.27F
    val myDouble: Double = 3.141592653589793

    //Booleans
    var isSunny: Boolean = true
    isSunny = false

    //Characters
    val letterChar = 'A'
    val digitChar = '1'

    //Strings
    val myStr = "Hello World"
    val firstCharInStr = myStr[0]
    val lastCharInString = myStr[myStr.length - 1]

    print("First character $firstCharInStr and the length of myStr is ${myStr
         .length}")
    print("\nLast character $lastCharInString")
    print("\nHello $myName\n")

    //Arithmetic operators (+,-,*,/,%)
    var result = 5+3
    //result /= 2
    val a = 5.0
    val b = 3
    //result = (a/b).toInt()
    var resultDouble : Double = a/b
    print("$resultDouble\n")

    //Comparison operators (==, !=, <, >, <=, >=)
    val isEqual = 5==3
    println("isEqual is $isEqual\n")

    val isNotEqual = 5!=5
    println("isNotEqual is $isNotEqual\n")
    println("is -5 greater than 3  ${-5>3}\n")
    println("is 5 greater or equal than 3  ${5>=3}\n")
    println("is 5 less or equal than 3  ${5<=3}\n")

    //Assignment operators (+=, -=, *=, /=,%=)
    var myNum = 5
    myNum += 3
    println("myNum is $myNum")

    //Increment & Decrement operators (++, --)
    myNum++
    println("\nmyNum is $myNum")
    println("\nmyNum is ${++myNum}")
    println("\nmyNum is ${myNum++}")
    println("\nmyNum is ${++myNum}")
    println("\nmyNum is ${--myNum}")

    //if statements
    var heightPerson1 = 170
    var heightPerson2 = 189

    if(heightPerson1>heightPerson2){
        println("\nuse raw force")
    }else if (heightPerson1 == heightPerson2){
        println("\nuse your power technique 1337")
    } else{
        println("\nuse technique")
    }

    val age = 17
    if(age >= 21){
        println("\nnow you may drink in the US")
    }else if (age >= 18){
        println("\nyou may vote now")
    }else if (age>=16){
        println("\nyou may drive now")
    }else{
        println("\nyou're too strong")
    }

    var name = "Denis"
    if(name == "Denis"){
        println("\nWelcome home Denis")
    }else{
        println("\nWho are you?")
    }

    var isRainy = true
    if (isRainy){
        println("\nIt's rainy")
    }

    var season = 3
    when(season){
        1 -> println("\nSpring")
        2 -> println("\nSummer")
        3 -> {
            println("\nFall")
            println("\nAutumn")
        }
        4 -> println("\nWinter")
        else -> println("Invalid Season")
    }

    var month = 3
    when(month){
        in 3..5 -> println("\nSpring")
        in 6..8 -> println("\nSummer")
        in 9..11 -> println("\nFall")
        //in 12 downTo 2 -> println("Winter")
        12,1,2 -> println("\nWinter")
        else -> println("\nInvalid Season")
    }

    when(age){
        //!in 0..20 -> println("\nnow you may drink in the US")
        in 21..150 -> println("\nnow you may drink in the US")
        in 18..20 -> println("\nyou may vote now")
        16,17 -> println("\nyou may drive now")
        else -> println("\nyou're too strong")
    }

    var x : Any = "13.37f"
    when(x){
        is Int -> println("\n$x is an Int")
        is Double -> println("\n$x is a Double")
        is String -> println("\n$x is a String")
        else -> println("\n$x is none of the above")
    }

    // While loop
    var y = 1
    while(y <= 10){
        println("\n$y")
        y++
    }
    println("\nwhile loop is done")

    var z = 100
    while(z >= 0){
        println("\n$z")
        z -= 2
    }
    println("\nwhile loop is done")

    var feltTemp = "cold"
    var roomTemp = 10
    while (feltTemp == "cold"){
        roomTemp++
        if(roomTemp >= 20){
            feltTemp = "comfy"
            println("\nit's comfy now")
        }
    }


    // Do While loop
    do{
        println("\n$y")
        y++
    }while (y <= 10)
    println("\ndo while loop is done")

    // for loop
    for (num in 1..10){
        print("\n$num")
    }
    println("\n------------")
    for(i in 1 until 10){ // Same as for(i in 1.until(10))
        println("\n$i")
    }
    println("\n------------")
    for(i in 10 downTo 1){
        println("\n$i")
    }
    println("\n------------")
    for(i in 10 downTo 1 step 2){ // Same as - for(i in 10.downTo(1).step(2))
        println("\n$i")
    }


    // Break and Continue
    for(i in 1 until 20){
        print("\n$i")
        if (i/2 == 5){
            break
        }
    }
    println("\nDone with the break in loop")

    for(i in 1 until 20){
        // 10/2=5
        // 11/2=5.5 which is 5 in term of an int
        if (i/2 == 5){
            continue
        }
        print("\n$i")
    }
    println("\nDone with the continue in loop")

    // functions
    myFunction()
    // arguments
    var results = addUp(5,3)
    println("\n result is $results")

    var avg = avg(5.3,13.37)
    println("\n Average is $avg\n")

    // nullable types
    var names : String = "Denis"
    //names = null -> Compilation Error
    var nullableName : String? = "Denis"
    //nullableName = null

    var len = names.length
    var len2 = nullableName?.length
    nullableName?.let { println(it.length) }
    println(nullableName?.toLowerCase())
   /* if(nullableName!= null) {
        var len2 = nullableName.length
    }else{
        null
    }*/
   // nullables-Elvis Operator-Not null Assertion
   // nullableName = null
//   val namez = nullableName ?: "Guest" // ?: Elvis Operators
//    print("\nname is $namez")

    println("\n ${nullableName!!.toLowerCase()}")// not null assertion

    //safe call operator
    //val wifeAge: String? = user?.wife?.age ?: 0
}
fun avg(a:Double, b: Double) : Double{
    return (a+b)/2
}
//Method - a Method is a Function within a class
// Parameter(input)
fun addUp(a:Int, b: Int) : Int{
     return a+b
}
fun myFunction(){
    print("\nCalled from myFunction")
}