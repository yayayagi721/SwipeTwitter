package com.aomame.swipetwitter.entity

import android.graphics.Bitmap

class ImageWithUri(
    val imageUri: String,
    val image: Bitmap
){
    fun isLoadedImage() = image != null

    fun loadImage(){

    }
}