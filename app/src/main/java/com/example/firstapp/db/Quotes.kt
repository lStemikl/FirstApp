package com.example.firstapp.db

data class quotes(val success: Boolean,val data: ArrayList<data_feelings>)
data class data_feelings(val id: Int,val title: String, val image:String,val description:String)
