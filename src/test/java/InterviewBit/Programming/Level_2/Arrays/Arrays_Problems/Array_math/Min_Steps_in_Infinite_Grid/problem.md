# [Problem: Min Steps in Infinite Grid](https://www.interviewbit.com/problems/min-steps-in-infinite-grid/)

You are in an infinite 2D grid where you can move in any of the 8 directions

(x,y) to 
 - (x-1, y-1),  
 - (x-1, y), 
 - (x-1, y+1), 
 - (x  , y-1),
 - (x  , y+1), 
 - (x+1, y-1), 
 - (x+1, y)  , 
 - (x+1, y+1)
<br>
You are given a sequence of points and the order in which you need to cover the points.. Give the minimum number of steps in which you can achieve it. You start from the first point.

**NOTE: This question is intentionally left slightly vague. Clarify the question by trying out a few cases in the “See Expected Output” section.**

## Input

Given two integer arrays **A and B**, where **A[i] is x coordinate and B[i] is y coordinate** of **i<sup>th</sup>** point respectively.

## Constraints

**1 ≤ |A| ≤ 10<sup>6</sup>** <br>
**-2 * 10<sup>13</sup> ≤ A<sub>i</sub>,B<sub>i</sub> ≤ 2 * 10<sup>13</sup>** <br>
**|A|==|B|**

## Output

Return an Integer, i.e minimum number of steps.

## Sample

- Input:
```
A = [0, 1, 1]
B = [0, 1, 2]
```

- Output:
```
2
```

## Explanation

- For case 1: <br> **Given three points are: (0, 0), (1, 1) and (1, 2). <br>
 It takes 1 step to move from (0, 0) to (1, 1). It takes one more step to move from (1, 1) to (1, 2).**
