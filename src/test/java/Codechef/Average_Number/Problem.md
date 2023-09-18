# [Problem: Average Number](https://www.codechef.com/problems/AVG)

Chef had a sequence of positive integers with length N+K. He managed to calculate the arithmetic average of all elements of this sequence (let's denote it by V), but then, his little brother deleted K elements from it. All deleted elements had the same value. <br>
Chef still knows the remaining N elements — a sequence A<sub>1</sub>,A<sub>2</sub>,...,A<sub>N</sub>. Help him with restoring the original sequence by finding the value of the deleted elements or deciding that there is some mistake and the described scenario is impossible. <br>
Note that the if it is possible for the deleted elements to have the same value, then it can be proven that it is unique. Also note that this value must be a positive integer.

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains three space-separated integers N, K and V.
- The second line contains N space-separated integers A<sub>1</sub>,A<sub>2</sub>,...,A<sub>N</sub>.

## Constraints

- 1 ≤ T ≤ 100
- 1 ≤ N,K ≤ 100
- 1 ≤ V ≤ 10<sup>5</sup>
- 1 ≤ A<sub>i</sub> ≤ 10<sup>5</sup> for each valid i

## Output

For each test case, print a single line containing one integer — the value of the deleted elements, or −1 if there is a mistake.

## Sample

- Input:
```
3
3 3 4
2 7 3
3 1 4
7 6 5
3 3 4
2 8 3
```

- Output:
```
4
-1
-1
```
