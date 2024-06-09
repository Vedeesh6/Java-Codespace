# [Problem: Max sum in the configuration](https://my.newtonschool.co/playground/code/ej47tfb5wn88)

Given an integer array(0-based indexing) A of size N, you have to find the maximum value of the sum of i x A[i] for all 0 ≤ i ≤ N-1, where A[i] is the element at index i in the array. The only operation allowed is to rotate (clockwise or counterclockwise) the array any number of times.

## Input

There will be two lines of input:
- The first line will take a single line of integers representing the number of elements in array A.
- The next line will contain n space-separated integers representing elements of array A[i].

## Constraints

**1 ≤ N ≤ 10^4 <br>
1 ≤ A[i] ≤ 1000**

## Output

Print a single integer representing the maximum value of the sum.

## Sample

- Input:
```
4
8 3 1 2

3
1 2 3
```

- Output:
```
29

8
```

## Explanation

- For case 1: <br> **A = {8, 3, 1, 2}<br>
All the configurations possible by rotating the elements are:<br>
3 1 2 8 Here the sum is 3*0+1*1+2*2+8*3 = 29<br>
1 2 8 3 Here the sum is 1*0+2*1+8*2+3*3 = 27<br>
2 8 3 1 Here the sum is 2*0+8*1+3*2+1*3 = 17<br>
8 3 1 2 Here the sum is 8*0+3*1+1*2+2*3 = 11<br>
Here the max sum is 29.** <br>
- For case 2: <br> **A = {1, 2, 3}<br>
All the configurations possible by rotating the elements are:<br>
1 2 3 Here the sum is 1*0+2*1+3*2 = 8<br>
3 1 2 Here the sum is 3*0+1*1+2*2 = 5<br>
2 3 1 Here the sum is 2*0+3*1+1*2 = 5<br>
Here the max sum is 8.**
