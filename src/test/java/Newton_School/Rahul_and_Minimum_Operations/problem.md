# [Problem: Rahul and Minimum Operations](https://my.newtonschool.co/playground/code/jopzqhnkdeev)

Rahul is an aspiring boy. He always likes to move ahead in life and increase things. He is given an array consisting of n integers. He wants to find the minimum number of operations that he needs to perform so that the array becomes increasing i. e., every element is at least as large as the previous element. In one operation he can increase the value of any element by 1. Help him find the minimum number of operations required.

## Input

The first line of input consists of an integer n. The second line consists of n space - separated integers **a1, a2, a3,. , an**.


## Constraints

**1 ≤ n ≤ 10<sup>5</sup> <br>
1 ≤ ai ≤ 10<sup>9</sup>**

## Output

Print the minimum number of operations Rahul require to make the array increasing.

## Sample

- Input:
```
10
1 1 1 1 1 1 1 1 1 1

5
3 2 5 1 7
```

- Output:
```
0
5
```

## Explanation

- For case 1: <br> **In this case, all elements are already equal. Since an array with identical elements satisfies the condition of being non-decreasing (every next element is greater or equal to the previous one), no operations are needed.** <br>
- For case 2: <br> **In this case, we have the array [3, 2, 5, 1, 7]. To make it non-decreasing, we need to perform the following operations: Increase the second element from 2 to 3 (+1 operation), and increase the fourth element from 1 to 5 (+4 operations). So, a total of 5 operations are needed.**
