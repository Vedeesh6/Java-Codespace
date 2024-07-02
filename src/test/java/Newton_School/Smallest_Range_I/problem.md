# [Problem: Smallest Range I](https://my.newtonschool.co/playground/code/f80u4a6pmvnz)

You are given an integer array nums and an integer k.
In one operation, you can choose any index i where 0 <= i < nums.length and change nums[i] to nums[i] + x where x is an integer from the range [-k, k]. You can apply this operation at most once for each index i.
The score of nums is the difference between the maximum and minimum elements in nums.
Return the minimum score of nums after applying the mentioned operation at most once for each index in it.

## Input

There are three lines of input:
- The first line will take an integer n as input representing the size of array nums
- The second line will take n space-separated integers representing elements of nums array.
- The third line will take an integer as input representing k.

## Constraints

**1 ≤ nums.length ≤ 10^4 <br>
0 ≤ nums[i] ≤ 10^4 <br>
0 ≤ k ≤ 10^4**

## Output

Print a single integer representing the minimum score of nums after applying the mentioned operation at most once for each index in it.

## Sample

- Input:
```
1
1
0

2
0 10
2
```

- Output:
```
0

6
```

## Explanation

- For case 1: <br> **nums = [1], k = 0
The score is max(nums) - min(nums) = 1 - 1 = 0.** <br>
- For case 2: <br> **nums = [0,10], k = 2
Change nums to be [2, 8]. The score is max(nums) - min(nums) = 8 - 2 = 6.**
