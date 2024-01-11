# [Problem: Chef and Fixed Deposits](https://www.codechef.com/problems/MINFD)

Chef wants to make a purchase. For this, he needs X gold coins, but he has none at the moment.

Chef has N fixed deposits, the i<sup>th</sup> of which is worth A<sub>i</sub> coins. He wants to open the minimum number of these deposits so that he has at least X coins.

You have to tell Chef the minimum number of fixed deposits he must open in order to have X coins, or say that this is impossible.

## Input

- The first line of input contains a single integer T, denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains two space-separated integers — N and X, as described in the statement.
- The second line of each test case contains N space-separated integers — the i<sup>th</sup> of which is A<sub>i</sub>.

## Constraints

- 1 ≤ T, A<sub>i</sub>, N ≤ 100
- 1 ≤ X ≤ 10<sup>4</sup>

## Output

For each test case, output one line containing the answer — the minimum number of FDs Chef must open to have at least X coins. If it is not possible for him to open FDs such that he has at least X coins, output −1.

## Sample

- Input:
```
4
4 6
4 3 5 1
3 15
1 5 3
2 5
10 3
4 7
1 2 3 4
```

- Output:
```
2
-1
1
2
```

## Explanation

- For case 1:  Chef can open the first and second FDs to get 4+3=7 coins, which is more than the 6 coins he needs. There are other combinations of two FDs giving at least 6 coins — for example, the first and third (for 4+5=9) and third and fourth (for 5+1=6), but there is no way to open only one FD and get 6 or more coins.
- For case 2: No matter which FDs Chef opens, he cannot have ≥15 coins, so the answer is −1 — even if he opens all of them, he will have only 1+5+3=9 coins.
- For case 3: Chef can open the first FD to obtain 10 coins, which is larger than the 5 coins he needs.
- For case 4: Chef can open the third and fourth FDs to get 3+4=7 coins, which is enough because he needs 7 coins.
