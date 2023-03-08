# [Problem: Digits Sum](https://my.newtonschool.co/playground/code/9brlqnbq8nby)

For an integer **n** , let **S(n)** be the sum of digits in the decimal notation of **n** . For example, we have
**S(123)=1+2+3=6** . Given two 3- digit integers **A** and **B**, find the greater of **S(A)** and **S(B)** .

## Input

The input consists of two space-separated integers **A** and **B** .

## Constraints

**100 ≤ A, B ≤ 999** <br>
All values in the input are integers.

## Output

Print the value of the greater of **S(A) and S(B)** . If these are equal, print **S(A)** .

## Sample

- Input:
```
123 234 
593 953
100 999
```

- Output:
```
9
17
27
```

## Explaination

- For case 1: <br> **1+2+3 = 6 <br> 2+3+4 = 9** <br>
- For case 2: <br> **5+9+3 = 17 <br> 9+5+3 = 17** <br>
- For case 3: <br> **1+0+0 = 1 <br> 9+9+9 = 27** <br>
