package com.example.degiskenlerveveritipleri

fun main() {

    // sayisaldan sayisala donusum
    var i: Int = 42
    var d: Double = 42.45
    var f: Float = 42.89f

    var sonuc1: Int = d.toInt() // double -> int
    var sonuc2: Double = i.toDouble() // int -> double
    var sonuc3: Int = f.toInt() // float -> int

    println(sonuc1)
    println(sonuc2)
    println(sonuc3)

    // sayisaldan metne donusum
    var str1 = i.toString()
    var str2 = d.toString()
    var str3 = f.toString()

    println(str1) // int -> string
    println(str2) // double -> string
    println(str3) // float -> string

    // metinden sayisala donusum

    // Yontem 1
    var yazi1 = "34t"

    try {
        var x = yazi1.toInt()
        println(x)
    } catch (e:Exception) {
        println("Dönüşümde hata var")
    }

    // Yontem 2
    var yazi2 = "48.56r"
    var y = yazi2.toDoubleOrNull()

    if (y != null) {
        println("y : $y")
    } else {
        println("Dönüşümde hata var")
    }

    // Yontem 3
    var yazi3 = "67"
    var z = yazi3.toIntOrNull()

    z?.let {
        println("z: $z")
    }


}