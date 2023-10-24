# [Problem: EVM Hacking](https://www.codechef.com/problems/EVMHACK)

There are three cities and thus three EVMs. An insider told Chef that his party got A,B,C votes respectively in these three cities according to the EVMs. Also, the total number of votes cast are P,Q,R respectively for the three cities.

Chef, being the party leader, can hack at most one EVM so that his party wins. On hacking a particular EVM all the votes cast in that EVM are counted in favor of Chef's party.

A party must secure strictly more than half of the total number of votes cast in order to be considered the winner. Can Chef achieve his objective of winning by hacking at most one EVM?

## Input

- The first line of input contains an integer T, denoting the number of test cases. The description of T test cases follows.
- Each test case consists of a single line of input, containing six space-separated integers — in order, A,B,C,P,Q,R.

## Constraints

- 1 ≤ T ≤ 5⋅10<sup>3</sup>
- 0 ≤ A < P ≤ 100
- 0 ≤ B < Q ≤ 100
- 0 ≤ C < R ≤ 100

## Output

For each test case, output in a single line the answer — "YES", if Chef can win the election after hacking at most one EVM and "NO" if not.

You may print each character of the string in uppercase or lowercase (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).

## Sample

- Input:
```
3
1 1 1 3 3 3
49 1 49 50 100 50
0 0 0 1 1 1
```

- Output:
```
YES
YES
NO
```

## Explanation

- For case 1: Chef can hack any EVM, thus getting a total of 3+1+1 = 5 votes which is more than (3+3+3)/2 = 4.5 votes.
- For case 2: Only hacking the second EVM works, getting a total of 49+100+49 = 198 votes which is more than (50+100+50)/2 = 100 votes.
- For case 3: None of the EVM's can help Chef in winning the election, since maximum number of votes he can secure by doing so is 1+0+0 = 1 which is less than (1+1+1)/2 = 1.5 votes.
