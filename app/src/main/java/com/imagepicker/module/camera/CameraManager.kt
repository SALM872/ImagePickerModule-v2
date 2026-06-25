package com.imagepicker.module.camera

import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.runtime.Composable

@Composable
fun rememberCameraLauncher(
    onImageCaptured: (Uri) -> Unit
) = rememberLauncherForActivityResult(

    contract = ActivityResultContracts.TakePicture()

) { success ->

    if (success) {

        pendingImageUri?.let {

            onImageCaptured(it)

        }

    }

}

var pendingImageUri: Uri? = null