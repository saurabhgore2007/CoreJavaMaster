# Day 05 - OOP Mastery Challenge 2

## Project
Smart Vehicle System

## Concepts Used
- Encapsulation
- Inheritance
- Abstraction
- Runtime Polymorphism
- Method Overriding
- Arrays of Parent References

## Class Hierarchy

Vehicle (Abstract)
├── ElectricCar
├── PetrolCar
└── Bike

## Features

- Vehicle Information Management
- Running Cost Calculation
- Dynamic Method Dispatch
- Cheapest Vehicle Detection
- Most Expensive Vehicle Detection
- Average Running Cost Calculation

## Sample Business Logic

ElectricCar -> ₹1/km
PetrolCar   -> ₹5/km
Bike        -> ₹2/km

# Learnings

1. Abstract classes cannot be instantiated.
2. Child classes must implement abstract methods.
3. Runtime polymorphism occurs through parent references.
4. Method selection for overridden methods happens at runtime.
5. Arrays can store different child objects using a common parent type.
6. Business problems can be solved using OOP design.
