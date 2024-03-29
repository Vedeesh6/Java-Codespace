# [Problem: Helping Lira](https://www.codechef.com/problems/HELPLIRA)

Lira is a little girl form Bytenicut, a small and cozy village located in the country of Byteland.

 As the village is located on a somewhat hidden and isolated area, little Lira is a bit lonely and she needs to invent new games that she can play for herself.

However, Lira is also very clever, so, she already invented a new game.

She has many stones with her, which she will display on groups of three stones on the ground on a triangle like shape and then, she will select two triangles, one with the smallest area and one with the largest area as the most beautiful ones.

While it's easy for Lira to "estimate" the areas of the triangles by their relative sizes, it's harder for her to actually calculate these areas.

But, it turns out, that Lira is also friends with YOU, an exceptional Mathematics student, and she knew that you would know exactly how to do such verification.

Lira also numbered the triangles from 1 to N, and now she wants to know the indices of the triangles with the smallest and largest area respectively.

It is now up to you, to help Lira and calculate the areas of the triangles and output their numbers. 

## Input

- The first line of the input file contains an integer, N, denoting the number of triangles on the given input file.
- Then N lines follow, each line containing six space-separated integers, denoting the coordinates x<sub>1</sub>, y<sub>1</sub>, x<sub>2</sub>, y<sub>2</sub>, x<sub>3</sub>, y<sub>3</sub>

## Constraints

- 2 ≤ N ≤ 100
- -1000 ≤ x<sub>i</sub>, y<sub>i</sub> ≤ 1000

## Output

You should output two space separated integers, the indexes of the triangles with the smallest and largest area, respectively.

If there are multiple triangles with the same area, then the last index should be printed.

## Sample

- Input:
```
2
0 0 0 100 100 0
1 1 1 5 5 1
```

- Output:
```
2 1
```

