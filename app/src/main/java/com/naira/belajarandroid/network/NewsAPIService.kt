package com.naira.belajarandroid.network

import com.naira.belajarandroid.model.NewsData
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

private val BASE_URL = "https://run.mocky.io/v3"

private val retrofit =  Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface NewsApiService {
    @GET("top-headlines?country=us&apiKey=4cb663af3844447a96e863ec6afe17f8")
    suspend fun getTopHeadline(): NewsData
}