package com.example.cloudymous.kotlinprojectforkadedicoding

open class Pengguna constructor(private val nama: String, private val nomorInduk: Int){

    var mNama = nama
    var mNomorInduk = nomorInduk

    open fun getNama(): String{
        return mNama
    }

    open fun getNomorInduk(): Int{
        return  mNomorInduk
    }
}
