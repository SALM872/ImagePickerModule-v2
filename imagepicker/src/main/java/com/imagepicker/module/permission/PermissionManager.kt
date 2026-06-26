package com.imagepicker.module.permission

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import androidx.core.content.ContextCompat

class PermissionManager(

    private val context: Context

) {

    fun hasCameraPermission(): Boolean {

        return ContextCompat.checkSelfPermission(

            context,

            Manifest.permission.CAMERA

        ) == PackageManager.PERMISSION_GRANTED

    }

    fun hasGalleryPermission(): Boolean {

        return true

    }

}