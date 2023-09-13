# [Problem: Weird_Modulo_Problem](https://www.codechef.com/problems/EXUNA)

You are given an array A of N positive and pairwise distinct integers. You can permute the elements in any way you want. <br>
The cost of an ordering (A<sub>1</sub>, A<sub>2</sub>,..., A<sub>N</sub>) is defined as (((A<sub>1</sub> mod A<sub>2</sub>) mod A<sub>3</sub>)...mod A<sub>N</sub>) where X mod Y means the remainder when X is divided by Y. You need to find the maximum cost which can be attained through any possible ordering of the elements. 

## Input

- The first line contains T denoting the number of test cases.
- The first line of each testcase contains a single integer N.
- The second line of each testcase contains N space-separated integers, the elements of A.

## Constraints

- 1 ≤ T ≤ 5∗10<sup>5</sup>
- 2 ≤ N ≤ 5∗10<sup>5</sup>
- 1 ≤ A<sub>i</sub> ≤ 10<sup>9</sup>
- Sum of N over all testcases is less than or equal to 10<sup>6</sup> 
- All elements in a single testcase are distinct.

## Output

For each testcase, output the maximum possible cost in a new line.

## Sample

- Input:
```
1
2
7 12
```

- Output:
```
7
```

## Explanation

- For case 1: The two possible ways to order the elements are [7, 12] and [12, 7]. In the first case, the cost is (7 mod 12) = 7 and in the second case the cost is (12 mod 7) = 5. Clearly the answer is 7.
