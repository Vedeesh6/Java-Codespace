# [Problem: Make Sequence Even](https://my.newtonschool.co/playground/code/ftfxnqi8rvi5)

Given a sequence a1, a2, …, an, find the minimum number of elements to remove from the sequence such that after the removal, the sum of every 2 consecutive elements is even.

## Input

The first line of the input consists of an integer n. The second line consists of n space- separated integers which are the elements of the sequence.

## Constraints

**3 ≤ n ≤ 10<sup>5</sup> <br>
1 ≤ a<sub>i</sub> ≤ 10<sup>9</sup>**

## Output

Print a single integer which is the minimum number of elements to remove from the sequence such that the sum of every 2 consecutive elements is even.

## Sample

- Input:
```
5
2 4 3 6 8

6
3 5 9 7 1 3
```

- Output:
```
1

0
```

## Explanation

- For case 1: <br> **In the given sequence, there are 4 even numbers (2, 4, 6, 8) and 1 odd number (3). We need to remove either odd or even numbers for the sum of two consecutive numbers to be even. Since there is only 1 odd number, it's better to remove it. So, the output is 1.** <br>
- For case 2: <br> **In the given sequence, all the numbers are odd. So, the sum of any two consecutive numbers will be even. Hence, no need to remove any numbers and the output is 0.**
