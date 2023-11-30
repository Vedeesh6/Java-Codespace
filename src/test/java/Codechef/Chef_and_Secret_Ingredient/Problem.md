# [Problem: Chef and Secret Ingredient](https://www.codechef.com/problems/PCJ18A)

Today Chef wants to evaluate the dishes of his N students. He asks each one to cook a dish and present it to him.

Chef loves his secret ingredient, and only likes dishes with at least X grams of it. Given N, X and the amount of secret ingredient used by each student A<sub>i</sub>, find out whether Chef will like at least one dish.

## Input

- First line will contain T, number of testcases. Then the testcases follow.
- The first line of each testcase contains two integers N (number of students) and X (minimum amount of secret ingredient that a dish must contain for Chef to like it).
- The next line contains N space separated integers, A<sub>i</sub> denoting the amount of secret ingredient used by the students in their dishes. 

## Constraints

- 1 ≤ T ≤ 100
- 1 ≤ N ≤ 1000
- 1 ≤ X ≤ 1000000
- 1 ≤ A<sub>i</sub> ≤ 1000000

## Output

 For each testcase, print a single string "YES" if Chef likes at least one dish. Otherwise, print "NO". (Without quotes).

## Sample

- Input:
```
3
5 100
11 22 33 44 55
5 50
10 20 30 40 50
5 45
12 24 36 48 60
```

- Output:
```
NO
YES
YES
```
