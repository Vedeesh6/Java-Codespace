# [Problem: Elections Result](https://my.newtonschool.co/playground/code/xuodwme1cte4)

There are a total of **N** voters in the village and three candidates were standing in the election. The first candidate got **A** votes, the second one got **B** votes and the third candidate got the remaining number of votes. Given all the **N** voters voted, find out who won. It is guaranteed that only one candidate will win.

## Input

The first line of the input contains three space- separated integers denoting **N, A, and B**.

## Constraints

**1 ≤ N, A, B ≤ 10<sup>9</sup> <br>
0 ≤ A + B ≤ N**

## Output

Print the number of votes of the winning candidate. For eg, if the first candidate won print the value of **A**.

## Sample

- Input:
```
70 25 26
```

- Output:
```
26
```

## Explanation

- For case 1: <br> **The first one got 25 votes, the second one got 26, third one got 70- (25+26) = 19 votes. <br>
So the second candidate won, hence you print 26**
