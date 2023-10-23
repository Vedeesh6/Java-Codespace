# [Problem: Chef and Party](https://www.codechef.com/problems/CHFPARTY)

Tonight, Chef would like to hold a party for his N friends.

All friends are invited and they arrive at the party one by one in an arbitrary order. However, they have certain conditions — for each valid i, when the i-th friend arrives at the party and sees that at that point, strictly less than A<sub>i</sub> other people (excluding Chef) have joined the party, this friend leaves the party; otherwise, this friend joins the party.

Help Chef estimate how successful the party can be — find the maximum number of his friends who could join the party (for an optimal choice of the order of arrivals).

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains a single integer N.
- The second line contains N space-separated integers A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>N</sub>.

## Constraints

- 1 ≤ T ≤ 1,000
- 1 ≤ N ≤ 10<sup>5</sup>
- The sum of N over all test cases does not exceed 10<sup>6</sup>

## Output

For each test case, print a single line containing one integer — the maximum number of Chef's friends who could join the party.

## Sample

- Input:
```
3
2
0 0
6
3 1 0 0 5 5
3
1 2 3
```

- Output:
```
2
4
0
```

## Explanation

- For case 1: Chef has two friends. Both of them do not require anyone else to be at the party before they join, so they will both definitely join the party.
- For case 2: At the beginning, friends 3 and 4 can arrive and join the party, since they do not require anyone else to be at the party before they join. After that, friend 2 can arrive; this friend would see that there are two people at the party and therefore also join. Then, friend 1 will also join, so in the end, there would be 4 people attending the party.
- For case 3: No one will attend the party because each of Chef's friends will find zero people at the party and leave, regardless of the order in which they arrive.
