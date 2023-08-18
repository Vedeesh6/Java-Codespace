# [Problem: Chef and Game with Sequence](https://www.codechef.com/problems/L56GAME)

## Problem
Chef has a sequence A containing N integers A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>N</sub>.

Chef is playing a game with this sequence. In this game, he may perform the following operation any number of times (including zero): Choose an arbitrary pair of elements from the sequence such that their sum is even, delete these two elements from the sequence and insert their sum into the sequence instead.

The goal of the game is to minimise the number of elements in the sequence.

Help Chef to play the game and find the minimum possible size of the sequence at the end of the game!

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains a single integer N.
- The second line contains N space-separated integers A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>N</sub>.

## Constraints

- 1 ≤ T ≤ 100
- 1 ≤ N ≤ 100
- 1 ≤ A<sub>i</sub> ≤ 1,000 for each valid i

## Output

For each test case, print a single line containing one integer — the minimum possible final size of the sequence.

## Sample

- Input:
```
2
2
1 2
5
7 4 3 2 6
```

- Output:
```
2
1
```
