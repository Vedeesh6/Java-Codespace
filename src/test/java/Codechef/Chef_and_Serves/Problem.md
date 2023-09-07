# [Problem: Chef and Serves](https://www.codechef.com/problems/CHSERVE)

In a regular table tennis match, the player who serves changes every time after 2 points are scored, regardless of which players scored them. <br>
Chef and Cook are playing a different match — they decided that the player who serves would change every time after K points are scored instead (again regardless of which players scored them). When the game starts, it's Chef's turn to serve. <br>
You are given the current number of points scored by Chef and Cook (P<sub>1</sub> and P<sub>2</sub> respectively). Find out whether Chef or Cook has to serve next. 

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first and only line of each test case contains three space-separated integers P<sub>1</sub>, P<sub>2</sub> and K.

## Constraints

- 1 ≤ T ≤ 10<sup>5</sup> 
- 1 ≤ K ≤ 10<sup>9</sup>
- 0 ≤ P<sub>1</sub>, P<sub>2</sub> ≤ 10<sup>9</sup>

## Output

For each test case, print a single line containing the string "CHEF" if it is Chef's turn or "COOK" if it is Cook's turn.

## Sample

- Input:
```
3
1 3 2
0 3 2
34 55 2
```

- Output:
```
CHEF
COOK
CHEF
```

## Explanation

- For case 1: Chef serves for the first two points, Cook serves for the next two, so Chef has to serve again now. 
