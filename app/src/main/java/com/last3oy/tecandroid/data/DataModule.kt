package com.last3oy.tecandroid.data

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.experimental.CoroutineCallAdapterFactory
import com.jakewharton.retrofit2.converter.kotlinx.serialization.stringBased
import dagger.Module
import dagger.Provides
import kotlinx.serialization.json.JSON
import okhttp3.MediaType
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class DataModule {

    @Provides
    fun provideBaseUrl() = "https://thaiprogrammer-tech-events-calendar.spacet.me/"

    @Provides
    fun provideClient() = OkHttpClient.Builder().build()!!

    @Provides
    fun provideContentType() = MediaType.parse("application/json")!!

    @Provides
    fun provideJson() = JSON

    @Singleton
    @Provides
    fun provideRetrofit(baseUrl: String, client: OkHttpClient, contentType: MediaType, json: JSON) =
        Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(client)
                .addConverterFactory(stringBased(contentType, json::parse, json::stringify))
                .addCallAdapterFactory(CoroutineCallAdapterFactory())
                .build()

}