# [Problem: Fair_Tournament?](https://my.newtonschool.co/playground/code/lscarljvlrdo)

Four players participate in the playoff tournament. The tournament is held according to the following scheme:
- the first player will play with the second, and
- the third player with the fourth, then
- the winners of the pairs will play in the finals of the tournament.

It is known that in a match between two players, the one whose skill is greater will win. The skill of the **i<sup>th</sup> player is equal to **s<sub>i</sub>** and all skill levels are pairwise different (i.e. there are no two identical values in the array **s**).

The tournament is called fair if the two players with the highest skills meet in the finals. Determine whether the given tournament is fair.

## Input

The input consists of 4 space- spearated integers.

## Constraints

**1 ≤ s<sub>i</sub> ≤ 100** 

## Output

Print Yes if the tournament is fair, or No otherwise.

## Sample

- Input:
```
3 7 9 5
4 5 6 9
```

- Output:
```
Yes
No
```
