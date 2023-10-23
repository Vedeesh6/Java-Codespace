# [Problem: Reconstruct the string](https://my.newtonschool.co/playground/code/inu6akl1nc6q)

Given a scrambled string of length n, and an array of n integers where the array[i] indicating the original position of the ithth character, your task is to reconstruct the original string.

## Input

Input consists of 3 lines: 
- The first line contains a string s of length n, containing only alphabetic characters (both upper- case and lower- case are possible). This represents the scrambled string.
- The second line contains an integer 'n'.
- The third line contains n integers, representing the array elements.

## Constraints

**1 <= n <= 10<sup>6</sup> <br>
0 <= array[i] <= n-1**

## Output

Print the original string by reconstructing it from the scrambled string and the given array of positions.

## Sample

- Input:
```
tnoewn
6
3 0 4 1 2 5
```

- Output:
```
newton
```

## Explanation

- For case 1: <br> **The character at the 0th position in the scrambled string "tnoewn" originally belongs at the 3rd index in the original string. The character at the 1st position ('n') should go to the 0th index, and so on. Using the array, you can reconstruct the original string as "newton".**
