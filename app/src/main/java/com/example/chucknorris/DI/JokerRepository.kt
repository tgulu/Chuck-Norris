package com.example.chucknorris.DI

import com.example.chucknorris.JokerService
import javax.inject.Inject

interface JokerRepository{
    fun getJokes(): Flow<JokeState>
}


class JokerRepositoryImpl @Inject constructor(
    private val service: JokerService
) {
}