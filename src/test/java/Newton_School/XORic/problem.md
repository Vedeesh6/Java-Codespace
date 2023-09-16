# [Problem: XORic](https://my.newtonschool.co/playground/code/ebsd1h9ez5jf)

You are given an array arr of size n and an integer K. Additionally, you have q queries, each in the form of [l, r]. For each query, you are required to perform a bitwise XOR operation on each element within the range [l, r] with a given value K.
<br>
Your task is to calculate and print the sum of all elements in the final array after performing all the specified queries.

## Input

The input consists of three lines:
<br>
The first line contains two integers-
- n : the size of the array,
- K : The number we've to XOR the array with.
<br>
The second line contains n integers separated by spaces, representing the initial array.<br>
The third line contains an integer q, the number of queries.<br>
The next q lines contain two space- separated integers l and r, representing a query.

## Constraints

**1 <= n <= 10<sup>5</sup> <br>
0 <= K <= 10<sup>9</sup> <br>
1 <= q <= 10<sup>3</sup> <br>
1 <= l <= r <= n**

## Output

Print an integer, the sum of all elements in the final array after applying all the queries.

## Sample

- Input:
```
5 2
1 2 3 4 5
3
2 4
1 3
4 5
```

- Output:
```
19
```

## Explanation

- For case 1: <br> **There are 3 queries: <br>**
  - query[1] = [2, 4]: After performing XOR in the range the array looks like: [1, 0, 1, 6, 5]
  - query[2] = [1, 3]: After performing XOR in the range the array looks like: [3, 2, 3, 6, 5]
  - query[3] = [4, 5]: After performing XOR in the range the array looks like: [3, 2, 3, 4, 7]
**<br> Now the sum of all elements of the array is: (3 + 2 + 3 + 4 + 7) = 19.**
