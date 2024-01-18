# [Problem: Bitwise XOR of subarrays](https://my.newtonschool.co/playground/code/2fbx1m8mmczm)

You're given an array of `n` integers. The value of an array is the bitwise- XOR of all elements. You have to find the XOR of values of all subarrays.

## Input

Input consists of two lines:
- The first line contains an integer n : the size of the array.
- The second line contains n space separated integers representing the array elements.

## Constraints

**1 <= n <= 10^5
1 <= arr[i] <= 10^6**

## Output

Print an integer representing the the XOR of values of all subarrays.

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

- For case 1: <br> **xor[1] = 1
xor[1, 2] = 3
xor[2, 3] = 1
xor[1, 2, 3] = 0
xor[2] = 2
xor[3] = 3
Result : 1 ^ 3 ^ 1 ^ 0 ^ 2 ^ 3 = 2**
