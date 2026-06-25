package com.imagepicker.module.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.imagepicker.module.config.AppConfig
import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.ui.platform.LocalContext
import com.imagepicker.module.storage.TempImageManager
import com.imagepicker.module.camera.rememberCameraLauncher
import com.imagepicker.module.camera.pendingImageUri
@Composable
fun HomeScreen(

    onImageSelected: (Uri) -> Unit

) {
    val galleryLauncher =
        rememberLauncherForActivityResult(

            contract =
                ActivityResultContracts.PickVisualMedia()

        ) { uri: Uri? ->

            if (uri != null) {

                onImageSelected(uri)

            }

        }
    //..........................................
    val context = LocalContext.current

    val cameraLauncher = rememberCameraLauncher { uri ->

        onImageSelected(uri)

    }

    Column(

        modifier = Modifier.fillMaxSize(),

        verticalArrangement =
            Arrangement.Center,

        horizontalAlignment =
            Alignment.CenterHorizontally

    ) {

        Text(

            text = AppConfig.HOME_TITLE,

            style = MaterialTheme.typography.headlineMedium

        )

        Spacer(
            modifier = Modifier.height(32.dp)
        )

        Button(

            onClick = {

                val uri =

                    TempImageManager.createTempImageUri(
                        context
                    )

                pendingImageUri = uri

                cameraLauncher.launch(uri)

            }

        ) {

            Text("Open Camera")

        }

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        Button(

            onClick = {

                galleryLauncher.launch(

                    PickVisualMediaRequest(

                        ActivityResultContracts
                            .PickVisualMedia
                            .ImageOnly

                    )

                )

            }

        ) {

            Text("Open Gallery")

        }

    }

}