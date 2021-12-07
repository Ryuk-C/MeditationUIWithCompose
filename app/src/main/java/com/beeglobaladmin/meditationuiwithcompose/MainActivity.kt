package com.beeglobaladmin.meditationuiwithcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.beeglobaladmin.meditationuiwithcompose.ui.theme.DeepBlue
import com.beeglobaladmin.meditationuiwithcompose.ui.theme.HomeScreen
import com.beeglobaladmin.meditationuiwithcompose.ui.theme.MeditationUIWithComposeTheme

class MainActivity : ComponentActivity() {
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeditationUIWithComposeTheme {

                HomeScreen()

            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Box(modifier = Modifier.background(DeepBlue))
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MeditationUIWithComposeTheme {
        Greeting("Android")
    }
}