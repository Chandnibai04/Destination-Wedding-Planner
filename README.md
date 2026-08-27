# 💍 Destination Wedding Planner Application

A desktop GUI application built with **Java**, **JavaFX**, and **FXML (Scene Builder)** designed to streamline the management and planning of cultural destination weddings. The application provides an interactive platform for customizing cultural wedding themes, venue selections, and catering menus.

---

## 📌 Project Overview

Planning a destination wedding requires coordinating multiple themes, cultural traditions, venues, and specialized catering services. This project uses the **Model-View-Controller (MVC)** architectural pattern to deliver a visual and structured booking and planning tool.

* **Technology:** Java, JavaFX, FXML, CSS
* **GUI Builder:** Scene Builder
* **Architecture:** MVC (FXML Views, Java Controllers, Model Data)

---

## 🚀 Key Features

* **User Authentication:** Secure **Login** (`lg.fxml`) and **Registration / Sign Up** (`signup.fxml`) modules.
* **Interactive Dashboard:** Centralized navigation hub (`Dashboard.fxml`) to manage planning workflows.
* **Cultural Wedding Themes:**
  * 🌸 **Hindu Traditional Style** (`hinduismStyle.fxml`)
  * 🌙 **Muslim Traditional Style** (`muslimStyle.fxml`)
  * ⛪ **Christian Traditional Style** (`christianstyle.fxml`)
* **Venue Selection:** Explore destination venues with visual previews and details (`venue.fxml`).
* **Catering & Menu Customization:**
  * 🥗 **Vegetarian Menu** selection with dish previews (`VEGMENU1.fxml`)
  * 🍗 **Non-Vegetarian Menu** selection with dish options (`non-veg.fxml`)
* **Custom UI Styling:** Dedicated CSS stylesheets for each view for a cohesive theme.

---

## 🛠️ Tech Stack

* **Programming Language:** Java (JDK 17+)
* **GUI Framework:** JavaFX
* **Layouts & UI Design:** FXML, Scene Builder
* **Styling:** JavaFX CSS (`.css`)
* **Build / IDE Support:** IntelliJ IDEA / Eclipse / NetBeans

---

## 📂 Project Structure

```text
Destination-Wedding-Planner/
├── Controllers (Java)
│   ├── HelloApplication.java            # Main application entry point
│   ├── DashboardController.java         # Main dashboard event handling
│   ├── lgController.java                # Login controller
│   ├── signupController.java            # Registration controller
│   ├── VenueController.java             # Venue browsing & selection
│   ├── menuController.java              # Main catering menu router
│   ├── VEGMENU1Controller.java          # Vegetarian menu selection
│   ├── nonVegController.java            # Non-vegetarian menu selection
│   ├── hinduismStyleController.java     # Hindu wedding themes controller
│   ├── muslimStyleController.java       # Muslim wedding themes controller
│   └── christianStyleController.java    # Christian wedding themes controller
│
├── Views (FXML Layouts)
│   ├── Dashboard.fxml
│   ├── lg.fxml
│   ├── signup.fxml
│   ├── venue.fxml
│   ├── menu1.fxml
│   ├── VEGMENU1.fxml
│   ├── non-veg.fxml
│   ├── hinduismStyle.fxml
│   ├── muslimStyle.fxml
│   └── christianstyle.fxml
│
├── Stylesheets (CSS)
│   ├── dashboard.css / LoginDesign.css / signup.css
│   ├── venue1.css / menu.css / style.css
│   ├── VEGMENU1.css / nonVeg.css
│   └── hinduism.css / muslimStyle.css / christianstyle.css
│
├── Assets / Images (UI & Themes)
│   ├── Dash & Branding: dashmain.jpg, rings_2473492.png, wedding1.png, mainVenue1.jpg
│   ├── Cultural Styles: hinduismStyle2.jpg, muslim1.jpg, christian1.jpg, etc.
│   └── Menus: VEG thali.jpg, vegmenuIMG1-6.jpg, Non-VEG thali.jpg, non-veg1-6.jpg
│
└── README.md
