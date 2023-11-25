# [Problem: Array Collection](https://my.newtonschool.co/playground/code/6y7auybs26re)

You have an array, nums, composed of positive integers, and an integer k. You can perform an operation on the array which involves removing the last element of the array and adding it to your collection. Your goal is to determine the minimum number of operations required to collect the integers 1, 2, …, k in your collection.

## Input

Input contains three lines:
- The first line contains an integer n (1 ≤ n ≤ 10^5) - the size of `nums` array.
- The second line contains n space- separated integers - the `nums` array (1 ≤ nums[i] ≤ 10^5).
- The third line contains an integer k (1 ≤ k ≤ n).

## Output

Print an integer representing the minimum number of operations needed to collect the integers `1, 2,. , k`.
Print `0` if you can not achieve the given task.

## Sample

- Input:
```
5
3 1 5 4 2
2
```

- Output:
```
4
```

## Explanation

- For case 1: <br> **After 4 operations, we collect elements 2, 4, 5, and 1, in this order. Our collection contains elements 1 and 2. Hence, the answer is 4.**
