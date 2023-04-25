# [Problem: Mark and Photography](https://my.newtonschool.co/playground/code/lothmeow92ac)

Mark is asked to take a group photo of **2n** people. The **i<sup>th</sup>** person has height hi units. To do so, he ordered these people into two rows, the front row and the back row, each consisting of **n** people. However, to ensure that everyone is seen properly, the **j<sup>th</sup>** person of the back row must be at least **x** units taller than the **j<sup>th</sup>** person of the front row for each **j** between 1 and **n**, inclusive.
Help Mark determine if this is possible.

## Input

The first line of the input consists of two space- separated integers **n and x** - the number of people in each row and the minimum difference Mark wants. The second line of the input consists of **2n** space separated integers denoting the height of each person in units.

## Constraints

**1 ≤ n ≤ 100** <br>
**1 ≤ x ≤ 100** <br>
**1 ≤ h<sub>i</sub> ≤ 10<sup>3</sup>** <br>

## Output

Print "YES" if Mark could arrange people satisfying his condition and "NO" otherwise.

## Sample

- Input:
```
3 6
1 3 9 10 12 16

3 1
2 5 2 2 2 5
```

- Output:
```
Yes
No
```
