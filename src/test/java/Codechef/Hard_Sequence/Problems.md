# [Problem: Hard Sequence](https://www.codechef.com/problems/HRDSEQ)

Chef decided to write an infinite sequence. Initially, he wrote 0, and then he started repeating the following process:

- Look at the last element written so far (the l-th element if the sequence has length l so far); let's denote it by x.
- If x does not occur anywhere earlier in the sequence, the next element in the sequence is 0.
- Otherwise, look at the previous occurrence of x in the sequence, i.e. the k-th element, where k<l, this element is equal to x and all elements between the k+1-th and l−1-th are different from x. The next element is l−k, i.e. the distance between the last two occurrences of x.

The resulting sequence is (0,0,1,0,2,0,2,2,1,…): the second element is 0 since 0 occurs only once in the sequence (0), the third element is 1 since the distance between the two occurrences of 0 in the sequence (0,0) is 1, the fourth element is 0 since 1 occurs only once in the sequence (0,0,1), and so on.

Chef has given you a task to perform. Consider the N-th element of the sequence (denoted by x) and the first N elements of the sequence. Find the number of occurrences of x among these N elements.

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first and only line of each test case contains a single integer N.

## Constraints

- 1 ≤ T ≤ 128
- 1 ≤ N ≤ 128

## Output

For each test case, print a single line containing one integer ― the number of occurrences of the N-th element.

## Sample

- Input:
```
1
2
```

- Output:
```
2
```

## Explanation

- For case 1: The 2-nd element is 0. It occurs twice among the first two elements, since the first two elements are both 0.
