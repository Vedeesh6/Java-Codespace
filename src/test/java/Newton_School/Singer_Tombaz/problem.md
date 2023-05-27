# [Problem: Singer Tombaz](https://my.newtonschool.co/playground/code/hvhis7q3lgzw)

A singer named Tombaz has a setlist of **n** songs. For each operation, the singer selects two songs **a<sub>i</sub> and a<sub>j</sub> ( i ≠ j, 1 ≤ i, j ≤ n)** which represents the duration of songs and performs one of the following:
1. If **a[i] = a[j]** make the duration of both songs equal to zero.
2. Else shorten the duration of both songs to a minimum of two durations.

Tombaz wants to know the minimum number of operations required to shorten the duration of all songs to **0**. It can be assumed that there always exists a sequence of operations to achieve this goal.

## Input

The first line contains a single integer **n**, the number of songs.
The second line contains **n** integers for the duration of the songs.

## Constraints

**2 ≤ n ≤ 100 <br>
0 ≤ a[i] ≤ 10**

## Output

Print a single integer - the minimum number of operations to change all song's duration in the sequence to ***0**.

## Sample

- Input:
```
3
1 2 3
```

- Output:
```
3
```

## Explanation

- For case 1: <br> **One of the possible ways to change all numbers in the sequence to 0 : <br>
In the 1st operation, a1 < a2, after the operation, a2 = a1 = 1. Now the sequence a is [1, 1, 3]. <br>
In the 2nd operation, a1 = a2 = 1, and after the operation, a1 = a2 = 0. Now the sequence a is [0, 0, 3]. <br>
In the 3rd operation, a2 < a3, and after the operation, a3 = 0. Now the sequence a is [0, 0, 0]. So the minimum number of operations is 3.** <br>
