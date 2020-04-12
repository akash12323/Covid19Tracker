package com.example.covid19.data.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Client {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://newsapi.org/v2/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val retrofit2 = Retrofit.Builder()
        .baseUrl("https://api.covid19india.org/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val api = retrofit.create(RestApi::class.java)

    val api2 = retrofit2.create(RestApi::class.java)

}