# [Problem: Fancy Quotes](https://www.codechef.com/problems/FANCY)

"I don't have any fancy quotes." 

Chef was reading some quotes by great people. Now, he is interested in classifying all the fancy quotes he knows. He thinks that all fancy quotes which contain the word "not" are Real Fancy; quotes that do not contain it are regularly fancy.

You are given some quotes. For each quote, you need to tell Chef if it is Real Fancy or just regularly fancy.

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first and only line of each test case contains a single string S denoting a quote.

## Constraints

- 1 ≤ T ≤ 50
- 1 ≤ ∣S∣ ≤ 100
- Each character of S is either a lowercase English letter or a space.

## Output

For each test case, print a single line containing the string "Real Fancy" or "regularly fancy" (without quotes).

## Sample

- Input:
```
2
i do not have any fancy quotes
when nothing goes right go left
```

- Output:
```
Real Fancy
regularly fancy
```

## Explanation

- For case 1: "i do <strong>not</strong> have any fancy quotes"
- For case 2: The word "not" does not appear in the given quote.
