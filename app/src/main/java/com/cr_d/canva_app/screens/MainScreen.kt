package com.cr_d.canva_app.screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp

import com.cr_d.canva_app.ui.theme.CirclePink
import com.cr_d.canva_app.ui.theme.PurpleEnd
import com.cr_d.canva_app.ui.theme.PurpleMain

@Composable
fun MainScreen(innerPadding: PaddingValues){
    val squareSize = 50f
    val brush = Brush.linearGradient(
        colors = listOf(
            PurpleMain,
            PurpleEnd
        ),
        start = Offset.Zero,
        end = Offset.Infinite
    )

    Box(Modifier
        .fillMaxSize()
        .background(brush)
        .padding(innerPadding)
    ) {
        Drawable(squareSize)
    }
}

@Composable
fun Drawable(squareSize: Float) {
    val padding = 20f
    Canvas(
        modifier = Modifier.fillMaxWidth().padding(padding.dp)
    ) {
        val s = 50f
        val gap = size.width - s

        drawRect(
            color = Color.Red,
            topLeft = Offset(0f, 0f),
            size = Size(squareSize, squareSize)
        )

        drawRect(
            color = Color.Blue,
            topLeft = Offset(gap, 0f),
            size = Size(squareSize, squareSize)
        )

        drawRect(
            color = Color.Green,
            topLeft = Offset(0f, gap),
            size = Size(squareSize, squareSize)
        )

        drawRect(
            color = Color.Yellow,
            topLeft = Offset(gap, gap),
            size = Size(squareSize, squareSize)
        )

        drawRect(
            color = Color.Cyan,
            topLeft = Offset(gap/2, gap/2),
            size = Size(squareSize/3, squareSize/3)
        )

        drawCircle(
            color = CirclePink,
            radius = (gap - squareSize - padding) / 2,
            style = Stroke(
                width = 15f, cap = StrokeCap.Round
            ),
            center = Offset(gap / 2, gap / 2),
        )
    }
}
