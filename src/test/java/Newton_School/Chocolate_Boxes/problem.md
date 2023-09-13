# [Problem: Chocolate Boxes](https://my.newtonschool.co/playground/code/5u1bxtbmb4j5)

There are n chocolates of various sizes and shapes, each carrying its own weight and delight. You are given an array of n integers that represents the weights of chocolates. You want to distribute chocolates among a collection of exquisite boxes, which can hold maximum W amount of weight only. However, there's a rule – each box can hold at most two chocolates, provided their combined weight doesn't exceed the limit(W).<br>
You want to efficiently distribute the chocolates. Find the total boxes needed to distribute all n chocolates.

## Input

The input consists of two lines:
- The first line contains two integers- n: the number of chocolates in the collection, and W: The weight limit of boxes.
- The second line contains n integers separated by spaces, representing the weights of the chocolates.

## Constraints

**1 <= n <= 10<sup>3</sup> <br>
1 <= W <= 10<sup>9</sup> <br>
1 <= wt[i] <= 10<sup>5</sup>**

## Output

Print an integer, the minimum number of boxes required to carry all the chocolates while adhering to the weight limit.

## Sample

- Input:
```
4 3
2 3 2 1
```

- Output:
```
3
```

## Explanation

- For case 1: <br> **In the first chocolate box place chocolates with (2, 1)
In the second box place chocolates with (2)
And in the third box place chocolates with (3).
Thus we need 3 boxes.**
