# [Problem: Chef and Subset](https://www.codechef.com/problems/CHEFSETC)

Chef likes problems which using some math. Now he asks you to solve next one. You have 4 integers, Chef wondering is there non-empty subset which has sum equals 0.

## Input

- The first line of input contains T - number of test cases.
- Each of the next T lines containing four pairwise distinct integer numbers - a, b, c, d.

## Constraints

- 1 ≤ T ≤ 10<sup>3</sup>
- -10<sup>6</sup> ≤ a, b, c, d ≤ 10<sup>6</sup>

## Output

For each test case output "Yes", if possible to get 0 by choosing non-empty subset of {a, b, c, d} with sum equal 0, or "No" in another case.

## Sample

- Input:
```
3
1 2 0 3
1 2 4 -1
1 2 3 4
```

- Output:
```
Yes
Yes
No
```

## Explanation

- For case 1: We can choose subset {0}
- For case 2: We can choose subset {-1, 1}
