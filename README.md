# EV Charger Finder - Starter Project

<p align="center">
  <img src="https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white" />
  <img src="https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white" />
  <img src="https://img.shields.io/badge/Jetpack%20Compose-4285F4?style=for-the-badge&logo=jetpackcompose&logoColor=white" />
</p>

## 📖 About This Project

This is a **starter project** for a 90-minute live coding challenge focused on building an EV Charger Discovery feature. The project comes pre-configured with all necessary dependencies and a basic project structure, allowing candidates to focus on demonstrating their architecture and Android development skills.

## 🎯 Challenge Overview

Candidates will build a feature-complete charger discovery app that includes:
- **Data Layer**: Repository pattern with offline-first architecture
- **State Management**: ViewModel with reactive state (MVI/MVVM)
- **UI Layer**: Jetpack Compose interface with filtering and real-time updates
- **Business Logic**: Filtering, sorting, and data synchronization

## 🏗️ Project Structure

```
app/
├── src/main/
│   ├── java/com/driivz/chargerfinder/
│   │   ├── data/
│   │   │   ├── local/          # Room database setup (empty - to be implemented)
│   │   │   ├── remote/         # Retrofit API setup (empty - to be implemented)
│   │   │   └── repository/     # Repository layer (empty - to be implemented)
│   │   ├── domain/             # Domain models (to be created)
│   │   ├── presentation/       # ViewModels & Composables (to be implemented)
│   │   ├── di/                 # Hilt dependency injection modules (empty)
│   │   └── MainActivity.kt     # Entry point with basic scaffold
│   ├── assets/
│   │   └── mock_chargers.json  # Mock data for the challenge
│   └── res/
│       └── values/
│           ├── strings.xml
│           ├── colors.xml
│           ├── styles.xml
└── build.gradle.kts
```

## 🛠️ Pre-configured Dependencies

This project comes with all necessary dependencies already configured:

### Core Android
- **Kotlin** 1.9.22
- **Android SDK** 34 (Target & Compile)
- **Min SDK** 24

### Architecture Components
- **Jetpack Compose** (BOM 2024.02.00)
  - Material3
  - UI Tooling
  - Runtime
  - Foundation
- **Hilt** 2.50 (Dependency Injection)
- **Room** 2.6.1 (Local Database)
- **Lifecycle** 2.7.0 (ViewModel, Runtime)

### Networking
- **Retrofit** 2.9.0
- **OkHttp** 4.12.0
- **Gson Converter** 2.9.0

### Coroutines
- **Kotlinx Coroutines** 1.7.3 (Core & Android)

### Additional Libraries
- **Accompanist** 0.32.0 (SwipeRefresh)
- **Coil** 2.5.0 (Image loading - optional)

### Testing (Pre-configured)
- JUnit 4
- Espresso
- Compose UI Test

## 🚀 Getting Started

### Prerequisites
- **Android Studio** Hedgehog (2023.1.1) or later
- **JDK** 17 or later
- **Gradle** 8.2+

### Setup Instructions

1. **Clone the repository:**
   ```bash
   git clone <repository-url>
   cd ev-charger-finder
   ```

2. **Open in Android Studio:**
  - Open Android Studio
  - Select "Open an Existing Project"
  - Navigate to the cloned directory
  - Click "OK"

3. **Sync Gradle:**
  - Android Studio should automatically sync Gradle
  - If not, click: `File → Sync Project with Gradle Files`

4. **Run the app:**
  - Click the "Run" button (▶️) or press `Shift + F10`
  - Select an emulator or connected device
  - The app should build and launch with an empty screen

### Verify Setup

After running the app, you should see:
- ✅ App launches successfully
- ✅ Empty screen with "EV Charger Finder" title
- ✅ No build errors in Gradle
- ✅ All dependencies resolved

## 📦 Mock Data

The project includes mock charger data in `assets/mock_chargers.json`:

```json
{
  "chargers": [
    {
      "id": "ch_001",
      "name": "Tesla Supercharger Downtown",
      "latitude": 37.7749,
      "longitude": -122.4194,
      "status": "available",
      "type": "DC_FAST",
      "availablePorts": 4,
      "totalPorts": 8,
      "pricePerKwh": 0.28
    }
  ]
}
```

