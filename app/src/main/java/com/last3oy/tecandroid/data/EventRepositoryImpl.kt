package com.last3oy.tecandroid.data

import android.arch.lifecycle.MutableLiveData
import com.last3oy.tecandroid.data.model.Event
import javax.inject.Inject


class EventRepositoryImpl @Inject constructor(service: ApiService) : EventRepository {

    override suspend fun getUpcomingEvent(): MutableLiveData<List<Event>>? {
        return null
    }

}