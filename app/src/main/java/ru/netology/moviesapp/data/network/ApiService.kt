package ru.netology.moviesapp.data.network

import retrofit2.Response
import retrofit2.http.GET
import ru.netology.moviesapp.data.models.Movies

interface ApiService {

    @GET("/shows")
    suspend fun getAllMovies() : Response<List<Movies>>
}