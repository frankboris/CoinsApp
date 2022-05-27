package com.frankboris.coinapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.frankboris.coinapp.ui.theme.CoinsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoinsAppTheme {
                Surface(color = MaterialTheme.colors.background) {

                }
            }
        }
    }
}