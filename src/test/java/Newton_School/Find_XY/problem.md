# [Problem: Find XY](https://my.newtonschool.co/playground/code/1hutqayvuize)

You're given two integers, L and R.  Find if there exists two integers X and Y such that (L ≤ X < Y ≤ R) and L ≤ LCM(X, Y) ≤ R or not. Print "YES" if these exists, "NO" Otherwise.
<br>
Note: LCM(x, y) be the minimum positive integer that is divisible by both x and y.

## Input

The only line contains two integers L and R separated by space (1 ≤ L< R ≤ 109).

## Output

Print "YES" or "NO".

## Sample

- Input:
```
13 69
```

- Output:
```
YES
```

## Explanation

- For case 1: <br> **One of the solutions can be, 14 and 21. LCM (14, 21) = 42 Since, 13 <= 14 < 21 <= 69 and 13 <= 42 <= 69.**
