# [Problem: Stone Game II](https://my.newtonschool.co/playground/code/rsm39v7ra8mw)

Alice and Bob continue their games with piles of stones.  There are a number of piles arranged in a row, and each pile has a positive integer number of stones piles[i].  The objective of the game is to end with the most stones. 
Alice and Bob take turns, with Alice starting first.  Initially, M = 1.
On each player's turn, that player can take all the stones in the first X remaining piles, where 1 <= X <= 2M.  Then, we set M = max(M, X).
The game continues until all the stones have been taken.
Assuming Alice and Bob play optimally, return the maximum number of stones Alice can get.

## Input

There are two lines of input:
- The first line will have an integer as input representing the size of array piles.
- The second line will have n space-separated integers representing elements of piles array.

## Constraints

**1 ≤ piles.length ≤ 100 <br>
1 ≤ piles[i] ≤ 10^4**

## Output

Print an integer representing the maximum number of stones Alice can get.

## Sample

- Input:
```
5
2 7 9 4 4
```

- Output:
```
10
```

## Explanation

- For case 1: <br> **piles = [2,7,9,4,4]
If Alice takes one pile at the beginning, Bob takes two piles, then Alice takes 2 piles again. Alice can get 2 + 4 + 4 = 10 piles in total. If Alice takes two piles at the beginning, then Bob can take all three piles left. In this case, Alice gets 2 + 7 = 9 piles in total. So we return 10 since it's larger.**
