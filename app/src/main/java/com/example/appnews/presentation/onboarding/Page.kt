package com.example.appnews.presentation.onboarding

import androidx.annotation.DrawableRes
import com.example.appnews.R

data class Page(
    val title: String,
    val description: String,
   @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "Welcome to AppNews",
        description = "Get the latest news from all over the world",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Stay Updated",
        description = "Get the latest news from all over the world",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Get Notified",
        description = "Get the latest news from all over the world",
        image = R.drawable.onboarding3
    )
)