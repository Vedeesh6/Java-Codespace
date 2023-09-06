# [Problem: Minimal Rest Points to Reach the Destination](https://my.newtonschool.co/playground/code/mkrrn3u3hi7i)

You are on a journey to reach a faraway destination. There are n rest points on the way. If you rest at a point, you get enough energy to skip more rest points than your last rest, starting from being able to skip just 1. For instance, if you rest at the first point, you can then skip one more checkpoint. If you decide to rest again afterwards, you can then skip two checkpoints, and so on.
<br>
Your task is to determine the minimum number of rest points you need to stop at in order to reach the destination.

## Input

Input consists of an integer n: the number of rest points.

## Constraints

**1 <= n <= 10<sup>9</sup>**

## Output

Print an integer representing the minimum number of stops needed to reach destination.

## Sample

- Input:
```
5
```

- Output:
```
3
```

## Explanation

- For case 1: <br> **Rest points: _ _ _ _ _
Rest points, you'll stop at: 1 1 _ 1 _
When you rest at stop 1, you can skip 1 rest point.
Now, when you stop at stop 3, you can skip 2 more rest points, reaching your destination.**
