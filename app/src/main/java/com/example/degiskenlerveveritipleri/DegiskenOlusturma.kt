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
    var urun_tedarikci:String = "Rolex"

    println("Ürün id: $urun_id")
    println("Ürün ad: $urun_adi")
    println("Ürün adet: $urun_adet")
    println("Ürün fiyat: $urun_fiyat")
    println("Ürün tedarikçi: $urun_tedarikci")

    println("$urun_tedarikci marka $urun_adi $urun_fiyat fiyatla satılmaktadır. Stokta $urun_adet adet kalmıştır.")

    var a = 10
    var b = 20

    println("$a ve $b nin toplamı: ${a+b}")

}