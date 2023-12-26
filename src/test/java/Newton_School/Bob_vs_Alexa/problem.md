# [Problem: Bob vs Alexa](https://my.newtonschool.co/playground/code/t3a7pc9kfd3t)

Two friends Alexa and Bob are playing a game in which Alexa gives Bob two strings A and B. Bob has to determine if string B is a subsequence of string A or not.

## Input

The first line of input consists of a string A, The second line of input consist of another string B.

## Constraints

**1 ≤ A ≤ 100 <br>
1 ≤ B ≤ 100**

## Output

Print "Yes" if string B is a subsequence of string A else print "No".

## Sample

- Input:
```
newton
ntn

school
schlo
```

- Output:
```
Yes

No
```

## Explanation

- For case 1: <br> **The string 'ntn' is a subsequence of the string 'newton' as we can find 'n', 't', 'n' in 'newton' in the same order.** <br>
- For case 2: <br> **The string 'schlo' is not a subsequence of the string 'school' because the order of 'l' and 'o' in 'schlo' does not match with their order in 'school'.** <br>
