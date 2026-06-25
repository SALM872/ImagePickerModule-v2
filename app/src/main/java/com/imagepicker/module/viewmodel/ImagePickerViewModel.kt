package com.imagepicker.module.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import android.net.Uri

class ImagePickerViewModel : ViewModel() {

    private val _selectedImage =

        MutableStateFlow<Uri?>(
            null
        )

    val selectedImage =

        _selectedImage.asStateFlow()

    fun setImage(

        uri: Uri

    ) {

        _selectedImage.value =
            uri

    }

}