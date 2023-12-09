# [Problem: Avoid Fixed Points](https://www.codechef.com/problems/NOFIX)

Chef has a sequence of N integers A=[A<sub>1</sub>, A<sub>2</sub>, …,A<sub>N</sub>]. He can perform the following operation any number of times (possibly, zero):

Choose any positive integer K and insert it at any position of the sequence (possibly the beginning or end of the sequence, or in between any two elements).
For example, if A=[5,3,4] and Chef selects K=2, then after the operation he can obtain one of the sequences 
[2,5,3,4], [5,2,3,4], [5,3,2,4], or [5,3,4,2].

Chef wants this sequence to satisfy the following condition: for each 1≤i≤∣A∣, A<sub>i</sub> != i. Here, ∣A∣ denotes the length of A.

Help Chef to find the minimum number of operations that he has to perform to achieve this goal. It can be proved that under the constraints of the problem, it's always possible to achieve this goal in a finite number of operations.

## Input

- The first line of input contains an integer T, denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains an integer N.
- The second line contains N space-separated integers A<sub>1</sub>, A<sub>2</sub>, …,A<sub>N</sub>.

## Constraints

- 1 ≤ T ≤ 10<sup>4</sup>
- 1 ≤ N ≤ 10<sup>5</sup>
- 1 ≤ A<sub>i</sub> ≤ 10<sup>9</sup>
- Sum of N over all test caes does not exceed 2⋅10<sup>5</sup>.

## Output

For each test case, print a single line containing one integer — the minimum number of operations that Chef has to perform to achieve the given condition.

## Sample

- Input:
```
3
3
2 4 5
3
4 1 3
4
3 2 4 2
```

- Output:
```
0
1
2
```

## Explanation

- For case 1: The given sequence does not contain any index i such that A<sub>i</sub> = i. Hence Chef does not have to perform any operation.
- For case 2:  In the given sequence, A<sub>3</sub> = 3. Chef can choose K=2 and insert it before the first element, making the sequence A = [2,4,1,3], which does not contain any index i for which A<sub>i</sub>=i.
