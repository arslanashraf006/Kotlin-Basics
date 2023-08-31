package com.example.kotlinbasics

fun main(){
    // Sets
      val fruits = setOf("Orange", "Apple", "Grape","Mango" , "Apple", "Orange")
    // Did not pick repeated data
    println(fruits.toSortedSet())

    val newFruits = fruits.toMutableList()
    newFruits.add("Water Melon")
    newFruits.add("Pear")
    print("\n${newFruits.toSortedSet()}")
    print("\n${newFruits.elementAt(4)}\n")

    //Maps
    val daysOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")
    print(daysOfTheWeek[2])

    for(key in daysOfTheWeek.keys){
        print("\n $key is to ${daysOfTheWeek[key]}\n")
    }

    val fruit = mapOf("Favorite" to Fruit("Grape", 3.5),
        "OK" to Fruit("Apple", 2.5))
    print("${fruit.toSortedMap()}\n")
    val newDaysOfWeek = daysOfTheWeek.toMutableMap()
    newDaysOfWeek[4] = "Thursday"
    newDaysOfWeek[5] = "Friday"
    print(newDaysOfWeek.toSortedMap())
}

data class Fruits(val name: String,val price: Double)