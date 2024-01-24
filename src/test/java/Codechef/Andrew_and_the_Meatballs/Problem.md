# [Problem: Andrew_and_the_Meatballs](https://www.codechef.com/problems/AMMEAT)

Andrew likes meatballs very much.

He has N plates of meatballs, here the i<sup>th</sup> plate contains P<sub>i</sub> meatballs. You need to find the minimal number of plates Andrew needs to take to his trip to Las Vegas, if he wants to eat there at least M meatballs. Note that each plate is already packed, i.e. he cannot change the amount of meatballs on any plate.

## Input

The first line of the input contains an integer T, denoting the number of test cases. The description of T test cases follows. The first line of each test case contains two space-separated integers N and M. The second line contains N space-separated integers P<sub>1</sub>, P<sub>2</sub>,...., P<sub>N</sub>.

## Constraints

- 1 ≤ T ≤ 7777
- 1 ≤ N ≤ 7
- 1 ≤ M, P<sub>i</sub> ≤ 10<sup>18</sup>

## Output

For each test case, output an integer, denoting the minimum number of plates. If it's impossible to take at least M meatballs, print -1.

## Sample

- Input:
```
1
4 7
1 2 3 4
```

- Output:
```
2
```

## Explanation

- For case 1: If he takes 3<sup>rd</sup> and 4<sup>th</sup> plates, then we may eat P<sub>3</sub> + P<sub>4</sub> = 7 meatballs in Las Vegas. This is the only way for eating at least M = 7 meatballs with 2 plates.
