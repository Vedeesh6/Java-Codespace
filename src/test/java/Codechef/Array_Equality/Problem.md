# [Problem: Array Equality](https://www.codechef.com/problems/ARREQU)

Chef has an array of N integers. Chef can rearrange this array in any manner.

Chef doesn’t like the array if any two adjacent elements are equal. Determine whether there exists a rearrangement of the array that Chef likes.

## Input

- The first line will contain T - the number of test cases. Then the test cases follow.
- First line of each test case contains a single integer N - size of the array A.
- Second line of each test case contains N space-separated integers - denoting the elements of array A. 

## Constraints

- 1 ≤ T ≤ 10<sup>5</sup>
- 2 ≤ N ≤ 10<sup>5</sup>
- -10<sup>9</sup> ≤ A<sub>i</sub> ≤ 10<sup>9</sup>
- Sum of N over all test cases does not exceed 2⋅10<sup>5</sup>.

## Output

For each test case, if Chef can like any rearrangement of the array print YES, otherwise print NO.

You may print each character of the string in uppercase or lowercase (for example, the strings yes, yEs, YeS, and YES will all be treated as identical).

## Sample

- Input:
```
2
5
1 1 1 1 1
3
3 3 4
```

- Output:
```
No
Yes
```

## Explanation

- For case 1: There exists no rearrangement of the array which Chef will like.
- For case 2: A rearrangement of the array that Chef likes is [3,4,3]. Note that in this rearrangement, no two adjacent elements are equal.
