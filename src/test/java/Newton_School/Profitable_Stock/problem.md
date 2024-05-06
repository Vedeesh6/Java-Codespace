# [Problem: Profitable Stock](https://my.newtonschool.co/playground/code/uif75tll7ewr)

You're an investor keeping track of the prices of a particular stock over several days, noted in an array called `prices`, where `prices[i]` represents the expected price of the stock on the ith day. Your want to identify the most profitable opportunity to buy and sell the stock to maximize your gain. Determine the maximum profit achievable through this trading strategy. If no profit is possible, print 0.

## Input

Input consists of 2 lines:
- First line contains an integer n: The number of days.
- Second line contains n numbers, each representing the price of stock at a particular day.

## Constraints

**1 <= n <= 10^5 <br>
1 <= prices[i] <= 10^6, (1 <= i <= n)** <br>

## Output

Print an integer, representing the maximum profit achievable.

## Sample

- Input:
```
5
1 2 3 4 5
```

- Output:
```
4
```

## Explanation

- For case 1: <br> **You buy the stock on day 1 at 1 amount, and sell it on day 5 at 5 amount. 
So, Profit = 4 unit.**
