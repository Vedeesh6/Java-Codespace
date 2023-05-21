# [Problem: Stone Piles](https://my.newtonschool.co/playground/code/nghyme06oxdv)

There are **n** piles of stones, where the **i<sup>th</sup>** pile has **a<sub>i</sub>** stones. Two people play a game, where they take alternating turns removing stones. <br>
In a move, a player may remove a positive number of stones from the first non- empty pile (the pile with the minimal index, that has at least one stone). The first player who cannot make a move (because all piles are empty) loses the game. If both players play optimally, determine the winner of the game.

## Input

The first line of the input contains a single integer **n** denoting the number of piles. The second line of each test case contains **n** integers **a<sub>1</sub>** , …, **a<sub>n</sub>** where **a<sub>i</sub>** is equal to the number of stones in the **i<sup>th</sup>** .

## Constraints

**1 ≤ n ≤ 10<sup>3</sup> <br>
1 ≤ a<sub>i</sub> ≤ 10<sup>9</sup>**

## Output

If the player who makes the first move will win, output **"First"**. Otherwise, output **"Second"**.

## Sample

- Input:
```
3
2 5 4

8
1 1 1 1 1 1 1 1
```

- Output:
```
First
Second
```