**Data Fields:**
- `status`: `"available"`, `"occupied"`, `"offline"`
- `type`: `"DC_FAST"`, `"LEVEL_2"`

## 🎯 What Needs to Be Implemented

Candidates will implement the following during the challenge:

### Phase 1: Data Layer (30 min)
- [ ] Retrofit API service interface
- [ ] Room database entities and DAO
- [ ] Repository implementation with offline-first approach
- [ ] Hilt modules for DI
- [ ] Data mappers (DTO → Entity → Domain)

### Phase 2: State Management (30 min)
- [ ] ViewModel with state management
- [ ] Filtering logic (by status)
- [ ] Sorting logic (by distance)
- [ ] Pull-to-refresh functionality
- [ ] Error handling

### Phase 3: UI Implementation (30 min)
- [ ] Charger list screen with Compose
- [ ] Filter chips (All/Available/Occupied)
- [ ] Loading, error, and empty states
- [ ] Pull-to-refresh UI
- [ ] Status indicators and styling

## 🧪 Testing (Optional)

The project is configured for testing. Candidates can add tests if time permits:

```kotlin
// Example unit test structure
class ChargerRepositoryTest {
    // Test repository logic
}

// Example Compose UI test structure
class ChargerListScreenTest {
    // Test UI behavior
}
```

## 📚 Architecture Guidelines

This project encourages **Clean Architecture** principles:

```
┌─────────────────────────────────────┐
│         Presentation Layer          │
│  (ViewModels, Composables, State)   │
└──────────────┬──────────────────────┘
               │
┌──────────────▼──────────────────────┐
│          Domain Layer               │
│     (Models, Business Logic)        │
└──────────────┬──────────────────────┘
               │
┌──────────────▼──────────────────────┐
│           Data Layer                │
│  (Repository, Local, Remote)        │
└─────────────────────────────────────┘
```

**Key Principles:**
- Single Responsibility
- Dependency Inversion
- Separation of Concerns
- Testability
- Offline-First approach

## 🔧 Build Configuration

### Gradle Properties
```properties
kotlin.code.style=official
android.useAndroidX=true
android.enableJetifier=false
org.gradle.jvmargs=-Xmx2048m
```

### ProGuard Rules
Basic ProGuard rules are included for:
- Retrofit
- Gson
- Room
- Coroutines

## 📱 App Configuration

**Package Name:** `com.driivz.chargerfinder`  
**Min SDK:** 24 (Android 7.0)  
**Target SDK:** 34 (Android 14)  
**Version Code:** 1  
**Version Name:** 1.0.0

## 🐛 Troubleshooting

### Common Issues

**1. Gradle Sync Failed**
```bash
# Clean and rebuild
./gradlew clean
./gradlew build
```

**2. Hilt Compilation Errors**
- Ensure `@HiltAndroidApp` is on Application class
- Check Hilt version compatibility
- Invalidate Caches: `File → Invalidate Caches → Restart`

**3. Compose Preview Not Showing**
- Ensure you're using `@Preview` annotation
- Rebuild project: `Build → Rebuild Project`


## 🤝 Support

If you encounter any issues with the starter project:
1. Check the [Troubleshooting](#-troubleshooting) section
2. Verify all prerequisites are installed
3. Ensure you're using the correct Android Studio version
4. Contact the interviewer before the session

## 📄 License

This project is for interview purposes only.

---

## 🎓 Additional Resources

**Android Official Documentation:**
- [Jetpack Compose](https://developer.android.com/jetpack/compose)
- [Hilt Dependency Injection](https://developer.android.com/training/dependency-injection/hilt-android)
- [Room Database](https://developer.android.com/training/data-storage/room)
- [Coroutines Guide](https://kotlinlang.org/docs/coroutines-guide.html)

**Architecture Patterns:**
- [Guide to App Architecture](https://developer.android.com/topic/architecture)
- [State Management in Compose](https://developer.android.com/jetpack/compose/state)

---

**Ready to start?** Follow the [Getting Started](#-getting-started) guide and verify your setup before the interview.

**Good luck! 🚀**