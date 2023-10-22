# [Problem: Color Balanced Array](https://my.newtonschool.co/playground/code/l47njzyssazb)

You are presented with an array of n integers. Your objective is to assign colors to the elements of the array while adhering to the following rules: 1) Negative integers are to be colored in red. 2) Positive integers(greater than 0) are to be colored in green. 3) Zeroes can be colored either in green or red. Your task is to determine whether it is possible to color the array in such a way that the count of red- colored elements is equal to the count of green- colored elements. Print "Yes" if it's possible, "No" otherwise.

## Input

Input consists of two lines- 
- The first line contains three integers n.
- The second line contains n integers separated by spaces, representing the elements of the array (A[ ]) 

## Constraints

**1 <= n <= 10<sup>5</sup> <br>
1 <= A[i] <= 10<sup>9</sup>**

## Output

Print "Yes" if it is possible, "No" otherwise.

## Sample

- Input:
```
6
3 -2 0 4 -1 0
```

- Output:
```
Yes
```

## Explanation

- For case 1: <br> **In the given array, there are 2 negative integers (red), 2 positive integers (green), and 2 zeros that can be colored either red or green. By coloring one zero in red and the other in green, the count of red- colored elements becomes 3 (same as green- colored elements). Hence, it's possible to color the array in the desired form.**
