# [Problem: Lexographically minimum](https://my.newtonschool.co/playground/code/ipolng5h4i9s)

Tia has a three- letter word composed of lowercase letters from the English alphabet. Each letter in this alphabet is numbered from 1 to 26, with "a" being 1 and "z" being 26. <br>
She created a numerical representation of this word by summing the values of its letters. For example, the word "cat" is represented as 3+1+20=24, because "c" is the 3rd letter, "a" is the 1st, and "t" is the 20th letter in the alphabet. <br>
However, Tia noticed that this method of encoding could lead to ambiguity. For instance, the word "ava" also results in the sum 1+22+1=24. <br>
Your task is to identify the alphabetically first three- letter (lexicographically smallest) word that Tia's encoding method could correspond to.

## Input

The only line contains an integer n (3 <= n <= 78).

## Output

Output the lexicographically smallest three- letter word that could have been encoded on a separate line.

## Sample

- Input:
```
70
```

- Output:
```
rzz
```
