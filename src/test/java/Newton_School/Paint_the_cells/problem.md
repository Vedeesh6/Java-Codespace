# [Problem: Paint the cells](https://my.newtonschool.co/playground/code/0qsakxqjnjlt)

Alice and Bob play a game. They are given a matrix of size **X*X**. Initially, all cells are empty. On each turn, a player chooses and paints an empty cell that has no common sides with all previously painted cells. On the next turn, another player does the same, then the first one, and so on. The player with no cells to paint on his turn loses. If Alice starts the game, find out who wins the game, if both players play optimally.

## Input

The first line of the input contains a single integer **X** denoting the size of the matrix.

## Constraints

**1 ≤ X ≤ 10<sup>18</sup>**

## Output

Print **"Alice"** if he wins else print **"Bob".

## Sample

- Input:
```
2
```

- Output:
```
Bob
```

## Explanation

- For case 1: <br> **Since it is a 2*2 matrix. Alice paints the first cell, (i=1, j=1) then Bob can only paint the (i=2, j=2) cell, after which there is no cell left to paint hence Alice loses. <br>
It can be proved that even if Alice chooses any other cell, Bob will still have a choice to paint its diagonally opposite cell, and so he wins in all the possible cases.**
