# [Problem: Newton School Structure](https://my.newtonschool.co/playground/code/wqhotgrtevzw)

In Newton School, there is a director who is assigned the number 1. There are a total of n employees including the director each with a particular number assigned to them. For each employee, we are given their direct boss in the company. We need to determine the number of subordinates for each employee.

## Input

The first line of input consists of an integer n denoting the number of employees. The next line consists of n-1 space- separated integers denoting the direct boss for each of the employee 2, 3, 4,. ., n.

## Constraints

**1 ≤ n ≤ 2*10<sup>5</sup>**

## Output

Print the time **K** minutes after **21:00** in the format specified in the Problem Statement.

## Sample

- Input:
```
5
1 1 2 3

10
1 1 1 1 1 1 1 1 1
```

- Output:
```
4 1 1 0 0

9 0 0 0 0 0 0 0 0 0
```

## Explanation

- For case 1: <br> **There are 5 employees in total. Employee 2, 3 directly report to 1 (director). Employee 4 reports to 2 and Employee 5 reports to 3. So, the director has 4 subordinates (2, 3, 4, 5), Employee 2 has 1 subordinate (4), Employee 3 has 1 subordinate (5), and Employees 4 and 5 don't have any subordinates.** <br>
- For case 2: <br> **There are 10 employees in total and all employees from 2 to 10 report directly to the director (1). So, the director has 9 subordinates and all other employees have no subordinates.**
