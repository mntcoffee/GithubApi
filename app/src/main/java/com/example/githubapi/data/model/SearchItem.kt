package com.example.githubapi.data.model

import com.squareup.moshi.Json

data class SearchItem(
    val id: Int,
    @Json(name = "full_name") val fullName: String,
    val description: String
)
