# [Problem: Minimum number of Shovels](https://my.newtonschool.co/playground/code/c82o5o1zopkw)

Raj urgently needs to buy a shovel. He finds the right one in a store where each shovel is priced at k rupees. The store has an unlimited supply of these shovels.<br>
Raj carries an endless number of "10- rupee coins" and exactly one coin worth r rupees (where 1 ≤ r ≤ 9) in his pocket.<br>
What is the minimum number of shovels Raj must purchase so that he can pay the exact amount without needing change? It's clear that he can buy 10 shovels without requiring change (by using his 10- rupee coins and not using the r- rupee coin). However, is it possible for him to buy fewer shovels and still pay the exact amount? Note that Raj must buy at least one shovel.

## Input

The single line of input contains two integers k and r (1 ≤ k ≤ 1000, 1 ≤ r ≤ 9) — the price of one shovel and the denomination of the coin in Raj's pocket that is different from "10- rupee coins". <br>
Remember that he has an unlimited number of coins in the denomination of 10, that is, Raj has enough money to buy any number of shovels.

## Output

Print the required minimum number of shovels Raj has to buy so that he can pay for them without any change.

## Sample

- Input:
```
117 3
```

- Output:
```
9
```

## Explanation

- For case 1: <br> **Raj can buy 9 shovels and pay 9·117 = 1053 rupees. Indeed, he can pay this sum by using 10- rupee coins and one 3- rupee coin. He can't buy fewer shovels without any change.**
