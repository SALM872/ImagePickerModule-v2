package com.imagepicker.module.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.imagepicker.module.config.AppConfig
import com.imagepicker.module.image.ImageData

@Composable
fun PreviewScreen(

    imageData: ImageData

) {

    Column(

        modifier = Modifier.fillMaxSize(),

        verticalArrangement =
            Arrangement.Center,

        horizontalAlignment =
            Alignment.CenterHorizontally

    ) {

        Text(

            text = AppConfig.PREVIEW_TITLE,

            style = MaterialTheme.typography.headlineMedium

        )

        AsyncImage(

            model = imageData.uri,

            contentDescription = "Selected Image",

            modifier = Modifier.size(250.dp)

        )

    }

}