package com.imagepicker.module.storage

import android.content.Context
import android.net.Uri
import androidx.core.content.FileProvider
import java.io.File

object TempImageManager {

    fun createTempImageUri(
        context: Context
    ): Uri {

        val imageFile = File.createTempFile(
            "IMG_",
            ".jpg",
            context.cacheDir
        )

        return FileProvider.getUriForFile(
            context,
            context.packageName + ".provider",
            imageFile
        )
    }
}