package com.aomame.swipetwitter.entity

import com.aomame.swipetwitter.entity.ImageWithUri

class User(
    val name: String,
    val id: String,
    val icon: ImageWithUri
){
    //自身のiconをgetする
    fun getOwnIcon(){
    }
}