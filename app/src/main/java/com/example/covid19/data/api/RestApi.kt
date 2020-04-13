package com.example.covid19.data.api

import com.example.covid19.data.res.totalresponse.IndiaCovidResponse
import com.example.newsforum.data.res.health.HealthResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RestApi {

    @GET("data.json")
    suspend fun getAllIndiaCases():Response<IndiaCovidResponse>

    @GET("top-headlines?apiKey=1c0fedf4d3414f9389a056a833ce10d2")
    suspend fun getHealthNews(@Query("country")country:String,
                              @Query("category")category:String):Response<HealthResponse>

}