# [Problem: Locate the Grassopher](https://my.newtonschool.co/playground/code/7vo9pgaf2mie)

The grasshopper is located on the numeric axis at the point with coordinate **x<sub>o</sub>**. Having nothing else to do he starts jumping between integer points on the axis. Making a jump from a point with coordinate **x** with a distance **d** to the left moves the grasshopper to a point with a coordinate **x−d**, while jumping to the right moves him to a point with a coordinate **x+d**. The grasshopper is very fond of positive integers, so for each integer, **i** starting with 1 the following holds: exactly **I** minute after the start he makes a jump with a distance of exactly **i**. So, in the first minutes, he jumps by **1**, then by **2**, and so on.
The direction of a jump is determined as follows: 
- if the point where the grasshopper was before the jump has an even coordinate, the grasshopper jumps to the left, otherwise he jumps to the right. <br>

Find exactly which point the grasshopper will be at after exactly **n** jumps.

## Input

The input consists of two space- separated integers **x<sub>o</sub>** and **n** denoting the coordinate of the grasshopper's initial position and the number of jumps.

## Constraints

**-10<sup>14</sup> ≤ x<sub>o</sub> ≤ 10<sup>14</sup>** <br>
0 ≤ n ≤ 10<sup>14</sup>**

## Output

Print the coordinate of the point the grasshopper will be at after making **n** jumps from the point **x<sub>o</sub>**.

## Sample

- Input:
```
0 1
10 10
```

- Output:
```
-1
11
```

## Explanation

- For case 1: <br> **0 (even) -> 0-1=-1** <br>
- For case 2: <br> **10 (even) -> 10-1=9 (odd) 9+2=11 (odd) 11+3=14 (even) 14-4=10 (even) 10-5=5 (odd) 5+6=11 (odd) 11+7=18 (even) 18-8=10 (even) 10-9=1 (odd) 1+10=11** <br>
