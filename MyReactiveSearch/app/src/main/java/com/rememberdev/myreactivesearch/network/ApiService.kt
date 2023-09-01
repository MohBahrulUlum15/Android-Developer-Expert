package com.rememberdev.myreactivesearch.network

import com.rememberdev.myreactivesearch.model.PlaceResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("geocoding/{query}.json")
    suspend fun getCountry(
        @Path("query") query: String,
        @Query("key") key: String
    ): PlaceResponse
}