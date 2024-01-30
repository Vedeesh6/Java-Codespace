# [Problem: Raj and Company](https://my.newtonschool.co/playground/code/k24nfvnwwy7g)

Raj owns a company that undertakes substantial projects. There are n employees in Raj's company. Whenever a new project arises, Raj needs to distribute the tasks among all the employees. <br>
However, Raj finds this process exhausting and has decided to simplify it by selecting the best l employees in his company as team leaders. When there's a new project, Raj will assign tasks only to the team leaders, with each team leader being responsible for a positive number of employees. To ensure fairness, each team leader should be responsible for the same number of employees.
Additionally, every employee who is not a team leader must be under the responsibility of exactly one team leader, and no team leader is responsible for another team leader. <br>
Given the number of employees n, find how many ways Raj could choose the number of team leaders l in a manner that allows for an even distribution of employees among them.

## Input

The only line contains a single integer n (1≤n≤10^9 ).

## Output

Print a single integer representing the answer to the problem.

## Sample

- Input:
```
10
```

- Output:
```
3
```

## Explanation

- For case 1: <br> In the sample case, Ram has 3 ways:
1) choose only 1 employee as a team leader with 9 employees under his responsibility.
2) choose 2 employees as team leaders with 4 employees under the responsibility of each of them.
3) choose 5 employees as team leaders with 1 employee under the responsibility of each of them.
