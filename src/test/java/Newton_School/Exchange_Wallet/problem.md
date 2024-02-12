# [Problem: Exchange Wallet](https://my.newtonschool.co/playground/code/kfk6h9fzwbjs)

Tia and Raj find themselves bored, so they decide to engage in a wallet game. Tia starts with a wallet containing 'a' coins, while Raj has 'b' coins in his wallet.
The game proceeds with each player taking turns, and Tia makes the initial move. During each turn, the player must follow these steps:
- Choose whether to swap wallets with their opponent or keep their current wallets.
- Remove 1 coin from their current wallet. The wallet must have at least 1 coin before performing this step.
The player unable to make a valid move on their turn loses. If both Tia and Raj play optimally, determine which of them will emerge victorious in the game.

## Input

You're given two integers a and b, where ( 1<= a, b <= 1e9)

## Output

You've to print "Raj" or "Tia".

## Sample

- Input:
```
1 4
```

- Output:
```
Tia
```

## Explanation

- For case 1: <br> **Tia chooses to swap wallets with Raj in step 1 of her move.: Now a=4 and b=1.
  Once wallets are swapped she will remove 1 coin from the wallet she have: Now a=3 and b=1
  Raj chooses to swap wallets with Tia in step 1 of his move.:Now, a=1 and b=3.
  Once wallets are swapped he will remove 1 coin from the wallet he have: Now a=1 and b=2
Tia chooses not to swap wallets with Raj in step 2 of her move and remove 1 coin from the wallet she have.Now, a=0 and b=2.
Since Tia's wallet is empty, Raj can only choose not to swap wallets with Tia in step 2 of his move and remove 1 coin from the wallet he has. Now, a=0 and b=1.
Since Tia's wallet is empty, Tia can only choose to swap wallets with Raj in step 3 of her move and after swapping remove 1 coin from it. Now, a=0 and b=0.
Since both Tia's wallet and Raj's wallet are empty, Raj is unable to make a move. Hence, Tia wins.**
