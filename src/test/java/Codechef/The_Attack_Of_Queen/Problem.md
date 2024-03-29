# [Problem: The Attack Of Queen](https://www.codechef.com/problems/QUEENATTACK)

Chef has started developing interest in playing chess, and was learning how the Queen moves.<br>
Chef has an empty N x N chessboard. He places a Queen at (X,Y) and wonders - What are the number of cells that are under attack by the Queen? <br>

Notes:
- The top-left cell is (1,1), the top-right cell is (1,N), the bottom-left cell is (N,1) and the bottom-right cell is (N,N).
- The Queen can be moved any number of unoccupied cells in a straight line vertically, horizontally, or diagonally.
- The cell on which the Queen is present, is not said to be under attack by the Queen.

## Input

- The first line contains a single integer T - the number of test cases. Then the test cases follow.
- The first and only line of each test case contains three integers N, X and Y, as described in the problem statement.

## Constraints

- 1 ≤ T ≤ 10 
- 1 ≤ N ≤ 10<sup>6</sup>
- 1 ≤ X, Y ≤ N

## Output

For each test case, output in a single line, the total number of cells that are under attack by the Queen.

## Sample

- Input:
```
5
1 1 1
3 2 2
3 2 1
2 2 2
150 62 41
```

- Output:
```
0
8
6
3
527
```

## Explanation

- For case 1: The only cell on the board is (1,1). Since Queen stands on this cell, it is not under attack. <br>
- For case 2: The Queen can attack the following cells: {(1,1),(1,2),(1,3),(2,1),(2,3),(3,1),(3,2),(3,3)}. <br>
- For case 3: The Queen can attack the following cells: {(1,1),(1,2),(2,2),(2,3),(3,1),(3,2)}. <br>
- For case 4: The Queen can attack the following cells: {(1,1),(1,2),(2,1)}.
