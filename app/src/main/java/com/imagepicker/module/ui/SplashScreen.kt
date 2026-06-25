package com.imagepicker.module.ui

import androidx.compose.animation.core.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.imagepicker.module.config.AppConfig

@Composable
fun SplashScreen() {

    val infiniteTransition =
        rememberInfiniteTransition(
            label = "splash"
        )

    val alpha by infiniteTransition.animateFloat(

        initialValue = 0.3f,

        targetValue = 1f,

        animationSpec =
            infiniteRepeatable(

                animation =
                    tween(1000),

                repeatMode =
                    RepeatMode.Reverse

            ),

        label = "alpha"

    )

    Column(

        modifier = Modifier.fillMaxSize(),

        verticalArrangement =
            Arrangement.Center,

        horizontalAlignment =
            Alignment.CenterHorizontally

    ) {

        Text(

            text = AppConfig.APP_NAME,

            fontSize = 28.sp,

            fontWeight = FontWeight.Bold,

            modifier = Modifier.alpha(alpha)

        )

        Spacer(
            modifier = Modifier.height(24.dp)
        )

        CircularProgressIndicator()

    }

}