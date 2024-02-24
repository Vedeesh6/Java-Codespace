# [Problem: Exact Marks](https://www.codechef.com/problems/GENIUS)

Chef attempted an exam consisting of N objective questions. The marking scheme of the exam is:
- +3 marks for a correct answer.
- −1 marks for an incorrect answer.
- 0 marks for an unattempted question.

Find whether it is possible for Chef to score exactly X marks.

If it is possible, print 3 integers A, B, and C denoting the number of correct answers, incorrect answers and unattempted questions respectively.

## Input

- First line will contain T, number of test cases. Then the test cases follow.
- Each test case contains of a single line of input, two integers N,X.

## Constraints

- 1 ≤ T ≤ 1000
- 1 ≤ N ≤ 10<sup>8</sup>
- 0 ≤ X ≤ 3⋅N

## Output

For each test case, print YES if it is possible to score exactly X marks, otherwise print NO.

If the answer is YES, print 3 integers A, B and C in the next line such that:
- 0 ≤ A, B, C ≤ N
- A + B + C = N
- Chef's total score is exactly X.
  
In case of multiple answers, every valid tuple is accepted.

You may print each character of the string in uppercase or lowercase (for example, the strings yEs, yes, Yes and YES will all be treated as identical).

## Sample

- Input:
```
3
10 30
9 25
8 0
```

- Output:
```
YES
10 0 0
NO
YES
1 3 4
```

## Explanation

- For case 1: A possible way of scoring 30 marks in an exam with 10 questions is: all the 10 answers are correct. This way the score is 10⋅3=30. Thus, the values of A,B, and C are 10,0, and 0 respectively.
- For case 2: There is no possible way to score exactly 25 marks in an exam with 9 questions.
