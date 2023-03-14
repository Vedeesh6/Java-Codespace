# [Problem: Emilia and Bitwise Xor](https://my.newtonschool.co/playground/code/ga924e574f58)

Emilia is playing with bitwise xor. She is given integers **A** and **B** between **0 and 255 (inclusive)**. 
Help her find a non-negative integer **C** such that ***A xor C = B => (A⊕C = B)***.
It can be proved that there uniquely exists such **C**, and it will be between **0 and 255 (inclusive)**.

## Input

The input consists of two space separated integers **A** and **B**.

## Constraints

**0 ≤ A,B ≤ 225** <br>
All values in input are integers.

## Output

Print the answer.

## Sample

- Input:
```
3 6
10 12
```

- Output:
```
5
6
```

## Explanation

- For case 1: <br> **3 ⊕ 6 => 011 ⊕ 110 => 101 => 5** <br>
- For case 2: <br> **10 ⊕ 12 => 1010 ⊕ 1100 => 0110 => 6** <br>
