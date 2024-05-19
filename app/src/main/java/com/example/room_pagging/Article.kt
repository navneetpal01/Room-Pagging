package com.example.room_pagging

import java.util.UUID


data class Article(
    val id : UUID,
    val title : String,
    val abstract : String,
    val content : String,
    val author : String
)