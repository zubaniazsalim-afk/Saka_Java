# Assignment 1: Object-Oriented Student Management System

## Project Overview
This project is a simple Object-Oriented Student Management System implemented in Java.  
The main goal of the project is to practice core Java and OOP concepts, including classes, objects, constructors, encapsulation, methods, arrays of objects, and basic data processing. The system manages student information such as GPA and credits and performs calculations using clean and structured Java code.

---

## Learning Objectives
- Apply Java fundamentals (variables, conditions, loops, arrays)
- Implement classes, objects, and constructors
- Use encapsulation with private fields and public methods
- Work with arrays of objects
- Demonstrate composition between classes
- Write clean and readable Java code

---

## Class Descriptions

### Student Class
The `Student` class represents a student and stores academic information.

**Fields:**
- `name` – full name of the student
- `id` – student ID
- `major` – academic program
- `gpa` – current GPA
- `credits` – total earned credits

**Methods:**
- Getters for all fields
- `updateGPA(double newGPA)` – updates student GPA
- `addCredits(int c)` – adds earned credits
- `isHonors()` – checks if GPA ≥ 3.5
- `toString()` – returns student information

---

### Course Class
The `Course` class demonstrates composition by containing an array of `Student` objects.

**Fields:**
- `courseName` – course name
- `instructor` – instructor name
- `students[]` – array of students

**Methods:**
- `addStudent(Student s, int index)` – adds a student to the course
- `courseAverageGPA()` – calculates average GPA
- `highestCreditStudent()` – finds the student with the highest credits
- `toString()` – returns course summary

---

## Main Program
The `Main` class serves as the driver program. It:
- Creates multiple `Student` objects
- Updates GPA and credits
- Stores students in an array
- Calculates:
    - Top GPA student
    - Number of honors students
    - Total credits earned
- Creates a `Course` object and adds students to it
- Prints results to the console

---

## How to Compile and Run
Open a terminal in the `src` folder and run:

```bash
javac *.java
java Main
