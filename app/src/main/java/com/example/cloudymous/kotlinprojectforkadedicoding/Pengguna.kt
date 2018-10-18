package com.example.cloudymous.kotlinprojectforkadedicoding

data class Pengguna (nama: String, nomorInduk: Int){

    val mNama = nama
    val mNomorInduk = nomorInduk

    fun getNama(): String{
        return mNama
    }

    fun getNomorInduk(): Int{
        return  mNomorInduk
    }
}
