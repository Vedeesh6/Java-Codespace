# [Problem: Maximize Your Profit](https://my.newtonschool.co/playground/code/638ok3fkk6jz)

As a crop dealer, you have anticipated the market rates of a specific crop for the upcoming days. You have noted down these predictions in an array named prices, where prices[i] represents the expected rate of the crop on the ith day. <br>
Your goal is to determine the best day to purchase the crop and a subsequent day to sell it in order to maximize your profit. <br>
Find out the maximum profit you can achieve from this trading strategy. If no profit can be made, return 0.

## Input

Input consists of 2 lines: <br>
- First line contains an integer n: The number of days.
- Second line contains n numbers, each representing the price of crop at a particular day.

## Constraints

**1 <= n <= 10<sup>5</sup> <br>
1 <= prices[i] <= 10<sup>6</sup>, (1 <= i <= n)**

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

- For case 1: <br> **You buy the crop on day 1 at 1 amount, ans sell it on day 5 at 5 amount.
So, Profit = 4 unit.**
