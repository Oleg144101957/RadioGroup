package com.example.radiogroup

import java.util.*

fun main(){


    val list = listOf<Int>(1, 2, 3, 4, 5)

    for (i in list){

        println("i is $i")

        if (i<3){
            println(i)
        } else {
            break
        }

    }


}