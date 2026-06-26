package com.imagepicker.module.image

import android.net.Uri

data class ImageData(

    val uri: Uri,

    val source: ImageSource,

    val fileName: String? = null,

    val mimeType: String? = null,

    val size: Long? = null

)