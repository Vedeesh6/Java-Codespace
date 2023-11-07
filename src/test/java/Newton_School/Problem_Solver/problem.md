# [Problem: Problem Solver](https://my.newtonschool.co/playground/code/eybui9pobczy)

Ram, a skilled problem solver, is presented with a list of problems that users faced over the last n days. Each day, there are a[i] number of problems. Ram, being resourceful, devised a strategy to efficiently tackle these problems – he aims to solve one problem from each day at a time. After solving a problem, the count of problems on that day reduces by one(If the problems exist on that day).
<br>
Help Ram determine the minimum number of days he requires to solve all the problems, adhering to his efficient strategy.

## Input

- The first line of the input contains a single integer n representing the number of days.
- The second line of the input contains n space separated integers, the problems users faced on each day.

## Constraints

**1 <= n <= 10<sup>5</sup>
1 <= prob[i] <= 10<sup>9</sup>

## Output

Print an integer representing the minimum number of days he requires to solve all the problems.

## Sample

- Input:
```
5
1 5 4 3 5
```

- Output:
```
5
```

## Explanation

- For case 1: <br> **On day 1, Ram solves problems and the problem list look like: [0, 4, 3, 2, 4]
On day 2, he solves problems and the problem list look like: [0, 3, 2, 1, 3]
On day 3, he solves problems and the problem list look like: [0, 2, 1, 1, 2]
On day 4, he solves problems and the problem list look like: [0, 1, 0, 0, 1]
On day 5, he solves problems and the problem list look like: [0, 0, 0, 0, 0]
Thus, within 5 days he solves all the problems. So the output is 5.**
