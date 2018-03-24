package com.last3oy.tecandroid.data

import com.last3oy.tecandroid.data.model.Event
import kotlinx.coroutines.experimental.Deferred
import retrofit2.http.GET


interface ApiService {

    @GET("calendar.json")
    fun getEvents() : Deferred<List<Event>>
}