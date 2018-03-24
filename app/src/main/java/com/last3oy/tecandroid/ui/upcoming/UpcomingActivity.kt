package com.last3oy.tecandroid.ui.upcoming

import android.arch.lifecycle.Observer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import com.last3oy.tecandroid.R
import com.last3oy.tecandroid.data.ApiService
import com.last3oy.tecandroid.data.EventRepository
import com.last3oy.tecandroid.data.model.Event
import dagger.android.AndroidInjection
import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.launch
import java.util.*
import javax.inject.Inject
import kotlin.math.truncate

class UpcomingActivity : AppCompatActivity() {

    @Inject
    lateinit var service: ApiService


    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upcoming)
        var repo = EventRepository(service)
        launch {
            repo.getUpcomingEvent().observe(this@UpcomingActivity, Observer<List<Event>> {
                Log.i("eee","e")
                Toast.makeText(this@UpcomingActivity, it?.size.toString(), Toast.LENGTH_LONG).show()
            })
        }


        val c = Calendar.getInstance()
        Log.i("day", c.get(Calendar.DATE).toString())
        Log.i("month", c.get(Calendar.MONTH).toString())
        Log.i("year", c.get(Calendar.YEAR).toString())
    }

    fun doSomnting() {
        val deferred = (1..1_000_000).map {
            async {
                it
            }
        }


    }
}