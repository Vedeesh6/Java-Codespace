# [Problem: Count Ways](https://my.newtonschool.co/playground/code/dykrfhc9ftd4)

There are n stairs, and a person standing at the bottom wants to reach the top. The person can climb either 1 stair or 2 stairs at a time. Count the number of ways, the person can reach the top (order does not matter).

## Input

The first line contains a single integer representing the value n.

## Constraints

**1 ≤ N ≤ 10^6**

## Output

Print a single integer representing number of ways to reach the top.

## Sample

- Input:
```
4

5
```

- Output:
```
3

3
```

## Explanation

- For case 1: <br> **You can reach 4th stair in 3 ways. <br>
3 possible ways are: <br>
1, 1, 1, 1 <br>
1, 1, 2 <br>
2, 2<br>
Here, note that {1, 1, 2}, {1, 2, 1} and {2, 1, 1} are considered same as their order does not matter.** <br>
- For case 2: <br> **You may reach the 5th stair in 3 ways.<br>
The 3 possible ways are: <br>
1, 1, 1, 1, 1<br>
1, 1, 1, 2<br>
1, 2, 2<br>**
