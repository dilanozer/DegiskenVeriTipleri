package com.example.degiskenlerveveritipleri

fun main() {

    // Ornek 1: Bir ögrencinin adını, yasını, boyunu ve adının bas
    // harfini tutan degiskenler olusturma

    var ogrenciAdi = "ahmet" // string - metinsel ifade
    var ogrenciYas = 23 // int - tam sayi
    var ogrenciBoy = 1.98 // double - ondalikli sayi
    var ogrenciBasHarf = 'a' // char - harfsel ifade

    println(ogrenciAdi)
    println(ogrenciYas)
    println(ogrenciBoy)
    println(ogrenciBasHarf)

    // Ornek 2: Sirketin urunlerinin bilgilerinin tutuldugu urunler
    // tablosunu temsil eden degiskenler olusturma

    var urun_id:Int = 3416
    var urun_adi:String = "Kol saati"
    var urun_adet:Int = 100
    var urun_fiyat:Double = 109.99
    var urun_tedarikci:String = "rolex"

    println(urun_id)
    println(urun_adi)
    println(urun_adet)
    println(urun_fiyat)
    println(urun_tedarikci)

}