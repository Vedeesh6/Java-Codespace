# [Problem: Chef and Pal](https://www.codechef.com/problems/ANTIPAL)

Chef just had a big argument with his best friend. He is quite upset and doesn't want anything to remind him of his pal.

Chef has to construct a binary string S of length N. He would like it to be as far from a palindrome as possible, and so he would like S to satisfy the following condition:

- Let T be the reverse of S. Then, S<sub>i</sub> != T<sub>i</sub> for every 1 ≤ i ≤ N.

Can you help Chef construct S? If there are multiple possible strings that satisfy Chef's condition, you may print any of them.

Note 1: A string S is said to be a binary string if every character of S is either '0' or '1'.

Note 2: Let S be a string of length N. String T is said to be its reverse if T<sub>i</sub> = S<sub>N+1−i</sub> for every 1≤i≤N. For example, the reverse of 10010 is 01001 and the reverse of 0110 is 0110.

## Input

- The first line of input contains a single integer T, denoting the number of test cases. The description of T test cases follows.
- Each test case consists of a single line containing one integer N — the length of the binary string Chef wants to construct.

## Constraints

- 1 ≤ T ≤ 10<sup>3</sup>
- 1 ≤ N ≤ 10<sup>5</sup>
- The sum of N across all test cases does not exceed 10<sup>5</sup>

## Output

For each test case, output a single line containing a binary string S of length N as described in the problem statement. If no such string exists, output −1 instead.

If multiple answers exist, you may print any of them.

## Sample

- Input:
```
2
9
8
```

- Output:
```
-1
10010110
```

## Explanation

- For case 1: It can be proven that there is no possible valid string S.
- For case 2: S=10010110 and T=01101001. It is easy to see that for all 1≤i≤8, S<sub>i</sub> = T<sub>i</sub>.
