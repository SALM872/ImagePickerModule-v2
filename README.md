# 📸 ImagePickerModule

A reusable Camera & Gallery Image Picker Module built with **Jetpack Compose**, **Kotlin**, and **MVVM Architecture**.

This project demonstrates a clean and scalable approach to image selection using Android's modern Activity Result APIs.

---

# ✨ Features

- 📷 Capture Image from Camera
- 🖼️ Pick Image from Gallery
- 👀 Image Preview Screen
- 🧠 MVVM Architecture
- ⚡ Jetpack Compose UI
- 🧭 Navigation Compose
- 📂 URI Based Image Handling
- 🔒 FileProvider Support
- 📦 Modular Project Structure
- 🚀 Easy to Convert into a Reusable Library

---

# 📱 Screens

- Splash Screen
- Home Screen
- Camera Capture
- Gallery Picker
- Preview Screen

---

# 🏗 Architecture

```
User

        │

        ▼

HomeScreen

        │

        ▼

Camera / Gallery

        │

        ▼

URI

        │

        ▼

ImagePickerViewModel

        │

        ▼

PreviewScreen
```

---

# 📂 Project Structure

```
ImagePickerModule

│

├── camera
├── config
├── di
├── gallery
├── image
├── navigation
├── permission
├── storage
├── ui
├── viewmodel

│

├── MainActivity.kt
└── README.md
```

---

# 🛠 Tech Stack

- Kotlin
- Jetpack Compose
- Material 3
- Navigation Compose
- MVVM
- Activity Result API
- FileProvider
- Coil Image Loading
- Android Studio Narwhal

---

# 📦 Module Components

### Camera

- Camera Launcher
- Temporary Image URI
- FileProvider Support

### Gallery

- Android Photo Picker
- URI Based Selection

### Storage

- Temp Image Manager

### ViewModel

- StateFlow
- Image State Management

### Navigation

- Splash
- Home
- Preview

---

# 🚀 Current Version

**Version : 1.0.0**

### Status

✅ Stable

Working Features

- Splash Screen
- Camera Capture
- Gallery Picker
- Image Preview
- ViewModel State Management
- URI Handling
- Navigation

---

# 🎯 Future Roadmap

## Version 1.1

- Code Cleanup
- Better Error Handling
- Camera Permission Improvements

## Version 2.0

- Fully Reusable Android Library
- rememberImagePicker()
- ImagePickerLauncher()
- Public API
- Internal Architecture Hidden
- Plug & Play Integration

---

# 💻 Requirements

- Android Studio Narwhal or newer
- Kotlin 2.0+
- AGP 8.13+
- Compile SDK 36
- Min SDK 24

---

# 📸 Preview

Camera

↓

Capture Image

↓

Preview Screen

Gallery

↓

Select Image

↓

Preview Screen

---

# 📚 Learning Goals

This project is part of a reusable Android Module ecosystem.

Future modules include:

- GoogleAuthModule
- PdfModule
- NotificationModule
- GoogleSheetModule
- CameraModule
- ScannerModule
- PermissionModule
- NetworkModule

All modules will follow the same clean architecture and modular design principles.

---

# 🤝 Contributing

Suggestions, improvements and feature requests are always welcome.

---

# 📄 License

This project is created for educational purposes and reusable Android module development.

---

# 👨‍💻 Author

**Salman Farsi**

Android Developer

Jetpack Compose • Kotlin • Modular Android Architecture

---

⭐ If you found this project useful, consider giving it a Star on GitHub.