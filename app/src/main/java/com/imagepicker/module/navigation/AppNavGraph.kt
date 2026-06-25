package com.imagepicker.module.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.imagepicker.module.ui.HomeScreen
import com.imagepicker.module.ui.PreviewScreen
import com.imagepicker.module.ui.SplashScreen
import com.imagepicker.module.image.ImageData
import com.imagepicker.module.image.ImageSource
import android.net.Uri
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.imagepicker.module.viewmodel.ImagePickerViewModel

@Composable
fun AppNavGraph(

    imagePickerViewModel: ImagePickerViewModel

) {
    val selectedImage by imagePickerViewModel.selectedImage.collectAsState()

    val navController = rememberNavController()

    NavHost(

        navController = navController,

        startDestination = Routes.SPLASH

    ) {

        composable(
            Routes.SPLASH
        ) {

            SplashScreen()

            LaunchedEffect(Unit) {

                kotlinx.coroutines.delay(1500)

                navController.navigate(
                    Routes.HOME
                ) {

                    popUpTo(
                        Routes.SPLASH
                    ) {

                        inclusive = true

                    }

                }

            }

        }

        composable(
            Routes.HOME
        ) {

            HomeScreen(

                onImageSelected = { uri ->

                    imagePickerViewModel.setImage(uri)

                    navController.navigate(
                        Routes.PREVIEW
                    )

                }

            )

        }

        composable(
            Routes.PREVIEW
        ) {

            selectedImage?.let { uri ->

                PreviewScreen(

                    imageData = ImageData(

                        uri = uri,

                        source = ImageSource.GALLERY

                    )

                )

            }

        }

    }

}