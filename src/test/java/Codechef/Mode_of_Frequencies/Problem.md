# [Problem: Mode of Frequencies](https://www.codechef.com/problems/MODEFREQ)

Chef opted for Bio-Statistics as an Open-Elective course in his university, but soon got bored, and decided to text his friends during lectures. The instructor caught Chef, and decided to punish him, by giving him a special assignment.

There are N numbers in a list A = A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>N</sub>. Chef needs to find the mode of the frequencies of the numbers. If there are multiple modal values, report the smallest one. In other words, find the frequency of all the numbers, and then find the frequency which has the highest frequency. If multiple such frequencies exist, report the smallest (non-zero) one.

More formally, for every v such that there exists at least one i such that A<sub>i</sub> = v, find the number of j such that A<sub>j</sub> = v, and call that the frequency of v, denoted by freq(v). Then find the value w such that freq(v)=w for the most number of vs considered in the previous step. If there are multiple values w which satisfy this, output the smallest among them.

As you are one of Chef's friends, help him complete the assignment.

## Input

- The first line contains an integer T, the number of test cases.
- The first line of each test case contains an integer N, the number of values in Chef's assignment.
- The second line of each test case contains N space-separated integers, A<sub>i</sub>, denoting the values in Chef's assignment. 

## Constraints

- 1 ≤ T ≤ 100
- 1 ≤ N ≤ 10000
- 1 ≤ A<sub>i</sub> ≤ 10

## Output

 For each test case, print the mode of the frequencies of the numbers, in a new line.

## Sample

- Input:
```
2
8
5 9 2 9 7 2 5 3
9
5 9 2 9 7 2 5 3 1
```

- Output:
```
2
1
```

## Explanation

- For case 1: (2, 9 and 5) have frequency 2, while (3 and 7) have frequency 1. Three numbers have frequency 2, while 2 numbers have frequency 1. Thus, the mode of the frequencies is 2.
- For case 2: (2, 9 and 5) have frequency 2, while (3, 1 and 7) have frequency 1. Three numbers have frequency 2, and 3 numbers have frequency 1. Since there are two modal values 1 and 2, we report the smaller one: 1.
