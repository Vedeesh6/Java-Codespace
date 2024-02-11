# [Problem: Fibonacci with XOR](https://my.newtonschool.co/playground/code/cdvqdjzvtw2w)

You're to update the fibunacci series by changing the function to -  
- f(n) = f(n-1) xor f(n-2), for n>1
- f(0) = a
- f(1) = b
<br>
Given a, b and n, find f(n).  

## Input

Given three integers, a, b and n
- ( 0<= a, b <= 105)
- (1<= n <= 109)

## Output

Print f(n).

## Sample

- Input:
```
3 4 2
```

- Output:
```
7
```

## Explanation

- For case 1: <br> **f(2) = f(0)⊕f(1) = 3⊕4 = 7.**
