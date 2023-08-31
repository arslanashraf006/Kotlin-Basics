package com.example.kotlinbasics
//var b = 3
fun main(){
    var denis = Person("Denis", "Panjuta", 31)
    denis.hobby = "to Skateboard"
    denis.age = 32
    println("Denis is ${denis.age} years old")
    denis.stateHobby()
    var john = Person()
    john.hobby = "play video games"
    john.stateHobby()
//    var ohnPeterson = Person(lastName = "Peterson")
    myFunction(5)
    //b = 5

    // Lateinit Plus Setters And Getters
    var myCar = Car()
    println("brand is : ${myCar.myBrand}")
    myCar.maxSpeed = 200
    println("Max Speed is : ${myCar.maxSpeed}")
    println("Model is ${myCar.myModel}")
}
class Person(firstName: String = "John", lastName: String = "Doe"){
    // Member variable - properties
    var age : Int? = null
    var frstName : String? = null
    var hobby : String = "watch Netflix"

    // Initializer block
    init {
        this.frstName = firstName
        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName")
    }

    // Member secondary Constructor
    constructor(firstName: String,lastName: String,age: Int)
            : this(firstName, lastName){
                this.age = age
        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName age = $age")
            }

    // Member function : Methods

    fun stateHobby(){
        println("$frstName\'s hobby is $hobby")
    }
}
//Scope and Shadowing
// this a is a parameter
fun myFunction(a:Int){
    // a is a variable
    var b = 4
    println("a is $b")
}

class Car(){
    lateinit var  owner : String
    val myBrand : String = "BMW"

        // Custom getter
    get() {
        return field.toLowerCase()
    }

    var maxSpeed: Int = 250
    //get() = field
    set(value) {
        field = if (value > 0) value else throw IllegalArgumentException("Maxspeed cannot be less than 0")
    }

    var myModel : String = "M5"
    private set

    init {
        this.myModel = "M3  "
        this.owner = "Frank"
    }
}