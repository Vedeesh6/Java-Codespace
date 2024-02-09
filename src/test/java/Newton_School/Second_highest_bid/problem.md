# [Problem: Second highest bid](https://my.newtonschool.co/playground/code/4ym6r9zq2shu)

In this task, you have to create a program for a special type of auction called a "second- price auction. " Here's how it works:

- A number of people, say n, each secretly bid a certain amount of money.
- The person who bids the highest amount wins, but instead of paying their own bid, they pay the amount of the second- highest bid.
<br>
Write a program that reads prices offered by bidders and finds the winner and the price he will pay. Consider that all of the offered prices are different.

## Input

- The first line of the input contains n (2 ≤ n ≤ 1000) — number of bidders.
- The second line contains n distinct integer numbers p1, p2,. . pn, separated by single spaces (1 ≤ pi ≤ 10000), where pi stands for the price offered by the i- th bidder.

## Output

The single output line should contain two integers: index of the winner and the price he will pay. Indices are 1- based.

## Sample

- Input:
```
2
5 7
```

- Output:
```
2 5
```

## Explanation

- For case 1: <br> **Second bidder(2) places the highest bid, and he pays the second highest bid i. e. 5.**
