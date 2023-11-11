# [Problem: Equal Coins](https://www.codechef.com/problems/EQUALCOIN)

Chef has X coins worth 1 rupee each and Y coins worth 2 rupees each. He wants to distribute all of these X+Y coins to his two sons so that the total value of coins received by each of them is the same. Find out whether Chef will be able to do so. 

## Input

- The first line of input contains a single integer T, denoting the number of testcases. The description of T test cases follows.
- Each test case consists of a single line of input containing two space-separated integers X and Y.

## Constraints

- 1 ≤ T ≤ 10<sup>3</sup> 
- 0 ≤ X, Y ≤ 10<sup>8</sup>
- X+Y > 0

## Output

For each test case, print "YES" (without quotes) if Chef can distribute all the coins equally and "NO" otherwise. You may print each character of the string in uppercase or lowercase (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).

## Sample

- Input:
```
4
2 2
1 3
4 0
1 10
```

- Output:
```
YES
NO
YES
NO
```

## Explanation

- For case 1: Chef gives each of his sons 1 coin worth one rupee and 1 coin worth two rupees.
- For case 2: Chef gives each of his sons 2 coins worth one rupee.
