# [Problem: Minimum Bags Required](https://my.newtonschool.co/playground/code/hn6cgp13m8y8)

You are given n bags, where the ith bag has weight capacity wt[i]. There is a total weight W that needs to be carried. Your task is to determine the minimum number of bags required to carry the total weight. If we cannot carry the weight using these bags, print -1.

## Input

The input consists of two lines:

- The first line contains an integer- n: the number of bags available, W: the total weight that needs to be carried.
- The second line contains n integers separated by spaces, representing the weight capacities of the bags.


## Constraints

**1 <= n <= 10<sup>5</sup> <br>
1 <= W <= 10<sup>9</sup> <br>
1 <= wt[i] <= 10<sup>5</sup>**

## Output

Print an integer, the minimum number of bags required to carry the total weight W.

## Sample

- Input:
```
3 5
2 1 3
```

- Output:
```
2
```

## Explanation

- For case 1: <br> **We only need bag 1 and bag 3 to store the total weight 5.
Hence the output is
2.**
