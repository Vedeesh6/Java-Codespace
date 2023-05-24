# [Problem: Game On](https://my.newtonschool.co/playground/code/kvf49yd8akwr)

The Dilmo game is a two-player game played on a rectangular grid of cells. Each cell can be claimed by either player, but once a player claims a cell, none of the cells in the same row or column can be claimed by either player. Players take turns claiming cells, and the game ends when neither player can make a move. The player who can't make a move loses. Alice and Bob decide to play the game. Given the initial state of the grid and the fact that Alice goes first, write a program to predict the winner of the game, assuming that both players play optimally.
<br>
Optimally means they choose the most strategic move at each turn to increase their chances of winning the game.

## Input

The first line consists of two space-separated integers **k** and **l**, the number of rows and columns in the matrix. <br>
The following **k** lines consist of **l** space-separated integers each either **0** or **1**.

## Constraints

**1 ≤ k, l ≤ 50** 

## Output

Print Single string, **Alice or Bob**. (case sensitive ).

## Sample

- Input:
```
2 2
0 0
0 0
```

- Output:
```
Bob
```

## Explanation

- For case 1: <br> **One possible optimal case can be Alice choosing (1,1) now Bob can choose only (2,2). Alice didn't have any cells to choose from according to the given condition, therefore Bob wins.** 
