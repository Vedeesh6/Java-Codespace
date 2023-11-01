# [Problem: Asymmetric Swaps](https://www.codechef.com/problems/ARRSWAP)

Chef has two arrays A and B of the same size N.

In one operation, Chef can:

Choose two integers i and j (1≤i,j≤N) and swap the elements A<sub>i</sub> and B<sub>j</sub>.
Chef came up with a task to find the minimum possible value of (A<sub>max</sub>−A<sub>min</sub>) after performing the swap operation any (possibly zero) number of times.

Since Chef is busy, can you help him solve this task?

Note that A<sub>max</sub> and A<sub>min</sub> denote the maximum and minimum elements of the array A respectively. 

## Input

- The first line of input will contain a single integer T, denoting the number of test cases.
- Each test case consists of multiple lines of input.
- The first line of each test case contains one integer N — the number of elements in each array.
- The second line consists of N space-separated integers A<sub>1</sub>, A<sub>2</sub>, ...,A<sub>N</sub> denoting the elements of the array A.
- The third line consists of N space-separated integers B<sub>1</sub>, B<sub>2</sub>, ...,B<sub>N</sub> denoting the elements of the array B. 

## Constraints

- 1 ≤ T ≤ 10<sup>5</sup>
- 1 ≤ N ≤ 2⋅10<sup>5</sup>
- 1 ≤ A<sub>i</sub>, B<sub>i</sub> ≤10<sup>9</sup>
- The sum of N over all test cases won't exceed 2⋅10<sup>5</sup>.

## Output

For each test case, output on a new line, the minimum possible value of (A<sub>max</sub>−A<sub>min</sub>) in the array A after doing swap operation any number of times.

## Sample

- Input:
```
3
3
2 1 3
1 4 1
4
2 1 4 3
3 2 6 2
5
2 8 4 9 7
7 3 6 8 4
```

- Output:
```
0
1
2
```

## Explanation

- For case 1: Chef can make the following operations:
  - Operation 1: Choose i=1 and j=1 and swap A<sub>1</sub> with B<sub>1</sub>
  - Operation 2: Choose i=3 and j=3 and swap A<sub>3</sub> with B<sub>3</sub>

By doing the above operations, array A becomes [1,1,1]. Here A<sub>max</sub>−A<sub>min</sub> = 0. It can be shown that this is the minimum value possible.
- For case 3: Chef can make the following operations:
   - Operation 1: Choose i=1 and j=1 and swap A<sub>1</sub> with B<sub>1</sub>
   - Operation 2: Choose i=3 and j=4 and swap A<sub>3</sub> with B<sub>4</sub>

By doing the above operations, array A becomes [7,8,8,9,7]. Here A<sub>max</sub>−A<sub>min</sub> = 2. It can be shown that this is the minimum value possible.
