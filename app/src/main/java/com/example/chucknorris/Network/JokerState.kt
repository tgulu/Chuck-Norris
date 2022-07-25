package com.example.chucknorris.Network

import com.example.chucknorris.model.Joker
import java.lang.Exception

sealed class JokerState{
    object LOADING : JokerState()
    data class SUCCESS(val response: List<Joker>):JokerState()
    data class ERROR(val error: Exception):JokerState()
}
