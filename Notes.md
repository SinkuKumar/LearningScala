# Learning Scala - Notes

- This is a collection of notes on learning Scala for my personal reference.
- You can use it for your learning journey as well, but remember that these notes are not exhaustive and may not cover all aspects of Scala programming.

## Table of Contents

1. @main Annotation
2. `.metals` Directory Files


## 1. @main:
In Scala, the `@main` annotation is a concise way to define the main entry point of an application. Introduced in Scala 3, it simplifies creating a main method without the need to extend `App` or manually define a `main` method.

Here’s how it works:

### Basic Example
```scala
@main def hello(): Unit = 
  println("Hello, World!")
```

When you run this program, the `hello` function becomes the entry point of your application. You don't need to create a `main` method explicitly.


### Example with Arguments
The `@main` annotation can also handle command-line arguments directly by defining parameters in the function:

```scala
@main def greet(name: String, age: Int): Unit =
  println(s"Hello, $name! You are $age years old.")
```

You can run this program with command-line arguments:
```bash
scala Main.scala John 30
```
Output:
```
Hello, John! You are 30 years old.
```



### Features of `@main`
1. **Type Parsing**: The arguments are automatically parsed into the required types (e.g., `String`, `Int`, etc.).
2. **Validation**: If incorrect arguments are passed, the program gives a helpful error message.
3. **No Boilerplate**: You don't need to wrap your main function inside an object or extend `App`.



### Limitations
- Only available in Scala 3.
- The method annotated with `@main` must be a `def` (not a `val` or `lazy val`).

This makes the `@main` annotation an elegant and modern approach to define entry points in Scala applications.

<hr>

## 2. `.metals` Directory Files

The files `.metals/metals.lock.db` and `.metals/metals.mv.db` are database files created by [Metals](https://scalameta.org/metals/), a language server for Scala. Here's a breakdown of what these files represent:

1. **`.metals/metals.lock.db`**:
   - This file is likely used to manage concurrency and ensure that only one instance of the Metals server accesses or modifies the database at a time. It acts as a lock file for the primary database file.

2. **`.metals/metals.mv.db`**:
   - This is the main database file used by Metals. It stores metadata, indexes, and other state information that Metals needs to provide language server features such as code navigation, autocompletion, and diagnostics.
   - The `.mv.db` extension indicates that this file is managed by the [H2 Database Engine](https://h2database.com/), an embedded database often used in Java and Scala applications.

These files are part of the `.metals` directory, which Metals uses to store its configuration and state. You generally don't need to interact with these files directly unless troubleshooting or debugging an issue with Metals. If you delete them, Metals will regenerate them the next time it runs, though this might involve reindexing your project.