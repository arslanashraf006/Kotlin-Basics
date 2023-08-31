package com.example.kotlinbasics

data class User(val id: Long, var name: String){

}

fun main(){
    val user1 = User(1,"Denis")
    val name = user1.name
    println(name)
    user1.name = "Micheal"
    val user2 = User(1,"Micheal")
    println(user1==user2)
    println("User Detail $user1")

    val updatedUser = user1.copy(name = "Denis Panjuta")
    println(user1)
    println(updatedUser)

    println(updatedUser.component1()) // prints 1
    println(updatedUser.component2()) // prints Denis Panjuta

    val (id,names) = updatedUser
    println("id = $id, name = $name")
//    val  id = updatedUser.id
//    val names = updatedUser.name
}