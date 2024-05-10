# [Problem: Make them Zero](https://www.codechef.com/problems/MAKEZERO)

You are given an array A of length N.

You can perform the following operation on the array any number of times:

Choose any subsequence S of the array A and a positive integer X such that X is a power of 2 and subtract X from all the elements of the subsequence S.

Find the minimum number of operations required to make all the elements of the array equal to 0.

## Input

- First line will contain T, number of test cases. Then the test cases follow.
- First line of each test case contains an integer N denoting the length of the array A.
- Second line contains N space-separated integers A<sub>1</sub>, A<sub>2</sub>,...., A<sub>N</sub> - denoting the elements of array A. 

## Constraints

- 1 ≤ T ≤ 1000
- 1 ≤ N ≤ 10<sup>5</sup>
- 0 ≤ A<sub>i</sub> ≤ 10<sup>9</sup>
- Sum of N over all test cases do not exceed 2⋅10<sup>5</sup>.

## Output

For each test case, output in a single line, the minimum number of moves required to make all the elements of the array A equal to 0.

## Sample

- Input:
```
4
3
2 2 2
4
2 2 2 4
2
0 0
3
1 2 3
```

- Output:
```
1
2
0
2
```

## Explanation

- For case 1: Take the subsequence with indices {1,2,3} and subtract 2<sup>1</sup> = 2 from each element.
- For case 2: Take the subsequence with indices {1,2,3,4} and subtract 2<sup>1</sup> = 2 from each element. After this operation, the array becomes [0,0,0,2]. Now, take the subsequence with index {4} and subtract 2<sup>1</sup> = 2 from it.
- For case 3: All the elements are already 0.
- For case 4: Take the subsequence with indices {2,3} and subtract 2<sup>1</sup> = 2 from it. Now, the array becomes [1,0,1]. Now, take the subsequence with indices {1,3} and subtract 2<sup>0</sup> = 1 from it.
