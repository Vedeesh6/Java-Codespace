# [Problem: Favorite digit](https://my.newtonschool.co/playground/code/7rb7g6y3i17t)

Edward's favorite digit among **1, …, 9 is d**. He calls a positive integer lucky if **d** occurs at least once in its decimal representation. Given **q** integers **a<sub>1</sub>**, **a<sub>2</sub>**, …, **a<sub>q</sub>**, for each **1 ≤ i ≤ q** Edward would like to know if ai can be equal to a sum of several (one or more) lucky numbers.

## Input

The first line of the input contains two integers **q and d**. The second line of the input contains **q** integers **a<sub>1</sub>**, **a<sub>2</sub>**, …, **a<sub>q</sub>**.

## Constraints

**1 ≤ q ≤ 10<sup>4</sup> <br>
1 ≤ d ≤ 9 <br>
1 ≤ a<sub>i</sub> ≤ 10<sup>9</sup>**

## Output

Print **"YES"** in a single line if a<sub>i</sub> can be equal to a sum of lucky numbers. Otherwise, print **"NO"**.

## Sample

- Input:
```
3 7
24 25 27

10 7
51 52 53 54 55 56 57 58 59 60
```

- Output:
```
YES
NO
YES

YES
YES
NO
YES
YES
YES
YES
YES
YES
NO
```
