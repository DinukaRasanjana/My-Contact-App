# Contact Manager App

An Android application built in Java to manage a list of contacts. Users can add, view, update, and delete contact entries stored in a local SQLite database.

## Features

- ✅ Add new contacts with name and phone number
- 📋 View a list of all saved contacts
- ✏️ Edit existing contact information
- ❌ Delete contacts from the list
- 🧠 Persistent data storage using SQLite

## Screenshots

*Include screenshots here if available*

## Tech Stack

- **Language**: Java
- **Platform**: Android (API Level 21+)
- **Database**: SQLite
- **IDE**: Android Studio

ContactManagerApp/
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/
│   │       │   └── com/
│   │       │       └── example/
│   │       │           └── contactapp/
│   │       │               ├── MainActivity.java         # Main screen with contact list and operations
│   │       │               ├── DBHelper.java             # SQLite database helper class
│   │       │               └── ContactAdapter.java       # Custom adapter to display contacts in ListView
│   │       ├── res/
│   │       │   ├── layout/
│   │       │   │   ├── activity_main.xml                # UI layout for main activity
│   │       │   │   └── list_item.xml                    # Layout for each contact item in the list
│   │       │   └── values/
│   │       │       └── strings.xml                      # String resources
│   │       └── AndroidManifest.xml                      # App manifest file
├── build.gradle                                          # Project-level build file
└── README.md                                             # Project documentation



## Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/contact-manager-app.git


