package com.last3oy.tecandroid

import android.app.Activity
import android.app.Application
import com.last3oy.tecandroid.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class TecApp : Application(), HasActivityInjector{
    @Inject lateinit var dispatchingAndroidInjector : DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder()
                .application(this)
                .build()
                .inject(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> = dispatchingAndroidInjector

}