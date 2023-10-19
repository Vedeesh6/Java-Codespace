# [Problem: Santa and Chocolates](https://www.codechef.com/problems/SANTACHOC)

This Christmas, Santa has a list of N children for gift distribution. <br>
Initially, he decides to gift A<sub>i</sub> chocolates to the i<sup>th</sup> child. However, children are not happy with this distribution.
He then decides to redistribute the chocolates in a way, such that:
- Each child has at least one chocolate;
- The difference of chocolates between any pair of children is not more than K.
  
Find whether such distribution is possible.

## Input

- The first line of input will contain a single integer T, denoting the number of test cases.
- Each test case consists of multiple lines of input.
- The first line of each test case contains two space-separated integers N and K — the number of children and the maximum difference of chocolates between any two children.
- The next line of each test case contains N space-separated integers A<sub>1</sub>, A<sub>2</sub>, ...,A<sub>N</sub> denoting the initial distribution of chocolates.
  
## Constraints

- 1 ≤ T ≤ 1000
- 1 ≤ N ≤ 10<sup>5</sup> 
- 0 ≤ K ≤ 100
- 0 ≤ A<sub>i</sub> ≤ 100
- The sum of N over all test cases won't exceed 10<sup>6</sup>.

## Output

- For each test case, output on a new line, YES, if Chef can redistribute the chocolates in the above mentioned way. Otherwise, output NO.
- Note that you may print each character in uppercase or lowercase. For example, the strings NO, no, No, and nO are considered the same.

## Sample

- Input:
```
3
5 2
7 0 1 4 2
4 100
1 0 2 0
4 3
1 1 0 2
```

- Output:
```
YES
NO
YES
```

## Explanation

- For case 1:  A possible redistribution satisfying all conditions is [2,4,2,4,2]. Note that all children have at least 1 chocolate and the maximum difference of chocolates between any two children is 2.
- For case 2: It is not possible to have a redistribution satisfying all conditions.
- For case 3:  A possible redistribution satisfying all conditions is [1,1,1,1]. Note that all children have at least 1 chocolate and the maximum difference of chocolates between any two children is 0, which is less than 3.
