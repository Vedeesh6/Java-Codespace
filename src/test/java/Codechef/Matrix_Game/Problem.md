# [Problem: Matrix Game](https://www.codechef.com/problems/ICL1801)

2 players, Cyborg and Geno are playing a game on a matrix. In each turn, the player choses a number from the matrix which is not selected yet and adds the number to his sum. In the end, the player with the largest sum wins the game.

Assuming both players play optimally and Cyborg starts the game, predict who will be the winner of the game. Assume that the initial sum is 0 for both the players.

## Input

- The first line contains T, the number of test cases. The description of T test cases follows.
- Each test case begin with 2 integers, N and M, denoting the number of rows and columns in the matrix. The next N lines contains M space separated integers denoting the numbers present in the matrix.

## Constraints

- 1 ≤ T ≤ 20
- 1 ≤ N, M ≤ 50
- 0 ≤ A[i][j] ≤ 100, where A[i][j] denotes the element of the matrix in i<sup>th</sup> row and j<sup>th</sup> column.

## Output

For each testcase, output "Cyborg", "Geno" or "Draw" based on the outcome of the game.

## Sample

- Input:
```
3
1 1
3
2 3
4 4 4
4 4 4
2 3
4 3 4
4 4 4
```

- Output:
```
Cyborg
Draw
Cyborg
```

## Explanation

- For case 1: In the first test case, Cyborg wins by selecting the only number present in the matrix.
- For case 2: In the second test case, both Cyborg and Geno will end up with a sum of 12, irrespective of how they chose the numbers. Hence, it results in a draw.
- For case 3: In the third test case, when with the player play optimally, Cyborg will end up with sum of 12 while Geno will end up with sum of 11. So, Cyborg wins the game.
