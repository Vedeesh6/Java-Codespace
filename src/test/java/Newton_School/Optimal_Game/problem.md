# [Problem: Optimal Game](https://my.newtonschool.co/playground/code/cquv1mjn4adi)

Ritik and Vikas stumbled upon a secret laboratory during their exploration. Within this mysterious laboratory, there are buttons awaiting their interaction. The total count of buttons is represented by a + b + c. Out of these, a buttons can only be pressed by Ritik, b buttons can only be pressed by Vikas, and c buttons are accessible to both of them. Ritik and Vikas decided to engage in a game, taking turns to press the buttons. Ritik takes the first turn.
<br>
However, there's a twist—the game ends when either of them cannot make a move. The one unable to press a button will be the loser. Your task is to determine the winner of this game, assuming both Ritik and Vikas play optimally.
<br>
Print "Ritik" if Ritik wins or "Vikas" if Vikas wins.

## Input

The first and only line of input contains a three integers a, b, and c — the count of buttons that Ritik can press, the count of buttons that Vikas can press, and the count of buttons accessible to both of them, respectively

## Constraints

**1 ≤ a, b, c ≤ 10<sup>9</sup>**

## Output

Print "Ritik" if Ritik wins, or "Vikas" if Vikas wins.

## Sample

- Input:
```
1 2 3
```

- Output:
```
Vikas
```

## Explanation

- For case 1: <br> **In the above case, the game can proceed as follows:
```
Ritik presses the 5th button.
Vikas presses the 4th button.
Ritik presses the 6th button.
Vikas presses the 3rd button.
Ritik presses the 1st button.
Vikas presses the 2nd button.
```
Ritik cannot make the turn, leading to Vikas's victory. Vikas can win regardless of Ritik's moves.
