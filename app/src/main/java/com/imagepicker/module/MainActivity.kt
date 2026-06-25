package com.imagepicker.module

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.imagepicker.module.di.AppContainer
import com.imagepicker.module.navigation.AppNavGraph
import com.imagepicker.module.ui.theme.ImagePickerModuleTheme

class MainActivity : ComponentActivity() {

    private lateinit var appContainer: AppContainer

    override fun onCreate(
        savedInstanceState: Bundle?
    ) {

        super.onCreate(savedInstanceState)

        appContainer =
            AppContainer(applicationContext)

        setContent {

            ImagePickerModuleTheme {

                AppNavGraph(

                    imagePickerViewModel =
                        appContainer.imagePickerViewModel

                )

            }

        }

    }

}