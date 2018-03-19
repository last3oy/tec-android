package com.last3oy.tecandroid.di

import com.last3oy.tecandroid.ui.upcoming.UpcomingActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector
    abstract fun bindUpcomingActivity() : UpcomingActivity
}