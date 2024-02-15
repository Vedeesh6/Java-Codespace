# [Problem: A PLUS B Remastered](https://www.codechef.com/problems/APLUSB)

You have two arrays A and B, each of size N.

You can rearrange both of these arrays in any way you want.

After rearranging A and B, construct an array C of size N, where C<sub>i</sub> = A<sub>i</sub> + B<sub>i</sub> for all 1≤i≤N.

Is it possible to have all elements in the array C equal?

If yes, print suitable rearrangements of A and B, else print −1 to mean no solution.

## Input

- The first line of input will contain a single integer T, denoting the number of test cases.
- Each test case consists of multiple lines of input.
  - The first line of each test case contains 1 integer N, the size of the arrays A and B.
  - The second line contains N integers, A<sub>1</sub>, A<sub>2</sub>,...., A<sub>N</sub> the array A.
​  - The third line contains N integers, B<sub>1</sub>, B<sub>2</sub>,...., B<sub>N</sub> the array B.

## Constraints

- 1 ≤ T ≤ 100
- 1 ≤ N ≤ 100
- 1 ≤ A<sub>i</sub>, B<sub>i</sub> ≤ 100

## Output

- For each test case, if there exists a suitable rearrangement of A and B, let D and E represent the respective rearranegments of A and B, then, print two lines :
  - The first line contains N space-separated integers D<sub>1</sub>, D<sub>2</sub>,…,D<sub>N</sub>. Note that this must be a rearrangement of A.
  - The second line contains N space-separated integers E<sub>1</sub>, E<sub>2</sub>,…,E<sub>N</sub>. Note that this must be rearrangement of B.

If multiple solutions are possible, you may print any one solution.

If there doesn't exist a suitable rearrangement, just output a new line containing the integer −1.

## Sample

- Input:
```
3
3
1 2 3
1 2 3
2
9 8
5 6
3
5 6 7
4 3 1
```

- Output:
```
3 1 2
1 3 2
8 9 
6 5 
-1
```

## Explanation

- For case 1: We rearrange array [3,1,2] and array B as [1,3,2]. Then, the array C becomes [4,4,4].
- For case 2:  We rearrange array A as [8,9] and array [6,5]. Then, the array C becomes [14,14].
- For case 3: It can be shown that no rearrangements of A and B make all elements in C equal.
