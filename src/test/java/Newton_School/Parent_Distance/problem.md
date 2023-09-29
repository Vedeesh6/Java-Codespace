# [Problem: Parent Distance](https://my.newtonschool.co/playground/code/bv09qwd2l68b)

There are **N** people, called **Person 1, Person 2, …, Person N**. The parent of Person i (2 ≤ i ≤ N) is Person Pi. Here, it is guaranteed that Pi < i.
How many generations away from Person N is Person 1?

## Input

The first line of the input consists of an integer N. The second line consists of N space separated integers.
- N
- P1 P2 P3.. PN

## Constraints

**2 ≤ N ≤ 50 <br>
1 ≤ P<sub>i</sub> < i(2 ≤ i ≤ N) <br>
All values in input are integers.**

## Output

Print the answer as a positive integer.

## Sample

- Input:
```
3
1 2

10
1 2 3 4 5 6 7 8 9
```

- Output:
```
2

9
```

## Explanation

- For case 1: <br> **Here, N=3. The parent of Person 2 is Person 1. The parent of Person 3 is Person 2. So, to reach from Person 3 to Person 1, we need to go 2 steps: 3 -> 2 -> 1. Hence, the output is 2.** <br>
- For case 2: <br> **Here, N=10. Each person has the previous person as their parent. So, to reach from Person 10 to Person 1, we need to go 9 steps: 10 -> 9 -> 8 -> 7 -> 6 -> 5 -> 4 -> 3 -> 2 -> 1. Hence, the output is 9.**
