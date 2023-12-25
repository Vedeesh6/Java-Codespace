# [Problem: Chef and Subset Additions](https://www.codechef.com/problems/SUBSTADD)

Chef is asked to write a program that takes an array A of length N and two integers X,Y as input and modifies it as follows:

- Choose a random subset of elements of A (possibly empty)
- Increase all the elements of the chosen subset by X
- Increase the remaining elements in A by Y

You are given N, X, Y, A and the array B that is returned by Chef's program. Determine whether Chef's program gave the correct output.

## Input

- The first line contains an integer T, the number of testcases. The description of the T testcases follow.
- Each testcase contains 3 lines.
- The first line of each testcase contains a three space separated integers N,X,Y respectively.
- The second line of each testcase contains N space separate integers, the elements of the array A.
- The third line of each testcase contains N space separate integers, the elements of the array B.

## Constraints

- 1 ≤ T ≤ 10
- 1 ≤ N ≤ 1000
- 0 ≤ X, Y ≤ 1000
- 0 ≤ A<sub>i</sub> ≤ B<sub>i</sub> ≤ 1000 for all indices i

## Output

- For each testcase, print in a single line either yes or no, according to whether Chef's program gave a valid output or not.
- You may output the answers in any case, for example the words Yes, YeS, YES, yES are all considered equivalent to yes.

## Sample

- Input:
```
3
3 2 5
9 5 1
11 10 3
3 2 5
9 5 1
11 7 3
3 2 5
9 5 1
11 7 7
```

- Output:
```
Yes
Yes
No
```

## Explanation

- For case 1: The array A is {9,5,1}. If the chosen elements are 9,1 then the expected output would be {11,10,3}, so the answer is yes.
- For case 2: The array A is {9,5,1}. If the chosen elements are 9,5,1 then the expected output would be {11,7,3}, so the answer is yes.
- For case 3: The array A is {9,5,1}. There is no subset that can be chosen so that the expected output would be {11,7,7}, so Chef's implementation must be incorrect and the answer is no.
