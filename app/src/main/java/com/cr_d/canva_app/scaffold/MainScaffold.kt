package com.cr_d.canva_app.scaffold

import android.R.attr.tint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

import com.cr_d.canva_app.screens.MainScreen
import com.cr_d.canva_app.ui.theme.PurpleMain

@Composable
fun MainScaffold(){
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { CustomTopAppBar() }
    ) { innerPadding ->
        MainScreen(innerPadding)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTopAppBar(){
    val padding = 10.dp
    TopAppBar(
        title= { Text("Canvas App") },
        navigationIcon = {
            Icon(
                Icons.Filled.Menu,
                "Pressed Menu button",
                modifier = Modifier.padding(padding)
            )
        },
        actions = {
            Icon(
                Icons.Filled.MoreVert,
                "Pressed More button",
                modifier = Modifier.padding(padding),
                tint = Color.White
            )
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = PurpleMain
        )
    )
}