package com.last3oy.tecandroid.data

import kotlinx.coroutines.experimental.Deferred
import retrofit2.http.GET


interface ApiService {

    @GET("calendar.json")
    fun getEvents() : Deferred<String>
}