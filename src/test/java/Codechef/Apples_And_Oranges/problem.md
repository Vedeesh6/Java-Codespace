# [Problem: Apples and Oranges](https://www.codechef.com/problems/APPLEORANGE)

## Problem
Rushitote went to a programming contest to distribute apples and oranges to the contestants. He has N apples and M oranges, which need to be divided equally amongst the contestants. Find the maximum possible number of contestants such that: <br>
- Every contestant gets an equal number of apples; and <br>
- Every contestant gets an equal number of oranges. <br>

Note that every fruit with Rushitote must be distributed, there cannot be any left over. <br>
For example, 2 apples and 4 oranges can be distributed equally to two contestants, where each one receives 1 apple and 2 oranges. <br> However, 2 apples and 5 oranges can only be distributed equally to one contestant.

## Input

- The first line of input will contain a single integer T, denoting the number of test cases. <br>
- The first and only line of each test case contains two space-separated integers N and M — the number of apples and oranges, respectively.

## Constraints

- 1 ≤ T ≤ 1000 <br>
- 1 ≤ N, M ≤ 10<sup>9</sup>

## Output

For each test case, output on a new line the answer: the maximum number of contestants such that everyone receives an equal number of apples and an equal number of oranges.

## Sample

- Input:
```
3
1 5
2 4
4 6
```

- Output:
```
1
2
2
```

## Explanation

- For case 1: There's only one apple, so distributing to more than one person is impossible. <br>
- For case 2: As explained in the statement, 2 people can each receive 1 apple and 2 oranges. <br>
- For case 3: 2 people can each receive 2 apples and 3 oranges. It's not possible to distribute equally to more than two people.
