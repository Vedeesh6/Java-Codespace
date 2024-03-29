# [Problem: Approximately](https://www.codechef.com/problems/APPROX)

Chef has recently learnt some new facts about the famous number π. For example, he was surprised that ordinary fractions are sometimes used to represent this number approximately. For example, 22/7, 355/113 or even 103993/33102.

Soon, by calculating the value of 22/7 and 355/113 on paper Chef became quite disappointed because these values are not precise enough. For example, 22/7 differs in the third digit after the decimal point. So, these values are definitely should not be used for serious calculations.

However, Chef doesn't know anything about 103993/33102. This fraction is quite inconvenient to calculate on paper. Chef is curious how precise this value is. So he asks you to help him and to calculate the first K digits after the decimal point of such an approximation of π. He consider this ordinary fraction as infinite decimal fraction so formally he asks you to calculate this approximation truncated to the first K digits after the decimal point.

## Input

The first line of the input contains an integer T, denoting the number of test cases. The description of T test cases follows. The only line of each test case contains a single integer K.

## Constraints

- 0 ≤ K ≤ 10<sup>6</sup>
- 1 ≤ T ≤ 2000
- The sum of K over the input does not exceed 10<sup>6</sup>

## Output

For each test case output a single line containing the value of 103993/33102 truncated to the first K digits after the decimal point. Note that for K = 0 you should output just "3" without decimal point (quotes are for clarity).

## Sample

- Input:
```
3
0
6
20
```

- Output:
```
3
3.141592
3.14159265301190260407
```

## Explanation

- For case 1: Here K = 0 so we don't need to output any digits after the decimal point. The decimal point itself also should not be output.
- For case 2: Note that here we truncate (not round) the actual value of 103993/33102 to 6 digits after the decimal point. As you see from example case 3 rounded value here differs from truncated one.
- For case 3: This example is only to show that this approximation of ? is also far from perfect :)
