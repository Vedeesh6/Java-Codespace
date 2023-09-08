# [Problem: Minimum height difference](https://my.newtonschool.co/playground/code/gn244zpsfqw9)

A young boy spends his days crafting buildings out of blocks, each precisely one unit in height. He builds n buildings with different heights. Now, he wants to minimise the difference between the height of the tallest building and the shortest building. <br>
To achieve this, the boy can perform the following operation any number of times:  He can select any building and relocating a block to place it atop another building. This operation causes the height of one building to decrease by 1 while increasing the height of another by 1. <br>
Help him find the minimum difference between the height of the tallest building and the shortest building by applying the operation any number of times(possibly zero).

## Input

The input consists of two lines:
- The first line contains an integer n, the number of buildings.
- The second line contains n integers, the height of each building.

## Constraints

**1 <= n <= 10<sup>5</sup> <br>
1 <= height[i] <= 10<sup>6</sup>**

## Output

Print an integer, representing the minimum difference between the tallest building and the shortest building.

## Sample

- Input:
```
6
1 8 5 4 2 8
```

- Output:
```
1
```

## Explanation

- For case 1: <br> **We can make the heights as: [ 4, 5, 5, 4, 5, 5], by following operations:**
  - Select building 2: and place its top block on top of first building 3 times. New heights will become[ 4, 5, 5, 4, 2, 8]
  - Now, Select building number 6 and place its top block on top of building 5, 3 times. New heights will now become [ 4, 5, 5, 4, 5, 5]. <br>
**Thus, the difference between the tallest and the shortest building is 1.**
