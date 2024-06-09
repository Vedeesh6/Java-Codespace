# [Problem: Optimal Play](https://my.newtonschool.co/playground/code/uy5cs8goc5vd)

Given an integer n, two players, Tom and Jerry, take turns subtracting a proper divisor of n (i.e., a divisor less than n) from n. The player who cannot make a move loses the game. <br>
Determine whether Tom wins the game if both players play optimally. Print 1 if Tom wins, otherwise print 0. The game begins with Tom playing the first move.

## Input

The first line contains a single integer representing the value n.

## Constraints

**1 ≤ n ≤ 10^8**

## Output

Print a single integer representing winner where print 1 if Tom wins, otherwise print 0.

## Sample

- Input:
```
4

2
```

- Output:
```
1

1
```

## Explanation

- For case 1: <br> **Tom subtracts 1 from N to make N = 1. Now, Jerry isn't left with any possible turn so Tom wins the game, and therefore the output is 1.** <br>
- For case 2: <br> **1st turn: Tom subtract 1 from N as 1 is a divisor of 4 and less than 4. <br>
2nd turn: N=3, Jerry has to subtract 1 as 1 is the only divisor of 3 which is less than 3. <br>
3rd turn: N=2, Tom subtract 1 as 1 is the only divisor of 2 which is less than 2.<br>
4th turn: N=1, Jerry can't subtract any value.<br>
So, Tom wins.** 
