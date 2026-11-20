<div align="center">

# 🧱 SOLID Principles in Java

### Write code that survives change: the five principles of object-oriented design, one real app at a time

**Source code for the video series by _ADC with Mounir_**

[![Java](https://img.shields.io/badge/Java-17%2B-58A6FF?style=for-the-badge&logo=openjdk&logoColor=white)](https://openjdk.org/projects/jdk/17/)
[![SOLID](https://img.shields.io/badge/Design-SOLID-FF6B4A?style=for-the-badge)](#-series-content)

</div>

---

## 📖 About this repository

This repository contains **all the lab code** of the **SOLID Principles in Java** series on the **ADC with Mounir** YouTube channel.

Every folder matches one episode. Each lab starts from code that works but **smells**, shows how a real feature request makes it break, then refactors it step by step until the change becomes easy. Open the folder, follow along with the video, run the code, break it, fix it.

All examples are built around one **ride-hailing app** (`Trip`, `Rider`, `Driver`, `FareCalculator`, `Dispatcher`, `TripRepository`, `ReceiptSender`…) that grows from episode to episode, instead of abstract `Shape` / `Animal` examples, so every principle solves a problem you can recognize from real projects. The code uses modern Java and runs on **Java 17+**.

---

## 🎯 Who is this for?

| | Profile | How to use this repo |
|---|---|---|
| 🟢 | **Java developers who know classes, interfaces and inheritance** | Follow the episodes in order: the app grows from one to the next |
| 🔵 | **Developers coming from another object-oriented language** (C#, Kotlin, TypeScript, Python…) | The principles are the same everywhere; the code shows them in modern Java |
| 🟠 | **Anyone preparing a design or code-review interview** | Each `before/` folder is a classic code smell; try to spot it before watching the refactoring |

---

## 🗂️ Series content

| # | Folder | Episode | What you'll learn | Status |
|:-:|---|---|---|:-:|
| 0 | [`SOLID_0_Design_Smells`](./SOLID_0_Design_Smells) | **How Software Rots** | The seven design smells (rigidity, fragility, immobility, viscosity, needless complexity, needless repetition, opacity) and why changing requirements expose them | ✅ |
| 1 | [`SOLID_1_Single_Responsibility`](./SOLID_1_Single_Responsibility) | **S — Single Responsibility** | A responsibility is a reason to change; separating what changes for different reasons | ✅ |
| 2 | [`SOLID_2_Open_Closed`](./SOLID_2_Open_Closed) | **O — Open–Closed** | Adding behavior with new code instead of changing code that already works | ✅ |
| 3 | `SOLID_3_Liskov_Substitution` | **L — Liskov Substitution** | When a subtype really is substitutable for its base type, and when it is not | 🔜 |
| 4 | `SOLID_4_Interface_Segregation` | **I — Interface Segregation** | Splitting fat interfaces so clients depend only on what they use | 🔜 |
| 5 | `SOLID_5_Dependency_Inversion` | **D — Dependency Inversion** | Making high-level policy independent of low-level details | 🔜 |
| 6 | NO LABS (see the video) | **SOLID Review & Practice Questions** | The five principles together, and practice questions | 🔜 |

> ✅ Available · 🚧 In progress · 🔜 Coming soon — the repo is updated as new episodes are released.

Each episode folder has two parts:

```text
SOLID_N_<Principle>/
├── before/   the code as it is at the start of the lab: it works, but it smells
└── after/    the same app once the principle is applied
```

---

## 🛠️ Prerequisites

- **JDK 17 or later** — the code runs unchanged on Java 17, 21 and newer ([Eclipse Temurin](https://adoptium.net/) or [Oracle JDK](https://www.oracle.com/java/technologies/downloads/#java17))
- A code editor — the series uses **VS Code** with the *Extension Pack for Java*, but any IDE works (IntelliJ IDEA, Eclipse…)
- Comfort with **classes, interfaces and inheritance** (covered in Parts 6 and 7 of the [Java SE 17 course](https://github.com/adcwithmounir/Java17_Part_6_Object_Oriented_Basics))

Check your installation:

```bash
javac -version   # should print 17.x or later
java  -version
```

---

## 🚀 Getting started

```bash
# 1. Clone the repository
git clone https://github.com/adcwithmounir/SOLID_Principles_Java.git
cd SOLID_Principles_Java

# 2. Open the folder of the episode you are watching
cd SOLID_1_Single_Responsibility
```

Each folder is independent. `before` and `after` are Java packages, so compile from the episode folder and run the class that has the `main` method with its package name:

```bash
# Compile both versions into an out/ folder
javac -d out before/*.java after/*.java

# Run the version you want
java -cp out after.Main
```

> 💡 **Tip:** before you watch the refactoring, read the `before/` code and ask yourself: *how many reasons could make this class change?* That question is the heart of the whole series.

---

## 📚 Recommended reading

This series is inspired by, and complements:

> **Agile Software Development, Principles, Patterns, and Practices**
> Robert C. Martin — Pearson / Prentice Hall

Episode 1 also quotes the author's later wording of the Single Responsibility Principle, with its reference:

> **Clean Architecture: A Craftsman's Guide to Software Structure and Design**
> Robert C. Martin — Pearson, 2017 (chapter 7)

The series does not replace the book. All code, examples and explanations in this repository are original.

---

## 🤝 Contributing

Found a typo, a bug, or have an idea for a better example?
Feel free to [open an issue](https://github.com/adcwithmounir/SOLID_Principles_Java/issues) or submit a pull request. Questions about the videos are welcome in the YouTube comments too.

---

## 📄 License

This project is licensed under the [MIT License](./LICENSE) — use the code freely to learn and practice.

---

<div align="center">

**⭐ If this repository helps you write better Java, give it a star — it helps other developers find it!**

Made with ☕ by **ADC with Mounir**

</div>
