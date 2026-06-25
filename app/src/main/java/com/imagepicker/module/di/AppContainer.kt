package com.imagepicker.module.di

import android.content.Context
import com.imagepicker.module.gallery.GalleryManager
import com.imagepicker.module.permission.PermissionManager
import com.imagepicker.module.viewmodel.ImagePickerViewModel

class AppContainer(

    context: Context

) {

    val permissionManager by lazy {

        PermissionManager(context)

    }

    val galleryManager by lazy {

        GalleryManager(context)

    }

    val imagePickerViewModel by lazy {

        ImagePickerViewModel()

    }

}