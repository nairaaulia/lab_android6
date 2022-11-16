package com.naira.belajarandroid.network

import com.naira.belajarandroid.model.NewsData
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

private val BASE_URL = "https://newsapi.org/v2"

private val retrofit =  Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface NewsApiService {
    @GET("top-headlines?country=us&apiKey=2a78c5b43e5847ac8f95fc1d5fa310d1")
    suspend fun getTopHeadline(): NewsData
}

object Api {
    val newsApiService: NewsApiService by lazy {
        retrofit.create(NewsApiService::class.java)
    }
}