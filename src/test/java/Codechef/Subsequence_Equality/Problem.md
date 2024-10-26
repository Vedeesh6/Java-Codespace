# [Problem: Subsequence Equality](https://www.codechef.com/problems/LIKECS01)

Chef Tobby is playing a rapid fire with Bhuvan. He gives Bhuvan a string S and each time, Bhuvan has to guess whether there exists 2 equal subsequences in the string or not.

Bhuvan got a perfect score in the game with Chef Tobby. However, Chef Tobby has now asked Bhuvan to write a program that will do this automatically given a string S. Bhuvan is an intelligent man but he does not know how to write a code. Can you help him?

Find two different subsequences such that they are equal in their value, more formally, find two sequences of indices (a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>K-1</sub>, a<sub>K</sub>) and (b<sub>1</sub>, b<sub>2</sub>, ..., b<sub>K-1</sub>, b<sub>K</sub>) such that:
- 1 ≤  a<sub>i</sub>,  b<sub>i</sub> ≤ |S|
- a<sub>i</sub> < a<sub>i+1</sub> for all valid i
- b<sub>i</sub> < b<sub>i+1</sub> for all valid i
- S<sub>a<sub>i</sub></sub> = S<sub>b<sub>i</sub></sub> for all valid i
- there exist at least one i such that a<sub>i</sub> is not equal to b<sub>i</sub>

## Input

- The first line contains T, the number of test cases.
- Each of the next T lines contain one string S each.
- Input will only consist of lowercase english characters.

## Constraints

- 1 ≤ T ≤ 1000
- 1 ≤ length of S ≤ 100

## Output

For each test case, output "yes" or "no" (without quotes) as the solution to the problem.

## Sample

- Input:
```
4
likecs
venivedivici
bhuvan
codechef
```

- Output:
```
no
yes
no
yes
```

## Explanation

- For case 2: one of the possible equal subsequence is "vi" and "vi". (one at position {0, 3} and other at {4, 7}, assuming 0-based indexing).
- For case 4: one of the possible equal subsequence is "ce" and "ce". (one at position {0, 3} and other at {4, 6}, assuming 0-based indexing).
