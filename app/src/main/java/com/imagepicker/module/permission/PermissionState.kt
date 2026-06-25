package com.imagepicker.module.permission

sealed interface PermissionState {

    data object Granted : PermissionState

    data object Denied : PermissionState

    data object PermanentlyDenied : PermissionState

}