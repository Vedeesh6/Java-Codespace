# [Problem: Cool Name](https://www.codechef.com/problems/CALPOWER)

Sardar Singh has many men fighting for him, and he would like to calculate the power of each of them to better plan for his fight against Ramadhir.

The power of a string S of lowercase English alphabets is defined to be
<sup>∣S∣</sup>∑<sub>i=1</sub>(i⋅ord(S<sub>i</sub>)) where ord(S<sub>i</sub>) is the position of S<sub>i</sub> in the alphabet, i.e, ord('a')=1, ord('b')=2, ..., ord('z')=26.

Each of Sardar Singh's men has a name consisting of lowercase English alphabets. The power of a man is defined to be the maximum power over all possible rearrangements of this string.

Find the power of each of Sardar Singh's men.

## Input

- The first line of input contains an integer T, denoting the total number of Sardar Singh's men.
- Each of the next T lines contains a single string S<sub>i</sub>, the name of Sardar Singh's i-th man.

## Constraints

- 1 ≤ T ≤ 60
- 1 ≤ ∣S<sub>i</sub>∣ ≤ 100
- S<sub>i</sub> consists of lowercase english alphabets only.

## Output

Output T lines, each containing a single integer. The i-th of these lines should have the power of the i-th of Sardar Singh's men.

## Sample

- Input:
```
1
faizal
```

- Output:
```
273
```

## Explanation

- For case 1: The rearrangement with maximum power is aafilz. Its power can be calculated as (1⋅ord('a') + 2⋅ord('a') + 3⋅ord('f') + 4⋅ord('i') + 5⋅ord('l') + 6⋅ord('z')) which equals 273. It can be verified that no rearrangement gives a larger power.
