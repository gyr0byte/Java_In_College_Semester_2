# Java Lab Work Portfolio - Semester 2

![Java](https://img.shields.io/badge/Language-Java-orange?logo=openjdk&logoColor=white)
![JDK](https://img.shields.io/badge/JDK-8%2B-blue)
![UI](https://img.shields.io/badge/Desktop_UI-Java_Swing-2ea44f)
![Focus](https://img.shields.io/badge/Focus-OOP%2C%20Exceptions%2C%20File%20Handling-informational)
![Status](https://img.shields.io/badge/Status-Academic%20Portfolio-success)

A structured week-by-week Java practice portfolio demonstrating progression from language fundamentals to GUI applications, exception handling, and file operations.

## Student & Course Details

- **Name:** Gaurav Dulal
- **Course Title:** Java Programming Lab (Semester 2)
- **College:** Itahari International College

## Portfolio Highlights

- Progressive weekly development from beginner to intermediate Java concepts
- Hands-on Swing GUI forms with event-driven actions
- Practical exception handling and custom validation examples
- Real file creation, writing, and reading workflows
- Introductory OOP mini-system with inheritance (`Student`, `BBA`, `BIT`)

## Project Goals

- Build confidence in core Java syntax and program structure
- Practice desktop UI design using Java Swing components
- Apply robust error handling with `try/catch/finally` and custom checks
- Work with file I/O APIs in realistic mini exercises
- Combine OOP concepts with GUI design in a small management system

## Repository Structure

```text
sem_2/
|- week_1/
|  |- first.java
|- week_2/
|  |- signin.java
|- week_3/
|  |- design.java
|- week_4/
|  |- design.java
|- week_5/
|  |- AgeException.java
|  |- ExceptionHandling.java
|- week_6/
|  |- AboutMe.java
|  |- FileHandling.java
|  |- MyFile.txt
|  |- MyDetails/
|     |- AboutMe.txt
|- week_7/
   |- ExceptionandFileHandling.java
```

## What This Codebase Covers

- Java basics (strings, methods, classes)
- Java Swing UI development (forms, labels, buttons, radio buttons, combo boxes)
- Event handling with `ActionListener`
- Exception handling (`try`, `catch`, `finally`, custom throw conditions)
- File handling (`File`, `FileWriter`, `FileReader`, `Scanner`)
- Basic OOP design (inheritance with `Student`, `BBA`, `BIT`)

## Weekly Breakdown

### Week 1 - String Immutability Demo

File: `week_1/first.java`

- Creates a string and attempts concatenation.
- Demonstrates that `String` is immutable in Java (original reference is unchanged without reassignment).

### Week 2 - Signup Form UI (Swing)

File: `week_2/signin.java`

- Builds a static signup form with username, email, password fields and a sign-up button.
- Uses Swing components with absolute positioning and custom background color.

### Week 3 - Form Design (Swing)

File: `week_3/design.java`

- Creates a structured form inside a `JPanel` with border.
- Includes email field, gender selection, place dropdown, text area, and submit button.
- Focuses on component layout and grouping via `ButtonGroup`.

### Week 4 - Interactive Form with Submission Dialog

File: `week_4/design.java`

- Extends the week 3 style UI with button click behavior.
- Uses `ActionListener` to collect input values and display them with `JOptionPane`.
- Demonstrates event-driven GUI programming.

### Week 5 - Exception Handling Practice

Files:

- `week_5/AgeException.java`
- `week_5/ExceptionHandling.java`

Highlights:

- Manual exception throwing when age constraints fail.
- Arithmetic and I/O exception branching in calculator-like logic.
- Use of `finally` to close resources.

### Week 6 - File Creation, Writing, and Reading

Files:

- `week_6/AboutMe.java`
- `week_6/FileHandling.java`
- `week_6/MyFile.txt`
- `week_6/MyDetails/AboutMe.txt`

Highlights:

- Creates files/folders if needed.
- Writes personal details into text files.
- Reads text content using `FileReader` and `Scanner`.

### Week 7 - Student Management System (GUI + OOP)

File: `week_7/ExceptionandFileHandling.java`

- Defines a base `Student` class with `BBA` and `BIT` subclasses.
- Builds a Swing UI for adding students with ID, name, and section.
- Stores records in an in-memory `ArrayList<Student>`.
- Includes placeholders for display/load/save actions (buttons are present, action bodies are currently empty).

## Prerequisites

- JDK 8 or higher
- A Java-compatible IDE/editor (VS Code, IntelliJ IDEA, Eclipse) or terminal

Check Java version:

```bash
java -version
javac -version
```

## How to Compile and Run

Because this repository contains multiple standalone programs (and repeated class names like `design` in different weeks), run each file from its own folder.

### Option 1: Run from terminal inside a specific week folder

Example (Week 4):

```bash
cd week_4
javac design.java
java design
```

Example (Week 5):

```bash
cd week_5
javac AgeException.java
java AgeException
```

### Option 2: Compile all files per week

```bash
cd week_6
javac *.java
```

Then run the class you want:

```bash
java FileHandling
```

## How to Test Each Week (Quick Checklist)

Use this section as a fast verification checklist before submission or review.

- [ ] **Week 1 - `week_1/first.java`**
  - Compile/run:
    ```bash
    cd week_1
    javac first.java
    java first
    ```
  - Expected: Output remains `Anil` (demonstrates string immutability without reassignment).

- [ ] **Week 2 - `week_2/signin.java`**
  - Compile/run:
    ```bash
    cd week_2
    javac signin.java
    java signin
    ```
  - Expected: Signup GUI opens with username, email, password, and Sign Up button.

- [ ] **Week 3 - `week_3/design.java`**
  - Compile/run:
    ```bash
    cd week_3
    javac design.java
    java design
    ```
  - Expected: Form UI opens with email, gender radio buttons, place dropdown, text area, submit button.

- [ ] **Week 4 - `week_4/design.java`**
  - Compile/run:
    ```bash
    cd week_4
    javac design.java
    java design
    ```
  - Expected: Form opens and clicking Submit shows entered details in a dialog box.

- [ ] **Week 5 - `week_5/AgeException.java`**
  - Compile/run:
    ```bash
    cd week_5
    javac AgeException.java
    java AgeException
    ```
  - Test cases:
    - Enter `20`: prints age as valid.
    - Enter `17`: throws age-related exception.

- [ ] **Week 5 - `week_5/ExceptionHandling.java`**
  - Compile/run:
    ```bash
    cd week_5
    javac ExceptionHandling.java
    java ExceptionHandling
    ```
  - Test cases:
    - `10` and `2`: prints division result.
    - `10` and `0`: catches division-by-zero path.
    - Negative input: catches I/O error branch.

- [ ] **Week 6 - `week_6/AboutMe.java`**
  - Compile/run:
    ```bash
    cd week_6
    javac AboutMe.java
    java AboutMe
    ```
  - Expected: Creates/updates `MyDetails/AboutMe.txt` with personal details.

- [ ] **Week 6 - `week_6/FileHandling.java`**
  - Compile/run:
    ```bash
    cd week_6
    javac FileHandling.java
    java FileHandling
    ```
  - Expected:
    - `MyFile.txt` is created/updated.
    - Content from `MyDetails/AboutMe.txt` is printed to console.

- [ ] **Week 7 - `week_7/ExceptionandFileHandling.java`**
  - Compile/run:
    ```bash
    cd week_7
    javac ExceptionandFileHandling.java
    java ExceptionandFileHandling
    ```
  - Expected:
    - Student Management GUI opens.
    - Add Student appends entries to in-memory list.
    - Display/Load/Save buttons are visible but currently placeholders.

## Notes and Limitations

- GUI layouts use absolute positioning (`setLayout(null)`), so resizing behavior is limited.
- `week_7/ExceptionandFileHandling.java` has unimplemented button actions for:
  - Display students
  - Load from file
  - Save to file
- Some exception messages and typos are kept as-is to preserve original lab work.

## Suggested Improvements

- Add package names per week to avoid class-name collisions.
- Replace null layouts with layout managers (`BorderLayout`, `GridBagLayout`, etc.).
- Implement serialization or text/CSV persistence for week 7 student records.
- Add input validation for numeric fields (`id`, age, divide inputs).
- Add a license and author section.

## Learning Outcome

This codebase shows gradual progression from Java fundamentals to practical desktop application development, including robust error handling and file operations.

If you are using this as coursework documentation, this README can also serve as a weekly submission summary.
