# ✉️ AI Email Assist – Smart AI-Powered Email Reply Generator  
*A Spring Boot + Gemini AI + React + Chrome Extension Project*

AI Email Assist helps users generate **professional, context-aware email replies** instantly.  
It integrates **Google Gemini Generative AI**, a **Spring Boot backend**, a **React frontend**, and a **Chrome Extension** that works directly inside Gmail.

---

## 🚀 Features

### 🤖 AI Reply Generation
- Generates context-aware email replies using **Gemini AI**
- Supports tones such as **Professional, Casual, Friendly**
- Cleans and extracts the text content from the API response
- Removes subject lines and unnecessary formatting

### 🖥️ React Frontend
- Paste email content in a text area
- Select tone of reply
- Generate and view response instantly
- Copy reply to clipboard
- Error messages & loading indicators

### 🧩 Chrome Extension (Gmail Integration)
- Injects **AI Reply** button inside Gmail compose window
- Reads currently selected Gmail message content
- Sends content to backend for AI-powered reply
- Automatically inserts generated reply into Gmail compose box
- Secure: Backend stores API key, not the extension

### 🔐 Secure API Integration
- Spring Boot backend communicates with Gemini using WebClient
- API Key stored on backend → never exposed to frontend or chrome extension
- Clean DTO structure for request/response

---

## 🛠 Tech Stack

### **Backend**
- ☕ Java 17
- 🌱 Spring Boot
- 🌐 Spring WebFlux (WebClient)
- 🤖 Google Gemini API
- 📦 Maven

### **Frontend**
- ⚛️ React
- 🎨 Material UI
- 🔗 Axios

### **Chrome Extension**
- 📌 Manifest v3
- 🧩 Content scripts / DOM injection
- 🌐 Fetch API

---

## 🏗 Architecture

React UI / Chrome Extension -> Spring Boot Backend (API) -> Google Gemini Generative AI -> AI-generated reply returned to UI/Extension

