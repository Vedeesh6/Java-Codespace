# [Problem: Elections](https://my.newtonschool.co/playground/code/kdlua1l4ukv9)

The elections in which three candidates participated have recently ended. The first candidate received **a** the second one received **b** votes, the third one received **c** votes. For each candidate, solve the following problem: how many votes should be added to this candidate so that he wins the election (i. e. the number of votes for this candidate was strictly greater than the number of votes for any other candidate)?

## Input

The input consists of three space- separated integers **a, b and c**.

## Constraints

**0 ≤ a, b, c ≤ 10<sup>9</sup>**

## Output

Print three space- separated integers denoting the answers to the problem for the first, second, and third candidate, respectively.

## Sample

- Input:
```
0 0 0
10 75 15
```

- Output:
```
1 1 1
66 1 61
```

## Explanation

- For case 1: <br> **each one needs 1 more vote** <br>
- For case 2: <br> **To win =>76 Differences => 66 and 61, 0 vote needed for 2nd person**
