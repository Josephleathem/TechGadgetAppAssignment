# Week 4 Assignment: Tech Gadgets App

## Learning Objective Covered

CO5: Develop an Android project with a ListView, display arrays with ArrayAdapter, implement decision structures (switch), and use intents to launch external applications (browser).

## Project Summary

This Android app displays five technology gadgets in a ListView. Selecting any gadget opens a detail screen with:

- Gadget title
- Gadget image
- View More Information button

When the button is tapped, the app opens the gadget web page in the device browser.

## Implemented Assignment Requirements

- [x] Home screen displays exactly five gadget names.
- [x] Main screen uses a ListView.
- [x] Gadget names are displayed from an array using ArrayAdapter.
- [x] Selecting a gadget from the list is supported.
- [x] Selecting a gadget opens a second screen with an image and a button.
- [x] Tapping the button launches a browser webpage for that gadget.
- [x] Custom images are used for the five gadgets.
- [x] A custom launcher icon is present.

## Gadget List Used in This Submission

1. Triple Aero Pro Max (Gen 2)
2. Metro L-Desks with Adjustable Height Return
3. Wireless gaming Keyboard and Mouse
4. CLX SET INTEL ADVANCED GAMING PC
5. SKYLEO Desk Lamp

## Tech Stack

- Language: Java
- UI: XML layouts
- Min SDK: 24
- Target SDK: 34
- Compile SDK: 35
- Android Gradle Plugin: 8.4.2
- Gradle: 8.6

## Build and Run Instructions

### Android Studio (recommended)

1. Open the project folder in Android Studio.
2. Allow Gradle sync to complete.
3. Run the app on an emulator or Android device.

### Command Line (Windows)

1. From the project root, run:
	.\gradlew.bat :app:assembleDebug
2. Debug APK output location:
	app\build\outputs\apk\debug\app-debug.apk

## Environment Requirement

Use JDK 17 (or newer supported by AGP 8.4.2).

If you see a build error indicating Java 8 compatibility mismatch, switch the Gradle JDK to JDK 17 in Android Studio:

- File > Settings > Build, Execution, Deployment > Build Tools > Gradle > Gradle JDK
