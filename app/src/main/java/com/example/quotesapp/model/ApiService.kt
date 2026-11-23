package com.example.quotesapp.model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("quotes")
    suspend fun getQuotes(@Query("limit") limit: Int = 30): QuotesResponse

    @GET("quotes/{id}")
    suspend fun getQuote(@Path("id") id: Int): Quote
}

object RetrofitClient {
    val api: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl("https://dummyjson.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}