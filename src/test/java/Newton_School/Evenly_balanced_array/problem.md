# [Problem: Evenly balanced array](https://my.newtonschool.co/playground/code/0aiay2s53bnt)

Given an array of n integers, your quest is to find the sum of those integers that have the number of even divisors not less than that of the odd divisors.

## Input

- The first line contains an integer n, representing the length of the array.
- The second line contains n integers separated by spaces, representing the elements of the array.

## Constraints

**1 <= n <= 10<sup>3</sup> <br>
1 <= arr[i] <= 10<sup>5</sup> <br>
1 <= i <= n**

## Output

Print an integer representing the sum of numbers having more even divisors than odd.

## Sample

- Input:
```
3
1 2 3
```

- Output:
```
2
```

## Explanation

- For case 1: <br> **The divisors of 1: 1
The divisors of 2: 1 2
The divisors of 3: 1 3 
In the above numbers, only the number of even divisors of 2 are more than or equal to that of odd divisors. Hence the output is 2.**
