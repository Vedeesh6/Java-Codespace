# [Problem: Minimum Sum](https://www.codechef.com/problems/MINSM)

You are given an array A<sub>1</sub>, A<sub>2</sub>,...., A<sub>N</sub> of length N. You can perform the following operation any number of times (possibly 0 times) :
- Choose any two indices i and j and replace either A<sub>i</sub> or A<sub>j</sub> with gcd(A<sub>i</sub>, A<sub>j</sub>).

Find the minimum possible sum (ie. A<sub>1</sub>, A<sub>2</sub>,...., A<sub>N</sub>) that you can achieve, and output that.

## Input

- The first line of input will contain a single integer T, denoting the number of test cases.
- The first line of each test case contains an integer N - the length of the array A.
- The second line of each test case contains N space-separated integers A<sub>1</sub>, A<sub>2</sub>,...., A<sub>N</sub>.

## Constraints

- 1 ≤ T ≤ 100
- 2 ≤ N ≤ 10<sup>5</sup>
- 1 ≤ A<sub>i</sub> ≤ 10<sup>9</sup>
- The sum of N over all test cases won't exceed 3∗10<sup>5</sup>.

## Output

For each test case, output on a new line the minimum sum of the array that can be achieved.

## Sample

- Input:
```
2
2
5 10
3
2 2 6
```

- Output:
```
10
6
```

## Explanation

- For case 1: Choose i=1,j=2 and replace A<sub>2</sup> with gcd(5,10) = 5.
- For case 2: Choose i=1,j=3 and replace A<sub>3</sub> with gcd(2,6) = 2.
