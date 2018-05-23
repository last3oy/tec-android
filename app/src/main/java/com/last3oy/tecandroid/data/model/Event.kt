package com.last3oy.tecandroid.data.model

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

data class Date(
        val year: Int,
        val month: Int,
        val date: Int
)

data class Location(
        val title: String,
        val url: String? = "",
        val detail: String? = ""
)

data class Link(
        val type: String,
        val title: String,
        val url: String? = null,
        val detail: String? = null
)

data class Time(
        val from: HourAndMinute,
        val to: HourAndMinute,
        val after: Boolean? = false,
        val agenda: String? = null
)

data class HourAndMinute(
        val hour: Int,
        val minute: Int
)