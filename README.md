# Java Lab Work - Semester 2

A week-by-week collection of Java practice programs covering core language basics, Swing GUI design, exception handling, file I/O, and a simple object-oriented mini project.

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
