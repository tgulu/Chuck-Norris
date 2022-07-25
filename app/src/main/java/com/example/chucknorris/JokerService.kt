package com.example.chucknorris

import com.example.chucknorris.model.Joker
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface JokerService {


    @GET(RANDOM_JOKE)
    suspend fun getRandomJoke(
    ): Response<Joker>

    @GET(RANDOM_JOKE)
    suspend fun changeName(
        @Query("firstName") firstName: String,
        @Query("lastName") lastName: String
    ): Response<Joker>


    @GET(RANDOM_JLIST)
    suspend fun getRandomJokes(
        @Path("limit") limit: Int = 5
    ): Response<Joker>


    companion object {
        const val BASE_URL = "http://api.icndb.com/jokes/"
        private const val RANDOM_JOKE = "random"
        private const val RANDOM_JLIST = "random/{limit}"

    }
}