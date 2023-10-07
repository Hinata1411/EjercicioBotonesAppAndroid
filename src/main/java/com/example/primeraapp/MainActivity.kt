package com.example.primeraapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.primeraapp.components.BotonIcono
import com.example.primeraapp.components.BotonNormal
import com.example.primeraapp.components.BotonNormalE
import com.example.primeraapp.components.BotonOutline
import com.example.primeraapp.components.BotonSwitch
import com.example.primeraapp.components.BotonTexto
import com.example.primeraapp.components.DarkMode
import com.example.primeraapp.components.FloatingAccion
import com.example.primeraapp.components.Space
import com.example.primeraapp.ui.theme.PrimeraappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val darkMode = remember { mutableStateOf(false) }
            PrimeraappTheme(darkTheme = darkMode.value) {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                     Content(darkMode)
                }
            }
        }
    }
    @Composable
    fun Content(darkMode: MutableState<Boolean>){
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            BotonNormal()
            Space()
            BotonNormalE()
            Space()
            BotonTexto()
            Space()
            BotonOutline()
            Space()
            BotonIcono()
            Space()
            BotonSwitch()
            Space()
            DarkMode(darkMode = darkMode)
            Space()
            FloatingAccion()
        }
    }

}

