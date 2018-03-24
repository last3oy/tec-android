package com.last3oy.tecandroid.di

import com.last3oy.tecandroid.TecApp
import com.last3oy.tecandroid.data.DataModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, ActivityBuilderModule::class, DataModule::class])
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: TecApp) : Builder

        fun build() : AppComponent
    }

    fun inject(application: TecApp)
}