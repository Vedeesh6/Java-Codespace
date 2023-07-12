# [Problem: Odd-Even Game](https://my.newtonschool.co/playground/code/7coileut71bm)

Rahul and Abhilash are playing a game. They are given a number **N** at the beginning and both in their turn have to choose a number **X** such that
- **1 ≤ X ≤ N**
- **If its Rahul's turn, X has to be even, but if its Abhilashs' turn, it has to be odd** <br>
After each turn, **N** becomes **N - X**. The player who is not able to choose any number in his turn loses. Find out who wins, if both play optimally and Rahul starts the game.

## Input

The first line of the input contains a single integer **N**.

## Constraints

**1 ≤ N ≤ 10<sup>9</sup>**

## Output
Print **"Rahul"** if he wins else print **"Abhilash"**.

## Sample

- Input:
```
2
```

- Output:
```
Rahul
```

## Explanation

- For case 1: <br> **Rahul chooses 2 and subtracts it from N. In Abhilashs' turn N is 0 and there is no odd positive integer less than 0, so he loses.**
