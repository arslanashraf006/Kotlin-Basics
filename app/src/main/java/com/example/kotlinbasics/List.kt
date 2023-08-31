package com.example.kotlinbasics

fun main(){
    val months = listOf("January", "February", "March")
    val anyTypes = listOf(1,2,3,true,false,"Spring")
    // print(anyTypes.size)
    print(months[1])
    for (month in months){
        println("\n$month")
    }
    // to change the list make it mutable first
    val additionalMonths = months.toMutableList()
    val newMonth = arrayOf("April", "May", "June")
    additionalMonths.addAll(newMonth)
    println("\n$additionalMonths")

    val days = mutableListOf<String>("Mon", "Tue", "Wed")
    days.add("Thu")
    days[2] = "Sunday"
    //days.removeAt(3)
    val removeList = mutableListOf<String>("Mon", "Wed")
    //days.removeAll(removeList)
    days.removeAll(days)
    print("\n$days")
}