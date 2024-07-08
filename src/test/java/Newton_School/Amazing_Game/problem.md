# [Problem: Amazing Game](https://my.newtonschool.co/playground/code/2gzmfzrar1yw)

In a game, two players take turns choosing numbers. They can replace a number with any of its factors (except for 1 and the number itself). If a player can't make a move, they lose. Who wins if player A goes first and both players make the best moves possible?
Print A if player A wins else return B.

## Input

There are two lines of input:
- The first line will take an integer n representing the size of the nums array.
- The second line will take n space-separated integers representing the elements of the nums array.

## Constraints

**1 ≤ n ≤ 1000
1 ≤ nums[i] ≤ 1000**

## Output

Print a single character representing the winning player. Print A if player A wins; otherwise, print B.

## Sample

- Input:
```
3
5 7 3

4
2 4 7 11
```

- Output:
```
B

A
```

## Explanation

- For case 1: <br> **nums = [5, 7, 3]. Since all the numbers are prime, so A will not be able to make the first move.** <br>
- For case 2: <br> **nums = [2, 4, 7, 11]. In the first move, A will replace 4 by 2, so the numbers will become [2, 2, 7, 11] now B will not be able to make a move since all the remaining numbers can only be divided by 1 or the number itself.**
