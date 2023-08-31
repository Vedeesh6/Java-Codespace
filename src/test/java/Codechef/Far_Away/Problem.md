# [Problem: Far Away](https://www.codechef.com/problems/FARAWAY)

Chef has an array A of size N and an integer M, such that 1≤A<sub>i</sub>≤M for every 1≤i≤N. <br>
The distance of an array B from array A is defined as: <br>
d(A,B) = <sup>N</sup>∑<sub>i=1</sub> ( ∣A<sub>i</sub>−B<sub>i</sub>∣ ) <br>
Chef wants an array B of size N, such that 1≤B<sub>i</sub>≤M and the value d(A,B) is as large as possible, i.e, the distance of B from A is maximum. <br>
Find the maximum distance for any valid array B. <br>
Note: ∣X∣ denotes the absolute value of an integer X. For example, ∣−4∣ = 4 and ∣7∣=7.

## Input

- The first line of input will contain a single integer T, denoting the number of test cases.
- Each test case consists of two lines of input.
- The first line of each test case contains two space-separated integers N and M — the length of array A and the limit on the elements of A and B.
- The second line contains N space-separated integers A<sub>1</sub>,A<sub>2</sub>,A<sub>3</sub>,...,A<sub>N</sub>

## Constraints

- 1 ≤ T ≤ 10<sup>5</sup>
- 1 ≤ N ≤ 2*10<sup>5</sup>
- 1 ≤ M ≤ 10<sup>9</sup>
- 1 ≤ A<sub>i</sub> ≤ M
- The sum of N over all test cases won't exceed 3*10<sup>5</sup>

## Output

For each test case, output on a new line the maximum distance of an array from A.

## Sample

- Input:
```
4
2 6
3 5
4 1
1 1 1 1
5 7
2 3 4 5 6
7 24
23 7 6 16 12 4 24
```

- Output:
```
7
0
21
127
```

## Explanation

- For case 1: The array having maximum distance from A is B=[6,1]. Thus the distance is ∣3−6∣+∣5−1∣=3+4=7. <br>
- For case 2: The only array possible is B=[1,1,1,1]. The distance of this array from A is 0.
