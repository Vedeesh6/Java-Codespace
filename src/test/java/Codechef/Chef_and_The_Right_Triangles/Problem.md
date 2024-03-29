# [Problem: Chef and The Right Triangles](https://www.codechef.com/problems/RIGHTRI)

The Chef is given a list of N triangles. Each triangle is identfied by the coordinates of its three corners in the 2-D cartesian plane. His job is to figure out how many of the given triangles are right triangles. A right triangle is a triangle in which one angle is a 90 degree angle. The vertices of the triangles have integer coordinates and all the triangles given are valid( three points aren't colinear ). 

## Input

The first line of the input contains an integer N denoting the number of triangles. Each of the following N lines contain six space separated integers x1 y1 x2 y2 x3 y3 where (x1, y1), (x2, y2) and (x3, y3) are the vertices of a triangle. 

## Constraints

- 1 ≤ N ≤ 100000 
- 0 ≤ x1, y1, x2, y2, x3, y3 ≤ 20

## Output

Output one integer, the number of right triangles among the given triangles.

## Sample

- Input:
```
5
0 5 19 5 0 0
17 19 12 16 19 0
5 14 6 13 8 7
0 4 0 14 3 14
0 2 0 14 9 2
```

- Output:
```
3
```

## Explanation

The first triangle and the last two triangles of the example are right triangles.
