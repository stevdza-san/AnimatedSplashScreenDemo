package com.example.animatedsplashscreendemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.animatedsplashscreendemo.navigation.SetupNavGraph
import com.example.animatedsplashscreendemo.ui.theme.AnimatedSplashScreenDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnimatedSplashScreenDemoTheme {
                val navController = rememberNavController()
                SetupNavGraph(navController = navController)
            }
        }
    }
}
