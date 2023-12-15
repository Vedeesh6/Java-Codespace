# [Problem: Three Powers of Two](https://www.codechef.com/problems/THREEPOW2)

Chef is given a number in form of its binary representation S, having length N.

Determine if the number can be represented as a sum of exactly three non-negative powers of 2. Please refer to samples for further explanation.

Note that S will NOT contain leading zeros.

## Input

- The first line of input will contain a single integer T, denoting the number of test cases.
- Each test case consists of multiple lines of input.
  - The first line of each test case contains a single integer N, the length of the binary string.
  - The next line contains the string S, the binary representation of a number.

## Constraints

- 1 ≤ T ≤ 1000
- 1 ≤ N ≤ 2⋅10<sup>5</sup>
- S consists of 0 and 1 only, and has no leading zeros.
- The sum of N over all test cases won't exceed 2⋅10<sup>5</sup>.

## Output

For each test case, output YES if the number can be represented as sum of exactly three powers of 2.

You can print each character in uppercase or lowercase. For example YES, yes, Yes, and yES are all considered the same.

## Sample

- Input:
```
4
1
1
4
1001
5
11001
7
1101101
```

- Output:
```
NO
YES
YES
NO
```

## Explanation

- For case 1: It is not possible to represent the given number as a sum of exactly three powers of 2.
- For case 2: The given string 1001 corresponds to the number 9. We can represent 9 as a sum of exactly three powers of 2 as 9 = 2<sup>2</sup> + 2<sup>2</sup> + 2<sup>0</sup>.
- For case 3: The given string 11001 corresponds to the number 25. We can represent 25 as a sum of exactly three powers of 2 as 25 = 2<sup>4</sup> + 2<sup>3</sup> + 2<sup>0</sup>.
- for case 4: It is not possible to represent the given number as a sum of exactly three powers of 2.
