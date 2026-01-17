package com.cr_d.canva_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

import com.cr_d.canva_app.scaffold.MainScaffold
import com.cr_d.canva_app.ui.theme.Canva_appTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Canva_appTheme {
                MainScaffold()
            }
        }
    }
}
