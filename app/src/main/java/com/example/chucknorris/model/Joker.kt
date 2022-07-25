package com.example.chucknorris.model


import com.google.gson.annotations.SerializedName

data class Joker(
    @SerializedName("categories")
    val categories: List<Any?>?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("joke")
    val joke: String?
)