# QuickCartConsole

A console-based supermarket shopping cart application developed in Java. This project is built to demonstrate core Object-Oriented Programming (OOP) concepts such as encapsulation, loose coupling, and reference-based memory management.

## 🚀 Features
* **Interactive Console Menu:** User-friendly terminal interface for listing products, adding them to the cart, and checkout operations.
* **Dynamic Receipt Generation:** Calculates the total amount of the products in the cart during checkout and prints a detailed shopping receipt to the console.

## 🏗️ Architecture and Class Structure
The project features a modular architecture where each class has a single responsibility (Single Responsibility Principle):
* `Main`: Represents only the entry point of the program.
* `Menu`: Handles all user interactions, `Scanner` inputs, and the main menu loop.
* `Store`: Contains the market inventory (`ArrayList`) and product search algorithms.
* `ShoppingCart`: Performs temporary cart operations (holding product references, calculating the total amount, clearing the cart).
* `Product`: Encapsulates product properties (String ID, name, double price, int stock quantity).

## 💻 How to Run
1. Clone the repository to your local machine:
   ```bash
   git clone [https://github.com/YOUR_USERNAME/QuickCartConsole.git](https://github.com/YOUR_USERNAME/QuickCartConsole.git)
