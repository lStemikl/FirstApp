package com.example.firstapp.db

data class feelings(val success: Boolean,val data: ArrayList<data_feelings>)
data class data_feelings(val id: Int,val title: String, val image:String,val position:Int)