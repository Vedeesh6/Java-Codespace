# [Problem: Reduce the array into rank](https://my.newtonschool.co/playground/code/dxs6xaymjx5w)

You're given an array, a[], of size n. Recuce its elements from 0 to n-1. The order of elements is same, i. e.,  0 is placed in place of smallest element,  1 is placed for second smallest element, and n-1 is placed for the largest element.

## Input

Input consists of two lines:
- The first line contains an integer n : the size of the array.
- The second line contains n space separated integers representing the array elements.

## Constraints

**1 <= n <= 10^5 <br>
1 <= a[i] <= 10^6**

## Output

Print the reduced array.

## Sample

- Input:
```
5
5 10 40 30 20
```

- Output:
```
0 1 4 3 2
```

## Explanation

- For case 1: <br> **As 5 is smallest element, it's replaced by 0. Then 10 is 2nd smallest element, so it's replaced by 1. Then 20 is 3rd smallest element, so it's replaced by 2. And so on.**
