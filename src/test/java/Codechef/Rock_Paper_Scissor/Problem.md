# [Problem: Rock Paper Scissor](https://www.codechef.com/problems/PASCRO)

Chef and Chefina are playing the famous game of Rock, Paper, Scissors.
The game consists of N rounds. In each round, both players choose one of the three moves: Rock, Paper, or Scissors, denoted by R, P, and S respectively.

- If both players play the same move, the current round ends in a draw and neither of them gets a point.
- If one of the players plays Rock and the other plays Scissors, the player who played Rock wins the round and gets a point.
- If one of the players plays Scissors and the other plays Paper, the player who played Scissors wins the round and gets a point.
- If one of the players plays Paper and the other plays Rock, the player who played Paper wins the round and gets a point.
  
The winner of the game is the player who gets the maximum number of points after playing all the rounds. If both players have the same number of points, then the game ends in a draw.

You are given two strings A and B, each of length N, consisting of uppercase English letters R, P, and S, where A<sub>i</sub> denotes the move made by Chef in the i<sup>th</sup> round and B<sub>i</sub> denotes the move made by Chefina in the i<sup>th</sup> round.

Find the minimum number of rounds Chef should have played differently to have won the game. 

## Input

- The first line of input will contain a single integer T, denoting the number of test cases.
- Each test case consists of multiple lines of input.
  - The first line of each test case contains an integer N — the number of rounds.
  - The second line contains string A of length N denoting the moves played by Chef.
  - The third line contains string B of length N denoting the moves played by Chefina.

## Constraints

All the constraints

## Output

For each test case, output on a new line, the minimum number of rounds Chef should have played differently to have won the game.

## Sample

- Input:
```
3
3
RRR
SPP
2
RP
SP
3
PSP
SRP
```

- Output:
```
1
0
2
```

## Explanation

- For case 1: Chef has a score of 1 while Chefina has a score of 2. To win the game, Chef should have played at least 1 round differently. A sequence of moves like RSR would have led in Chef winning the game.
- For case 2: Chef has a score of 1 while Chefina has a score of 0. Chef is already winning the game.
- For case 3: Chef has a score of 0 while Chefina has a score of 2. To win the game, Chef should have played at least 2 rounds differently. Note that Chef should have played only 1 round differently to draw the game but 2 rounds differently to win.
