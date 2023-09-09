# [Problem: Make Money](https://www.codechef.com/problems/MAKEMONEY)

Chef has N bags and an integer X. The i<sup>th</sup> bag contains A<sub>i</sub> coins such that A<sub>i</sub> ≤ X. <br>
In one operation, Chef can: <br>
Pick any bag and increase its coins to X. Formally, if he choses the i<sup>th</sup> bag, he can set A<sub>i</sub> = X. <br>
Given that the cost of performing each operation is C (C≤X) coins and Chef can perform the above operation any (possibly zero) number of times, determine the maximum value of <br>
( ( <sub>i=1</sub>∑<sup>n</sup> A<sub>i</sub> ) − ( Total cost paid by Chef ) ), if Chef performs the operations optimally.

## Input

- The first line of input will contain a single integer T, denoting the number of test cases.
- Each test case consists of multiple lines of input.
  - The first line of each test case contains three space-separated integers N, X, and C — the number of bags, maximum limit of coins on each bag and cost of each operation respectively.
  - The next line contains N space-separated integers A<sub>1</sub>, A<sub>2</sub>,...., A<sub>N</sub> denoting the number of coins in each bag.

## Constraints

- 1 ≤ T ≤ 1000
- 1 ≤ N ≤ 100
- 1 ≤ C ≤ X ≤ 100
- 1 ≤ A<sub>i</sub> ≤ X

## Output

For each test case, output the maximum value of ( ( <sub>i=1</sub>∑<sup>n</sup> A<sub>i</sub> ) − ( Total cost paid by Chef ) ).

## Sample

- Input:
```
3
5 5 2
1 2 3 4 5
3 4 4
1 1 1
5 3 2
3 2 3 1 1
```

- Output:
```
18
3
10
```

## Explanation

- For case 1:  It is optimal for Chef to perform 2 operations:
  - Operation 1: Choose i=1 and set A<sub>1</sub> = 5 by using 2 coins.
  - Operation 2: Choose i=2 and set A<sub>2</sub> = 5 by using 2 coins.
The final array is A=[5,5,3,4,5] and the total cost is 2+2=4. Thus, the value is ((5+5+3+4+5) − 4) = (22 − 4) = 18. <br>
- For case 2:  It is optimal for Chef to perform 0 operations. Thus, the final array remains [1,1,1] and the cost is 0. The value is ((1+1+1)−0) = 3.
