#### Video Demo:  https://youtu.be/X9-Q11-TnYQ
## CS50x Final Project - Link Saver
   **Link Saver** is an Android App saving  links for later built with **Kotlin** and **Jetpack Compose**, using **Room Database** to save links.

## Description
 When I learned  Android Development , I found useful articles and videos on Medium,Youtube and other platforms etc but I forgot posts or videos when I needed to read or watch again.
 So, I built Link Saver as Android Application to solve this problem. 
 The user can save URL links with title into our app .
 The user can view list of links and browse the link directly in Browser. The user can delete the unnecessary links with swipe gesture.
 And Sometimes , I need to read and watch resources related with Android development. This app can easily browse the useful links we saved .
 This project was built as my CS50x final project to demonstrate my understanding of Modern Android Development using Kotlin,Jetpack Compose , MVVM architecture and SOLID principles . 


## Features
- Add new link with title 
- View list of saved links 
- Open links directly into the browser
- Delete link with swipe gesture - The user can delete the unnecessary link with swipe gesture , When the user swipe to delete it shows 
  confirmation dialog to make sure the user really want to delete, and okay it deletes permanently
- With Great UI/UX
- Save links into Room Database


## Project Structure & Architecture
 This project is built with MVVM Architecture and followed separation of concerns
 - Data Layer (Model) :  Contains Database,Dao ,Repository  and Entities 
 - Presentation Layer(View): Contains Jetpack compose - presentation layer don't know how data layer works . The presentation get from ViewModel
 - State Layer (ViewModel): ViewModel works as a bridge between data layer and presentation

## SOLID Principles
 - Single Responsibility Principle - LinkEntity is used for data layer only and Link is used for presentation layer and Model is changed across the layer respectively
 - Dependencies Inversion Principle - High Level Module Shouldn't depend on low level modules So, the Presentation layer don't know detail implementation of data layer
   low level module,the presentation layer only depends on abstraction. 



   

## Tech Stack
- **Language**: Kotlin 
- **UI Framework** :Jetpack Compose
- **Dependency Injection**: Dagger Hilt
- **Database**: Room Database
- **Navigation**:Compose Navigation
- **ViewModel**: ViewModel - One of the Android Architecture components
- **Architecture**: MVVM (Model-View-ViewModel)



## How to Run the Project

### 1. Clone the Repository
First, clone this project from GitHub:

git clone https://github.com/zfml/LinkSaver.git

### 2. Open in Android Studio
- Open Android Studio
- Click on "Open"
- Select the cloned project folder

### 3. Sync Gradle
Allow Android Studio to download all dependencies and sync Gradle automatically.

### 4. Run the App
- Connect an Android emulator or physical device
- Click the "Run" button in Android Studio





## Screenshots
<p align="left">
  <img src="assets/LinkSaverSS1.png" width="250" />
  <img src="assets/LinkSaverSS2.png" width="250" />
</p>



