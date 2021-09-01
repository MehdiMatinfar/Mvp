package com.example.mvp.Model

object MainModel{
     @JvmStatic
     fun main(args: Array<String>) {
         print(getData())
     }
fun getData():MutableList<User>{

    val my_list=mutableListOf<User>()
    my_list.add(User("ali","karami"))
    my_list.add(User("Hossein","karami"))
    my_list.add(User("Reza","Asadio"))

    return my_list

}

 }
