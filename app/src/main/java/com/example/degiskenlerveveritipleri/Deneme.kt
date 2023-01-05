package com.example.degiskenlerveveritipleri

class Deneme {

    var x = 10 // global degisken
    var y = 20 // global degisken

    fun topla() {

        var x = 40 // x artık 40 olacak - local degisken
        var z = x + y // local degisken
        println(z)

    }

}