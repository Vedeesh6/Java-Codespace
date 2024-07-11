# [Problem: Killing Spree](https://my.newtonschool.co/playground/code/4f03aak4x762)

Infinite People are Standing in a row, indexed from 1. A person having index 'i' has the strength of (i x i).
You have Strength 'P'. You need to tell what is the maximum number of people you can kill with your strength P.
You can only Kill a person with strength 'X', if P >= 'X'  and after killing him, Your Strength decreases by 'X'.

## Input

The input consists of a single integer.
**K**

## Constraints

**1 ≤ N ≤ 10^12**

## Output

Print a single integer representing the maximum number of people you can kill with your strength P

## Sample

- Input:
```
14

10
```

- Output:
```
3

2
```

## Explanation

- For case 1: <br> **N = 14
The strengths of people are 1, 4, 9, 16, .... and so on. We can kill the first 3 people, after which our Power becomes 0 and we can't kill anyone else. So the answer is 3.**
