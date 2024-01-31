# [Problem: Beat the Average](https://www.codechef.com/problems/ABOVEAVG)

There are N students in a class. Recently, an exam on Advanced Algorithms was conducted with maximum score M and minimum score 0. The average score of the class was found out to be exactly X.

Given that a student having score strictly greater than the average receives an A grade, find the maximum number of students that can receive an A grade.

## Input

- First line will contain T, number of test cases. Then the test cases follow.
- The only line of each test case consists of three integers N,M,X - the number of students, the maximum score and the average score respectively.

## Constraints

- 1 ≤ T ≤ 1000
- 2 ≤ N ≤ 10<sup>7</sup>
- 1 ≤ X ≤ M ≤ 100

## Output

For each test case, output in a single line, the maximum number of students who can receive A grade.

## Sample

- Input:
```
4
2 100 50
3 100 50
5 40 40
10 50 49
```

- Output:
```
1
2
0
9
```

## Explanation

- For case 1:  There are 2 students in the class. One of the possible values of scores is [99,1]. Here, the average score is (99+1)/2 = 50. Only the first student receives an A grade. It can be shown that the maximum number of students receiving an A grade is not more than 1.
