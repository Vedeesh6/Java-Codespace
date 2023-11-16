# [Problem: Meeting Hour Targets](https://my.newtonschool.co/playground/code/aa425ct3yr10)

In a team of n members, each member is represented by a unique number from 0 to n - 1. Each member i has contributed certain hours represented by the array hours[i]. To meet project requirements, the team needs every member to contribute at least a target number of hours. You are provided with an array of non- negative integers called "hours, " where each element hours[i] represents the hours contributed by member i. Additionally, you have a non- negative integer target representing the required number of hours for each member. Your task is to calculate and print the number of team members who have worked at least the target hours.

## Input

Input consists of three lines:
- The first line contains an integer n — the number of team members.
- The second line contains n non- negative integers hours[0], hours[1], …, hours[n-1] — the hours contributed by each team member.
- The third line contains an integer target — the required number of hours for each team member.

## Constraints

**1 ≤ n ≤ 10<sup>6</sup> <br>
0 ≤ hours[i] ≤ 10<sup>6</sup> <br>
0 ≤ target ≤ 10<sup>6</sup>**

## Output

Print an integer representing the number of team members who have contributed at least the target hours.

## Sample

- Input:
```
5
40 35 60 45 50
45
```

- Output:
```
3
```

## Explanation

- For case 1: <br> **In this example, there are 5 team members, and the target is set to 45 hours. Three team members have contributed at least 45 hours each, so the answer is 3.**
