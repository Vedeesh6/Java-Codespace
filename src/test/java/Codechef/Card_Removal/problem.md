# [Problem: Card Removal](https://www.codechef.com/problems/REMOVECARDS)

## Problem
You have N cards placed in front of you on the table. The i<sup>th</sup> card has the number A<sub>i</sub> written on it. <br>
In one move, you can remove any one card from the remaining cards on the table. <br>
Find the minimum number of moves required so that all the cards remaining on the table have the same number written on them.

## Input

- The first line contains a single integer 'T' — the number of test cases. Then the test cases follow.
- The first line of each test case contains an integer N — the number of cards on the table.
- The second line of each test case contains N space-separated integers A<sub>1</sub>,A<sub>2</sub>,A<sub>3</sub>,...,A<sub>N</sub> where A<sub>i</sub> is the number written on the i<sup>th</sup> card.

## Constraints

1 ≤ T ≤ 100 <br>
1 ≤ N ≤ 100 <br>
1 ≤ A<sub>i</sub> ≤ 10

## Output

For each test case, output the minimum number of moves required so that all the cards remaining on the table have the same number written on them.

## Sample

- Input:
```
3
5
1 1 2 2 3
4
8 8 8 8
6
5 6 7 8 9 10
```

- Output:
```
3
0
5
```

## Explanation

- For case 1: <br> **The minimum number of moves required such that all remaining cards have same values is 3**
     - Move 1: Remove a card with number 1. Remaining cards are [1,2,2,3].
     - Move 2: Remove a card with number 1. Remaining cards are [2,2,3].
     - Move 3: Remove a card with number 3. Remaining cards are [2,2].
