# [Problem: False Number](https://www.codechef.com/problems/FALSNUM)

One day, Chef's friend gave him a wrong number W containing N+1 digits and said that the actual number A is the largest possible number that can be obtained from deleting exactly one digit of W. Chef was able to find A but forgot W.

Given A, find the smallest possible number W of length N+1 without leading 0's that is consistent with the story above. We can show that there is always at least one such W consistent with the story.

## Input

- The first line contains an integer T, the number of test cases. Then the test cases follow.
- Each test case contains a single line of input, an integer A.

## Constraints

- 1 ≤ T ≤ 100
- 0 ≤ A<sub>i</sub> ≤ 9 for all valid i, where A<sub>i</sub> denotes the i-th digit of A
- A<sub>1</sub> ≠ 0 (no leading zero)
- 10 ≤ ∣A∣ ≤ 5000, where ∣A∣ denotes the number of digits of A

## Output

For each testcase, output in a single line string representing the answer to the problem.

## Sample

- Input:
```
2
9876543211
12345678999
```

- Output:
```
19876543211
102345678999
```

## Explanation

It can be proven that the above output strings are the smallest possible numbers from which you can arrive at the correct number in the input.
