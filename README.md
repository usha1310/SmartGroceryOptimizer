The Smart Grocery Optimizer is a Java application developed using pure Object-Oriented Programming principles without using the Collections Framework. The main objective of this project is to help users track household grocery items, analyze their usage patterns, and predict which products will run out soon. This project demonstrates the use of classes, objects, encapsulation, abstraction, and array-based object storage.

In this system, the user is allowed to enter details for up to ten grocery products. For each product, information such as product name, available quantity, weekly usage, and price per unit is collected. Using these details, the program calculates how many days are left before the product runs out. Based on this calculation, the system identifies the “most critical item,” meaning the product that will run out first. This helps the user prioritize which grocery item needs to be purchased immediately.

The project also identifies all the items that are expected to run out within the next three days. These items are displayed separately to give the user an early warning. This helps in efficient planning and prevents situations where essential groceries run out unexpectedly.

Another major feature of the project is monthly expense estimation. The system uses the weekly usage and price of each product to calculate the total estimated cost for one month. The formula used assumes four weeks per month. This helps the user predict and manage their budget effectively.

The internal design follows strict OOP concepts. The GroceryItem class contains all item-related data with private fields and public getters. The GroceryList class manages an array of GroceryItem objects and provides methods for adding items, finding the most critical item, predicting items running out soon, and calculating the total monthly expense. The Main class handles user interaction and displays the results.

