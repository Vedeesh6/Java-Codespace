# [Problem: Find the maximum sum](https://my.newtonschool.co/playground/code/avk78awjg699)

You are given an array of **n** elements. In one step, you can pick any two elements **x** and **y** from the array such that **x** is a multiple of **2** and do the following:
- **x = x/2.**
- **y = 2*y.** <br>
You can perform the above step any number of times. Find the maximum sum of the array you can get.

## Input

The first line of input consist of an integer **n** denoting the number of elements in the array. <br>
The second line consist of **n** space-separated integer denoting the elements of the array.

## Constraints

**1 ≤ n ≤ 15 <br>
1 ≤ elements of array ≤ 16**

## Output

Output the maximal sum of array elements after performing an optimal sequence of operations.

## Sample

- Input:
```
3
2 3 4
```

- Output:
```
26
```

## Explanation
 
- For case 1: <br> **In the first step, choose x=2 and y=3, the array becomes [1,6,4]. <br>
Now, choose x=4 and y=6, the array becomes [1,12,2] <br>
Again, choose x=2 ,y=12 the array becomes [1,24,1] <br>
The sum of array = 1+ 24 + 1 = 26.(which is maximum possible)**
