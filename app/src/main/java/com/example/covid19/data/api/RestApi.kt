package com.example.covid19.data.api

import com.example.covid19.data.res.totalresponse.IndiaCovidResponse
import com.example.newsforum.data.res.search.SearchEverythingResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RestApi {

//    @GET("query?f=json&where=Recovered%20%3E%200&returnGeometry=false&spatialRef=esriSpatialRelIntersects&outFields=*&outStatistics=%5B%7B%22statisticType%22:%22sum%22,%22onStatisticField%22:%22Recovered%22,%22outStatisticFieldName%22:%22value%22%7D%5D&cacheHint=true")
//    suspend fun getRecovered(): Response<CoronaCount>
//
//    @GET("query?f=json&where=Confirmed%20%3E%200&returnGeometry=false&spatialRef=esriSpatialRelIntersects&outFields=*&outStatistics=%5B%7B%22statisticType%22:%22sum%22,%22onStatisticField%22:%22Deaths%22,%22outStatisticFieldName%22:%22value%22%7D%5D&cacheHint=true")
//    suspend fun getDeaths(): Response<CoronaCount>
//
//    @GET("query?f=json&where=Confirmed%20%3E%200&returnGeometry=false&spatialRef=esriSpatialRelIntersects&outFields=*&outStatistics=%5B%7B%22statisticType%22:%22sum%22,%22onStatisticField%22:%22Confirmed%22,%22outStatisticFieldName%22:%22value%22%7D%5D&cacheHint=true")
//    suspend fun getConfirmed(): Response<CoronaCount>

    @GET("data.json")
    suspend fun getAllIndiaCases():Response<IndiaCovidResponse>

    @GET("everything?sortBy=popularity&apiKey=1c0fedf4d3414f9389a056a833ce10d2")
    suspend fun searchNews(@Query("q")q:String):Response<SearchEverythingResponse>

}