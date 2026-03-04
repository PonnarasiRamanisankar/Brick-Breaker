# 🧱 Brick Breaker Game (Console Version - Java)

A 7x7 Grid Based Brick Breaker Game implemented using Java with layered architecture (Model → DAO → Service → Main).

This project simulates a simplified brick breaker game in the console using OOP concepts and clean package structure.

---

## 📦 Package Structure

```
com.brickbreaker
│
├── model
│   ├── Position.java
│   ├── Ball.java
│   └── Brick.java
│
├── dao
│   └── GameDAO.java
│
├── service
│   └── GameService.java
│
└── main
    └── BrickBreakerMain.java
```

---

## 🎮 Game Configuration

- Grid Size: 7 x 7
- Ball Lives: 5
- Number of Bricks: 6
- Brick Strength: 1 (can be extended to 2, 3, etc.)
- Surrounded by walls (`w`)
- Ground row (`g`)
- Ball represented as (`o`)

---

## 🗺 Initial Grid Layout

```
w w w w w w w
w           w
w   1 1 1   w
w   1 1 1   w
w           w
w           w
w g g o g g w
```

---

## 🎯 Game Commands

| Command | Description |
|---------|-------------|
| St      | Move ball straight upward |
| Lt      | Move ball left diagonal |
| Rt      | Move ball right diagonal |

---

## ⚙ Game Rules

- Ball moves upward based on command.
- If ball hits a brick:
  - Brick strength decreases by 1.
  - If strength becomes 0 → Brick disappears.
  - Ball life reduces by 1.
- If ball hits wall → movement stops.
- If no brick encountered → ball returns to original position.
- Game continues until:
  - All bricks destroyed OR
  - Ball lives become 0.

---

## 🧠 OOP Concepts Used

- Encapsulation
- Layered Architecture
- Separation of Concerns
- Array-based Grid Simulation
- Object Modeling (Ball, Brick, Position)

---

## 🚀 How to Run

1. Clone the repository:
   ```
   git clone https://github.com/PonnarasiRamanisankar/Brick-Breaker.git
   ```

2. Open in Eclipse / IntelliJ

3. Run:
   ```
   BrickBreakerMain.java
   ```

---

## 🖥 Sample Output

```
Initial Grid:
w w w w w w w
w           w
w   1 1 1   w
w   1 1 1   w
w           w
w           w
w g g o g g w
Ball count: 5

Command: St (Straight)
Ball count: 5
```

---

## 📌 Future Enhancements

- Multiple brick strengths (2, 3, 4…)
- Reflection mechanics
- Score system
- Dynamic input version
- Advanced 7-module version
- GUI version (JavaFX / Swing)

<img width="1361" height="602" alt="image" src="https://github.com/user-attachments/assets/05c8bfa8-ca89-44a9-be7e-6776a2e7b590" />
