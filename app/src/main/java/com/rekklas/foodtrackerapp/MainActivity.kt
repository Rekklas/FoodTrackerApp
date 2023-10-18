package com.rekklas.foodtrackerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.rekklas.foodtrackerapp.ui.theme.FoodTrackerAppTheme
import com.rekklas.onboarding_presentation.welcome.WelcomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodTrackerAppTheme {
                WelcomeScreen()
            }
        }
    }
}