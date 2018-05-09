package com.last3oy.tecandroid.data

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import com.last3oy.tecandroid.data.model.Event
import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.launch
import java.util.*
import javax.inject.Inject


interface EventRepository {

    suspend fun getUpcomingEvent() : MutableLiveData<List<Event>>?


//    private val mUpcomingEvent = MutableLiveData<List<Event>>()
//
//    suspend fun getUpcomingEvent(): LiveData<List<Event>> {
//        async() {
//            val list = service.getEvents().await()
//            val newList = list.filter { event -> !isPastEvent(event) }
//            mUpcomingEvent.value = newList
//        }.await()
//        return mUpcomingEvent
//    }
//
//    private fun isPastEvent(event: Event): Boolean {
//        val c = Calendar.getInstance()
//        val date = c.get(Calendar.DATE)
//        val month = c.get(Calendar.MONTH)
//        val year = c.get(Calendar.YEAR)
//        return with(event.start!!) {
//            this.date < date
//                    && this.month <= month
//                    && this.year <= year
//        }
//    }

}