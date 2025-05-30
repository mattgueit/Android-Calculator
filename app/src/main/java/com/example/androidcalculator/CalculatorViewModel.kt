package com.example.androidcalculator

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.setValue

class CalculatorViewModel: ViewModel() {
    var state by mutableStateOf(CalculatorState())
        private set
}