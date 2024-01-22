# [Problem: Number of Sticks](https://my.newtonschool.co/playground/code/t28nau9puo0h)

A frog named Rocher has a collection of n sticks, each with a unique length i for all 1≤i≤n. Rocher has the ability to connect two sticks, resulting in a new stick with a length equal to the sum of the lengths of the connected sticks. This process involves selecting two sticks of lengths a and b, where the connected stick has a length of a+b. <br>
The original two sticks used in the operation are then removed, and the newly connected stick becomes available for further connections. Rocher's objective is to maximize the number of sticks with the same length. While it's not mandatory for all sticks to have the same length, he aims to create as many sticks with equal lengths as possible. <br>
How many sticks with the same length can he create through this process?

## Input

The only line contains a single integer n (1≤n≤109 ).

## Output

Print a single integer.

## Sample

- Input:
```
4
```

- Output:
```
2
```

## Explanation

- For case 1: <br> **Rocher can connect two sticks with lengths 1 and 3 and he will get one stick with length 4. After that, he will have three sticks with lengths {2, 4, 4}, so two sticks have the same length, and one stick has the other length.**
