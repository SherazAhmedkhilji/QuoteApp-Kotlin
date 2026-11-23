# QuoteApp-Kotlin
An Android Quotes App built using Kotlin, XML, RecyclerView, Retrofit and DummyJSON REST API.


# 📱 Quotes App – Android Kotlin (MVC Architecture)

An Android application developed using **Kotlin and XML** that fetches inspirational quotes from the DummyJSON REST API and displays them using RecyclerView.

The application follows the **Model–View–Controller (MVC)** architecture to maintain a clean separation between data, application logic, and user interface.

## ✨ Features

- Fetch quotes from DummyJSON REST API.
- Display quotes using RecyclerView.
- Show quote text, author, and ID.
- Open individual quote details when an item is clicked.
- Navigate between the main screen and detail screen.
- MVC-based project organization.

## 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| Kotlin | Programming language |
| XML | User interface design |
| Android Studio | Development environment |
| RecyclerView | Displaying quotes |
| Retrofit | API communication |
| Gson | JSON parsing |
| Material Components | UI components |
| Intent | Activity navigation |

## 🏗️ Architecture

This project follows the MVC architecture.

- **Model:** Contains Models.kt and ApiService.kt for data representation and API definitions.
- **Controller:** Contains QuoteController.kt for API communication and application logic.
- **View:** Contains MainActivity.kt, DetailActivity.kt, QuoteAdapter.kt, and XML layouts for displaying data and handling user interaction.

## 📂 Project Structure

```text
QuotesApp/
└── app/src/main/
    ├── AndroidManifest.xml
    ├── java/com/example/quotesapp/
    │   ├── model/
    │   │   ├── Models.kt
    │   │   └── ApiService.kt
    │   ├── controller/
    │   │   └── QuoteController.kt
    │   └── view/
    │       ├── MainActivity.kt
    │       ├── DetailActivity.kt
    │       └── QuoteAdapter.kt
    └── res/
        ├── layout/
        │   ├── activity_main.xml
        │   ├── activity_detail.xml
        │   └── item_quote.xml
        └── values/
            └── themes.xml
```

## 🌐 API Used

**DummyJSON Quotes API**

https://dummyjson.com/quotes

The application retrieves quote information from the API and converts the JSON response into Kotlin data objects.

## 🚀 Getting Started

### Prerequisites

- Android Studio
- Android SDK
- Kotlin
- Internet connection

## 📱 Application Workflow

1. Launch the application.
2. Fetch quotes from DummyJSON API.
3. Display quotes in RecyclerView.
4. Click any quote to open its detail screen.
5. View the selected quote, author, and ID.
6. Return to the main screen.

## 📚 Learning Objectives

- Understanding MVC architecture.
- Integrating REST APIs in Android.
- Using Retrofit for network communication.
- Parsing JSON using Gson.
- Implementing RecyclerView and Adapter.
- Handling click events.
- Passing data between Activities using Intent.
- Designing Android interfaces using XML.

## 🔮 Future Improvements

- Add search functionality.
- Add favorite quotes.
- Implement pagination.
- Add dark mode.
- Improve error handling and loading indicators.

## 📄 License

This project is available for educational and learning purposes.
