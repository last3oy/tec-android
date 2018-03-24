package com.last3oy.tecandroid.data.model

import kotlinx.serialization.Optional
import kotlinx.serialization.Serializable

@Serializable
data class Event(
        val id: String,
        val start: Date?,
        val end: Date?,
        val categories: List<String>,
        val topics: List<String>,
        val time: List<Time>?,
        val title: String?,
        val location: Location?,
        val summary: String? = null,
        val description: String? = null,
        val links: List<Link>
)

@Serializable
data class Date(
        val year: Int,
        val month: Int,
        val date: Int
)

@Serializable
data class Location(
        val title: String,
        @Optional val url: String? = "",
        @Optional val detail: String? = ""
)

@Serializable
data class Link(
        val type: String,
        val title: String,
        @Optional val url: String? = null,
        @Optional val detail: String? = null
)

@Serializable
data class Time(
        val from: HourAndMinute,
        val to: HourAndMinute,
        val after: Boolean? = false,
        @Optional val agenda: String? = null
)

@Serializable
data class HourAndMinute(
        val hour: Int,
        val minute: Int
)