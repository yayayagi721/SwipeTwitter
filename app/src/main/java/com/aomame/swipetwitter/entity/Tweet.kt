package com.aomame.swipetwitter.entity

data class Tweet(
    val user: User,
    val tweetId: String,
    val content: String,
    val pictures: List<ImageWithUri>
)