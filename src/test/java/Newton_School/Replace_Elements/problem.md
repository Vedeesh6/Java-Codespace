# [Problem: Replace Elements](https://my.newtonschool.co/playground/code/ld2kupy3e6q2)

You have an array a1, a2, …, an. All ai are positive integers. In one step you can choose three distinct indices i, j, and k (i≠j; i≠k; j≠k) and assign the sum of aj and ak to ai, i. e. make ai = aj + ak. Can you make all ai lower or equal to d using the operation above any number of times (possibly, zero)?

## Input

The first line of the input consists of two space-separated integers n and d denoting the number of elements in the array a and the value d. The second line of the input consists of n space-separated integers a1, a2, …, an denoting the array a.

## Constraints

**3 ≤ n ≤ 100 <br>
1 ≤ d ≤ 100 <br>
1 ≤ ai ≤ 100**

## Output

Print Yes, if it's possible to make all elements ai less or equal than d using the operation above. Otherwise, print No.

## Sample

- Input:
```
5 3
2 3 2 5 4

5 4
2 1 5 3 6
```

- Output:
```
No

Yes
```

## Explanation

- For case 1: <br> **Here, the given array is [2, 3, 2, 5, 4] and d is 3. It's not possible to make all elements less than or equal to 3 using the operation since the smallest two numbers in the array are 2 and 2, and their sum is 4 which is greater than 3. Hence, the output is 'No'**
- For case 2: <br> **Here, the given array is [2, 1, 5, 3, 6] and d is 4. It's possible to make all elements less than or equal to 4 using the operation. The smallest two numbers in the array are 1 and 2, and their sum is 3 which is less than 4. Hence, the output is 'Yes'**
