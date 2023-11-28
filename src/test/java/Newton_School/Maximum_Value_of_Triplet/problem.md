# [Problem: Maximum Value of Triplet](https://my.newtonschool.co/playground/code/2ox468h7i319)

You are given a 0- indexed integer array nums. <br>
Print the maximum value over all triplets of indices (i, j, k) such that i < j < k. If all such triplets have a negative value, print 0.<br>
The value of a triplet of indices (i, j, k) is equal to (nums[i] - nums[j]) * nums[k].

## Input

Input contains two lines:
- The first line contains an integer n (3 ≤ n ≤ 100) - the size of `nums` array.
- The second line contains n space- separated integers - the `nums` array (1 ≤ nums[i] ≤ 10^5).

## Output

Print an integer representing the maximum value of the triplet, or 0 in case of negative value.

## Sample

- Input:
```
5
12 6 1 2 7
```

- Output:
```
77
```

## Explanation

- For case 1: <br> **The value of the triplet (0, 2, 4) is (nums[0] - nums[2]) * nums[4] = 77.
It can be shown that there are no ordered triplets of indices with a value greater than 77.**
