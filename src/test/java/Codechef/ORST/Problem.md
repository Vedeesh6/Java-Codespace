# [Problem: ORST](https://www.codechef.com/problems/SRTO3)

You are given arrays A and B of sizes N and M respectively, such that 1≤ B<sub>i</sub> ≤ N.

For each 1 ≤ i ≤ M:
- Sort the suffix of length B<sub>i</sub> in array A in non-decreasing order.

Output the resultant array A after all operations.

Note that a suffix of length X denotes the subarray consisting of last X elements of the array. 

## Input

- The first line consists of a single integer T, denoting the number of test cases.
The first line of each test case consists of two space-separated integers N and M, denoting the sizes of arrays A and B.
The second line of each test case consists of N space separated integers A<sub>1</sub>, A<sub>2</sub>,...., A<sub>N</sub>.
The third line of each test case consists of M space separated integers B<sub>1</sub>, B<sub>2</sub>,...., B<sub>M</sub>.

## Constraints

- 1 ≤ T ≤ 10<sup>5</sup>
- 1 ≤ N, M ≤ 2⋅10<sup>5</sup>
- 1 ≤ A<sub>i</sub> ≤ 10<sup>7</sup>
- 1 ≤ B<sub>i</sub> ≤ N
- The sum of N and M over all test cases would not exceed 2⋅10<sup>5</sup> respectively.

## Output

For each test case, output N space-separated integers, denoting the resultant array A after all operations.

## Sample

- Input:
```
2
5 1
2 3 4 6 1
2
6 3
5 7 12 11 13 10
1 2 4 
```

- Output:
```
2 3 4 1 6
5 7 10 11 12 13 
```

## Explanation

- For case 1: Initially, A = [2,3,4,6,1]. After sorting the suffix of length 2, the array changes to A = [2,3,4,1,6].
- For case 2:
  - B<sub>1</sub> = 1 : A = [5,7,12,11,13,10]
  - B<sub>2</sub> = 2 : A = [5,7,12,11,10,13]
  - B<sub>3</sub> = 4 : A = [5,7,10,11,12,13]
  
Thus, the final array is A = [5,7,10,11,12,13].
