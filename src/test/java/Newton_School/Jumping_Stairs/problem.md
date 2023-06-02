# [Problem: Jumping Stairs](https://my.newtonschool.co/playground/code/x85f0bkolj16)

There are **n** stairs, and you are standing on the first one. From each step **i**, you can take a maximum jump of **k** steps **(i+1, i+2, i+3, ..., i+k)**, but you cannot jump over the last step (stair number **n**). Your task is to calculate the number of possible ways to reach the **n<sup>th</sup>** step.

## Input

The first line contains two integers **n and k**.

## Constraints

**1 ≤ n ≤ 10<sup>4</sup> <br>
1 ≤ k ≤ 10<sup>3</sup>**

## Output

Print the answer modulo **10<sup>9</sup>+ 7**.

## Sample

- Input:
```
5 2

5 1
```

- Output:
```
5
1
```

## Explanation

- For case 1: <br> **There are 5 stairs and a maximum jump of 2 steps. The possible ways to reach the 5th stair are: (1,2,3,4,5), (1,2,3,5), (1,2,4,5), (1,3,4,5), and (1,3,5).**
- For case 2: <br> **There are 5 stairs and a maximum jump of 1 step. The only possible way to reach the 5th stair is to climb each stair one by one: (1,2,3,4,5).**
