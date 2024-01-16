# [Problem: Single Operation Part 2](https://www.codechef.com/problems/SINGLEOP2)

Chef has the binary representation S of a number X with him. He can modify the number by applying the following operation exactly once:

Make X:=X⊕[X/(2<sup>Y</sup>)], where (1≤Y≤∣S∣) and ⊕ denotes the bitwise XOR operation.

Chef wants to minimize the value of X after performing the operation. Help Chef in determining the value of Y which will minimize the value of X after the operation.

## Input

- The first line of input will contain a single integer T, denoting the number of test cases.
- Each test case consists of two lines of inputs:
  - The first line contains the length of the binary string S.
  - The second line contains the binary string S.

## Constraints

- 1 ≤ T ≤ 5⋅10<sup>4</sup>
- 1 ≤ ∣S∣ ≤ 10<sup>5</sup>
- The sum of ∣S∣ over all test cases won't exceed 5⋅10<sup>5</sup>.
- S contains the characters 0 and 1 only.

## Output

For each test case, output on a new line, the value of Y which will minimize the value of X after the operation.

## Sample

- Input:
```
4
2
10
2
11
3
101
3
110
```

- Output:
```
2
1
2
1
```

## Explanation

- For case 1: Since S=10 is the binary representation of 2, the current value of X=2. On choosing Y=2, X becomes 2⊕[2/(2<sup>2</sup>)] = 2. We can show that this is the minimum value of X we can achieve after one operation.
