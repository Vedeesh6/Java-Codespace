[Problem: Simplify Alphabetic Streams](https://my.newtonschool.co/playground/code/41lmgg8lv7ss)

You've received a magical scroll with a string composed of alphabetic characters. However, it seems that the scroll has undergone some form of encryption or duplication, resulting in adjacent repeating characters. Your quest is to simplify this string by removing adjacent duplicates so that no adjacent characters in the simplified string are the same.

## Input

Input consists of a string s of length n (1 ≤ n ≤ 10^5), containing only alphabetic characters (both upper-case and lower-case are possible).

## Output

Print a string where all adjacent duplicate characters have been removed. If multiple solutions are possible, returning any of them is acceptable.

## Sample

- Input:
```
aabbccddeeff
```

- Output:
```
abcdef
```

## Explanation

- For case 1: <br> **Every character is doubled. By removing one of each adjacent pair, we are left with "abcdef".**
