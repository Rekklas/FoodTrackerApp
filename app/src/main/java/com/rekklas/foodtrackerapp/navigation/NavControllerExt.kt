package com.rekklas.foodtrackerapp.navigation

import androidx.navigation.NavController
import com.rekklas.core.UiEvent

fun NavController.navigate(event: UiEvent.Navigate) {
    this.navigate(event.route)
}