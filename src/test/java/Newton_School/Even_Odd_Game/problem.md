# [Problem: Even Odd Game](https://my.newtonschool.co/playground/code/06n3ncpr3sc9)

Raj and Tia play a game called the "Even- Odd Game". Tia chooses her favorite integer n and then they take turns, starting with Raj. In each player's turn, he or she has to choose an integer a and subtract it from n with the following conditions:
- 1 ≤ a ≤ n.
- If it's Raj's turn, a has to be even. But if it's Tia's turn, a has to be odd.
- If the current player can't choose any number satisfying these conditions, he or she loses.
<br>
Can you determine the winner if both Raj and Tia play optimally?

## Input

You're given an integer n : ( 1<= n <= 10^7).

## Output

Print either "Tia" or "Raj".

## Sample

- Input:
```
1

2
```

- Output:
```
Tia

Raj
```

## Explanation

- For case 1: <br> **In this case, Raj can't choose any integer a initially because there is no positive even integer less than or equal to 1 so Tia wins.** <br>
- For case 2: <br> **Raj has to choose a = 2 and subtract it from n. It's Tia's turn and n = 0. There is no positive odd integer less than or equal to 0 so Raj wins.**
