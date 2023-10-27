# [Problem: Sarthak and his Magic Grid](https://www.codechef.com/problems/GRIDXOR)

Sarthak got an empty magic grid of size N×N on his birthday. The grid can only be filled with positive integers such that the bitwise XOR of all numbers from any row, any column, or any of the two main diagonals must all be the same! Can you help Sarthak fill this grid using only positive integers no more than 10<sup>9</sup> ? 

## Input

- The first line of each input contains T - the number of test cases. The test cases then follow.
- The only line of each test case contains an integer N - the size of the grid.

## Constraints

- 1 ≤ T ≤ 100
- 1 ≤ N ≤ 100

## Output

For each test case, output N lines, each containing N space-separated integers, such that the grid satisfies the condition given in the statement.<br>
Each integer should be positive and ≤ 10<sup>9</sup>.

## Sample

- Input:
```
1
3
```

- Output:
```
1 1 1
1 1 1
1 1 1
```

## Explanation

- For case 1: The bitwise XOR of all rows, columns and main diagonals in the grid is 1. Therefore, this satisfies the condition.
