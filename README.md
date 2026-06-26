# 📸 ImagePickerModule

A lightweight, reusable, Jetpack Compose Image Picker library for Android.

ImagePickerModule is designed to eliminate repetitive image picker code from Android projects. Instead of rewriting Camera, Gallery, URI handling, and configuration logic for every project, developers can integrate this module and use a single clean API.

> Version: **2.0.0 Foundation Release**

---

# ✨ Current Features

✅ Android Library Module

✅ Jetpack Compose Ready

✅ Camera Image Capture

✅ Gallery Image Selection

✅ Clean Public API

✅ ImageData Result

✅ ImageSource Support

✅ Configurable Architecture

✅ Internal Modular Design

---

# 🎯 Purpose

This library is created to provide a reusable Image Picker that can be plugged into any Android Jetpack Compose project.

Instead of writing Camera, Gallery, Launcher, URI management, and configuration logic every time, developers only need to integrate this module.

The library handles the internal implementation while exposing a clean API.

---

# 🚀 Current Public API

Example usage:

```kotlin
val launcher = ImagePicker.rememberLauncher(
    config = ImagePickerConfig(),
    callback = object : ImagePickerCallback {

        override fun onImageSelected(image: ImageData) {

        }

        override fun onCancel() {

        }

        override fun onError(message: String) {

        }
    }
)

launcher.openCamera()

launcher.openGallery()
```

---

# 📦 Current Module Structure

```
com.imagepicker.module
│
├── api
│   └── ImagePicker
│
├── callback
│   └── ImagePickerCallback
│
├── config
│   ├── ImagePickerConfig
│   └── PickerMode
│
├── image
│   ├── ImageData
│   └── ImageSource
│
├── engine
│   └── ImagePickerEngine
│
├── permission
│   ├── PermissionManager
│   └── PermissionState
│
└── imagepicker
    └── internal
        ├── launcher
        ├── storage
        └── ...
```

---

# 📚 Architecture

```
Developer

      │

ImagePicker.rememberLauncher()

      │

ImagePickerEngine

      │

Internal Launcher

      │

Camera / Gallery

      │

ImageData Callback
```

---

# 📁 Package Responsibilities

## api

Public entry point of the library.

Contains only the APIs that developers should use.

---

## callback

Provides callback interfaces for:

- Image Selected
- Cancel
- Error

---

## config

Contains library configuration.

Future features will also be controlled from here.

---

## image

Contains data models.

ImageData is the result object returned to developers.

ImageSource identifies whether the image comes from Camera or Gallery.

---

## engine

Reserved for business logic.

Acts as the brain of the library.

Future versions will move internal logic here.

---

## permission

Handles runtime permission states.

Current implementation is basic.

Will be expanded in future versions.

---

## internal

Contains all hidden implementation.

Developers should never access these classes directly.

---

# ✅ What Developers Can Do Right Now

Current Foundation Version supports:

✔ Open Camera

✔ Open Gallery

✔ Receive selected image

✔ Detect image source

✔ Reuse the module across multiple projects

---

# ❌ Currently Not Included

The following features are intentionally reserved for future releases.

- Automatic Permission Request
- Camera/Gallery Chooser
- Multiple Image Selection
- Image Cropping
- Image Compression
- Video Picker
- Document Picker
- CameraX Integration
- Cache Management
- Theme Customization

---

# 🛣 Roadmap

## Version 3

- Smart Permission Flow
- Camera/Gallery Chooser
- Multiple Selection
- Better Configuration

---

## Version 4

- Image Crop
- Compression
- Image Quality Control

---

## Version 5

- Video Picker
- Document Picker
- CameraX Support
- Built-in Preview

---

# 🎯 Design Philosophy

This library follows three principles:

### Simplicity

Developers should write as little code as possible.

---

### Reusability

Build once.

Use everywhere.

---

### Maintainability

Public API should remain stable while internal implementation evolves.

---

# 💡 Current Status

Foundation Version

Production Architecture

Feature Expansion In Progress

---

# ❤️ Author

Developed with Jetpack Compose

Designed for reusable Android development.