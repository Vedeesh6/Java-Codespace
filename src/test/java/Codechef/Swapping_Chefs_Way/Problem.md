# [Problem: Swapping Chefs Way](https://www.codechef.com/problems/SWAPCW)

Chef is working on his swap-based sorting algorithm for strings.

Given a string S of length N, he wants to know whether he can sort the string using his algorithm.

According to the algorithm, one can perform the following operation on string S any number of times:

Choose some index (1≤i≤N) and swap the i<sup>th</sup> character from the front and the i<sup>th</sup> character from the back.
More formally, choose an index S<sub>i</sub> and swap S<sub>(N+1−i)</sub>.

For example, dcba can be converted to abcd using one operation where i=1.

Help Chef find if it is possible to sort the string using any (possibly zero) number of operations.

## Input

- The first line of the input contains a single integer T, denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains N, the length of the string.
- The second line contains a string S of lengthN consisting of lowercase letters of the Latin alphabet. 

## Constraints

- 1 ≤ T ≤ 100
- 1 ≤ N ≤ 10<sup>3</sup>
- Sum of N over all test cases does not exceed 2⋅10<sup>3</sup>.
- S consists of lowercase Latin alphabets only.

## Output

For each test case, print YES if it is possible to sort the string by performing any number of operations. Otherwise, print NO.

You may print each character of the string in uppercase or lowercase (for example, the strings YeS, yEs, yes and YES will all be treated as identical).

## Sample

- Input:
```
3
4
dbca
3
ccc
3
bza
```

- Output:
```
YES
YES
NO
```

## Explanation

- For case 1: Chef can sort the string using 1 operation. Choose i=1 and swap S<sub>1<sub>=d and S<sub>4</sub>=a. This way, the string becomes abcd. Hence, the string is sorted.
- For case 2: Chef needs 0 operations to sort this string as it is already sorted.
- For case 3: It can be proven that the given string cannot be sorted using any number of operations.
