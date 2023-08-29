# [Problem: Min Capacity](https://my.newtonschool.co/playground/code/5kfp8rw343ex)

You are the head of the library management team. You are given two lists of n students. The first list (A) contains the entry times of the students while the second list (B) contains the exit times. <br>
You are required to return the minimum capacity of the library such that each student gets a seat. (Given that the list is sorted on the basis of entry time).

## Input

The first line of the input contains a single n, representing the number of students. <br>
The second line of the input contains n space separated integers where the ith number represents the entry time of the ith student. <br>
The third line of the input contains n space separated integers where the ith number represents the exit time of the ith student. <br>

## Constraints

**1 ≤ n ≤ 10<sup>5</sup> <br>
0 ≤ A[i] ≤ B[i] ≤ 2359**

## Output

Return an integer representing the minimum number of seats required in the library.

## Sample

- Input:
```
3
1000 1100 1300
1150 1150 1420
```

- Output:
```
2
```

## Explanation

- For case 1: <br> **Student 1 comes at 1000 and leaves at 1150 but student 2 comes at 1100 (Before student 1 leaves), so the minimum requirement is 2 seats so far. Then student 3 comes when both the students (1 and 2) have left.
Hence the output is 2.**
