# [Problem: Edward and Toys](https://my.newtonschool.co/playground/code/c7hkpit8rfh6)

Edward has N sticks. The length of the ith stick is li. Edward is making a toy by joining K of the sticks together. <br>
The length of the toy is represented by the sum of the individual sticks that compose it. Find the maximum possible length of the toy.

## Input

Input is given from Standard Input in the following format: <br>
**N K <br>
l1 l2 l3. . lN**

## Constraints

**1≤K≤N≤50 <br>
1≤l<sub>i</sub>≤50
​l<sub>i</sub> is an integer.**

## Output

Print the answer.

## Sample

- Input:
```
5 3
1 2 3 4 5

15 14
50 26 27 21 41 7 42 35 7 5 5 36 39 1 45
```

- Output:
```
12

386
```

## Explanation

- For case 1: <br> **Edward has 5 sticks with lengths 1, 2, 3, 4, and 5. He wants to join 3 sticks together. To get the maximum length, he should choose the 3 longest sticks. These are the sticks with lengths 3, 4, and 5. Their sum is 12, which is the maximum possible length of the toy.** <br>
- For case 2: <br> **Edward has 15 sticks with various lengths. He wants to join 14 sticks together. To get the maximum length, he should choose the 14 longest sticks. Their sum is 386, which is the maximum possible length of the toy.**
