# [Problem: Pleasing Number](https://my.newtonschool.co/playground/code/vkctwxy8ih0l)

You're given a number, find if the number is pleasing or not. <br>
A pleasing number is a positive integer that undergoes a unique transformation: the number is replaced by the sum of its digits. This process is repeated until you obtain a single-digit number. <br>
If this final single-digit number is even, then the original number is considered "Pleasing"; otherwise, it's not. <br>

## Input

Input consists of a single positive integer n (1 ≤ n ≤ 10^9).

## Output

Print "Yes" if n is a Pleasing Number and "No" if it's not.

## Sample

- Input:
```
85
```

- Output:
```
Yes
```

## Explanation

- For case 1: <br> **Starting with 85 - > 8 + 5 = 13
Then, 13 - > 1 + 3 = 4 <br>
At this point, we have obtained a single-digit number, which is 4. This single-digit number is even, so according to the rules, the original number (85) is considered a "Pleasing Number. " <br>
Thus, the output would be "Yes".**
