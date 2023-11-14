# [Problem: Ada and Dishes](https://www.codechef.com/problems/ADADISH)

Chef Ada is preparing N dishes (numbered 1 through N). For each valid i, it takes C<sub>i</sub> minutes to prepare the i-th dish. The dishes can be prepared in any order.

Ada has a kitchen with two identical burners. For each valid i, to prepare the i-th dish, she puts it on one of the burners and after C<sub>i</sub> minutes, removes it from this burner; the dish may not be removed from the burner before those C<sub>i</sub> minutes pass, because otherwise it cools down and gets spoiled. Any two dishes may be prepared simultaneously, however, no two dishes may be on the same burner at the same time. Ada may remove a dish from a burner and put another dish on the same burner at the same time.

What is the minimum time needed to prepare all dishes, i.e. reach the state where all dishes are prepared?

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains a single integer N.
- The second line contains N space-separated integers C<sub>1</sub>, C<sub>2</sub>, ..., C<sub>N</sub>.

## Constraints

- 1 ≤ T ≤ 1,000
- 1 ≤ N ≤ 4
- 1 ≤ C<sub>i</sub> ≤ 5 for each valid i

## Output

For each test case, print a single line containing one integer ― the minimum number of minutes needed to prepare all dishes.

## Sample

- Input:
```
3
3
2 2 2
3
1 2 3
4
2 3 4 5
```

- Output:
```
4
3
7
```

## Explanation

- For case 1: Place the first two dishes on the burners, wait for two minutes, remove both dishes and prepare the last one on one burner.
- For case 2: Place the first and third dish on the burners. When the first dish is prepared, remove it and put the second dish on the same burner.
- For case 3: Place the third and fourth dish on the burners. When the third dish is prepared, remove it and put the second dish on the same burner. Similarly, replace the fourth dish (when it is prepared) by the first dish on the other burner.
