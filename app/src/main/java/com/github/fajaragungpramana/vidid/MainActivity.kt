package com.github.fajaragungpramana.vidid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.github.fajaragungpramana.vidid.ui.theme.VidIDTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VidIDTheme {

            }
        }
    }
}