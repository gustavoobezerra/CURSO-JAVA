# EXERCICIOCURSO1 Repository

This repository contains a collection of Java projects developed as part of a programming course. The exercises cover a range of topics, from fundamental concepts to object-oriented programming and graphical user interface (GUI) development.

## Projects Overview

The repository is divided into three main projects, each located in its own sub-directory within `src/`.

### 1. Fundamentos01

A simple console application that demonstrates basic Java concepts.

*   **`desafio_de_conversao.java`**: This program prompts the user to enter the names and salaries of three workers, then calculates and displays their average salary. It serves as a practical example of using the `Scanner` class for console input and performing basic arithmetic operations.

### 2. OrientadaaObjeto

This project contains a set of classes that illustrate core principles of Object-Oriented Programming (OOP).

*   **`Carro.java`**: A class representing a car with methods to `acelerar()`, `frear()`, `ligar()`, and `desligar()`. It demonstrates the concept of object state and behavior.
*   **`Data.java`**: A simple class for creating and formatting date objects.
*   **`HashSetExemplo.java`**: A small program that shows the basic usage of a `HashSet` for storing unique elements.

### 3. safePubg

A more advanced graphical application built with Java Swing that predicts the safe zone sequence in the game PlayerUnknown's Battlegrounds (PUBG).

*   **`PUBGSafeZonePredictor.java`**: This is a complete GUI application where the user can select a map, draw the airplane's flight path, and see a probabilistically generated sequence of safe zones. The logic incorporates game-specific rules, such as "soft" vs. "hard" shifts and avoiding water bodies. This project showcases event handling, 2D graphics rendering, and resource loading.

## How to Compile and Run

To compile and run these projects, you will need to have a Java Development Kit (JDK) installed on your system. You can run the applications from your terminal.

### Compiling

Navigate to the `src` directory before compiling:
```bash
cd EXERCICIOCURSO1/src
```

To compile a specific file, use `javac` with the full path:
```bash
# Example for the salary calculator
javac Fundamentos01/desafio_de_conversao.java

# Example for the HashSet demo
javac OrientadaaObjeto/HashSetExemplo.java

# Example for the PUBG predictor
javac safePubg/PUBGSafeZonePredictor.java
```

### Running

After compiling, stay in the `src` directory and use the `java` command with the fully qualified class name (package.ClassName).

**1. Run `desafio_de_conversao`:**
```bash
java Fundamentos01.desafio_de_conversao
```

**2. Run `HashSetExemplo`:**
```bash
java OrientadaaObjeto.HashSetExemplo
```

**3. Run `PUBGSafeZonePredictor`:**
```bash
java safePubg.PUBGSafeZonePredictor
```
The application window should appear, allowing you to interact with the map and predictor.
