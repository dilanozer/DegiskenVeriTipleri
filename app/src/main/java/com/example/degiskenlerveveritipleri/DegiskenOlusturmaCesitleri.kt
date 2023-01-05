package com.example.degiskenlerveveritipleri

fun main() {

    // Ornek 1

    var sayi = 10

    // Ornek 2

    var fiyat = 12.99
    println(fiyat)

    fiyat = 10.99 // degisken degerini degistirebilme
    println(fiyat)

    // Ornek 3

    var s1 = 80
    var s2 = 70

    var toplam = s1 + s2

    println(toplam)

    // Ornek 4 : Type Safety

    var sonuc = 100

    // sonuc = 1.98 // olamaz çünkü aynı türde deger ataması olması gerekir
}