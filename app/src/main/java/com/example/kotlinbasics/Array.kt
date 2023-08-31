package com.example.kotlinbasics

fun main(){
   // val numbers:IntArray = intArrayOf(1,2,3,4,5,6)
   //  val numbers = intArrayOf(1,2,3,4,5,6)
    val numbers = arrayOf(1,2,3,4,5,6)
    // print array
    //println(numbers.contentToString())
    //print(numbers[0])
    for(element in numbers){
        println(element)
    }

    // modify array
    print("initial values ${numbers.contentToString()}")
    numbers[0] = 6
    numbers[1] = 5
    numbers[4] = 2
    numbers[5] = 1
    print("\nchanged values ${numbers.contentToString()}")

    val numbersD = arrayOf(1.0,2.0,3.0,4.0,5.0,6.0)
    print("\ninitial values ${numbersD.contentToString()}")
    numbersD[0] = 6.0
    numbersD[1] = 5.0
    numbersD[4] = 2.0
    numbersD[5] = 1.0
    print("\nchanged values ${numbersD.contentToString()}\n")

    // String type array
    val days = arrayOf("Sun", "Mon", "Tues", "Wed", "Thurs", "Fri", "Sat")
    print(days.contentToString())

    val fruits = arrayOf(Fruit("Apple", 2.5), Fruit("Grape", 3.5))
    print(fruits.contentToString())
    for (fruit in fruits){
        print("\n${fruit.name}")
    }
    for (index in fruits.indices){
        print("\n${fruits[index].name} is in index $index \n")
    }

    val mix = arrayOf("Sun", "Mon", "Tues",1, 2, 3, Fruit("Apple", 2.5))
    print(mix.contentToString())


    // Array list
        val myArrayList: ArrayList<Double> = ArrayList()
        myArrayList.add(13.212312)
        myArrayList.add(23.151232)
        myArrayList.add(32.651553)
        myArrayList.add(16.223817)
        myArrayList.add(18.523999)
        var total = 0.0
        for (i in myArrayList){
            total += i
        }
        var average = total / myArrayList.size
        println("\nAverage is $average")

    // Array list using collection
    val arrayList : ArrayList<String> = ArrayList<String>(5)
    var list:MutableList<String> = mutableListOf<String>()
    list.add("One")
    list.add("Two")
    arrayList.addAll(list)
    val itr =arrayList.iterator()
    while (itr.hasNext()){
        print("\n${itr.next()}\n")
    }
    println("size of arrayList ${arrayList.size}")
}

data class Fruit(val name: String,val price: Double)