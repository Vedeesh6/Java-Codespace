# [Problem: Divan and Chocolates](https://my.newtonschool.co/playground/code/zmh9ahoskw8h)

Businessman Divan loves chocolate! Today he came to a store to buy some chocolate. Like all businessmen, Divan knows the value of money, so he will not buy too expensive chocolate. At the same time, too cheap chocolate tastes bad, so he will not buy it as well. The store he came to has **n** different chocolate bars, and the price of the **i<sup>th</sup>** chocolate bar is **a<sup>i</sup>** dollars. Divan considers a chocolate bar too expensive if it costs strictly more than **r** dollars. Similarly, he considers a bar of chocolate to be too cheap if it costs strictly less than **l** dollars. Divan will not buy too cheap or too expensive bars. Divan is not going to spend all his money on chocolate bars, so he will spend at most **k** dollars on chocolates.
Please determine the maximum number of chocolate bars Divan can buy.

## Input

The first line contains integers **n, l, r, k** denoting the lowest acceptable price of a chocolate, the highest acceptable price of a chocolate and Divan's total budget, respectively. The second line contains a sequence **a<sub>1</sub>, a<sub>2</sub>, …, a<sub>n</sub> (1 ≤ a<sub>1</sub> ≤ 10<sup>9</sup>)** integers — the prices of chocolate bars in the store.

## Constraints

**1 ≤ n ≤ 100** <br>
**1 ≤ l ≤ r ≤ 10<sup>9</sup>** <br>
**1 ≤ k ≤ 10<sup>9</sup>**

## Output

Print a single integer denoting the maximum number of chocolate bars Divan can buy.

## Sample

- Input:
```
3 1 100 100
50 100 50

6 3 5 10
1 2 3 4 5 6
```

- Output:
```
2
2
```

## Explanation

- For case 1: <br> **50 and 50** <br>
- For case 2: <br> **3 and 4**
