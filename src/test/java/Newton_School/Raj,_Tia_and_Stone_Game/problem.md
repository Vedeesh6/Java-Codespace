# [Problem: Raj, Tia and Stone Game](https://my.newtonschool.co/playground/code/h51kqxvxpjs9)

Tia and Raj are engaged in a game. Each of them has a specific positive number that remains constant throughout the game. Tia's number is denoted as "a, " and Raj's number is denoted as "b. " They also have a heap of "n" stones. The game proceeds as follows:

- Tia starts the game.

1) In each turn, a player must take a certain number of stones from the heap.
2) The number of stones a player can take is determined by finding the greatest common divisor (GCD) of their fixed number and the number of stones left in the heap.
3) If a player cannot take the required number of stones (i. e., the heap has fewer stones left than the GCD), they lose the game.
<br>
Your task is to determine, based on the values of "a, " "b, " and "n, " which of Tia or Raj will win the game.

## Input

You will be given a single line containing three space- separated integers: "a", "b", and "n" (1 ≤ a, b, n ≤ 100).

## Constraints

**If Tia wins the game, print "0" (without quotes). <br>
If Raj wins the game, print "1" (without quotes).**

## Output

Print the time **K** minutes after **21:00** in the format specified in the Problem Statement.

## Sample

- Input:
```
3 5 9
```

- Output:
```
0
```

## Explanation

- For case 1: <br> The game is played as follows:
1) Tia takes gcd(3, 9) = 3 stones from the heap, leaving 6 stones.
2) Raj takes gcd(5, 6) = 1 stone, leaving 5 stones.
3) Tia takes gcd(3, 5) = 1 stone, leaving 4 stones.
4) Raj takes gcd(5, 4) = 1 stone, leaving 3 stones.
5) Tia takes gcd(3, 3) = 3 stones, emptying the heap, and Tia wins.
