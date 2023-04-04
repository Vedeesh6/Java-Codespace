# [Problem: Red and Blue Beans](https://my.newtonschool.co/playground/code/rbd4jovy8yii)

You have **r** red and **b** blue beans. You'd like to distribute them among several (maybe, one) packets in such a way that each packet:
- 1. Has at least one red bean (or the number of red beans **r<sub>i</sub> ≤ 1**);
- 2. Has at least one blue bean (or the number of blue beans **b<sub>i</sub> ≤ 1**);
- 3. The number of red and blue beans should differ in no more than **d** (or **|r<sub>i</sub>−b<sub>i</sub>| ≤ d**)<br>
Can you distribute all beans?

## Input

The input consists of three space- separated integers **r, b, and d** — the number of red and blue beans and the maximum absolute difference in each packet.

## Constraints

**1 ≤ r,b ≤ 10<sup>9</sup>** <br>
**0 ≤ d ≤ 10<sup>9</sup>**

## Output

If you can distribute all beans, print **Yes**. Otherwise, print **No**.

## Sample

- Input:
```
1 1 0
6 1 4
```

- Output:
```
Yes
No
```
