# [Problem: Nim Game](https://my.newtonschool.co/playground/code/zpsi4qxv9ef2)

You are playing the following Nim Game with your friend:

- Initially, there is a heap of stones on the table.
- You and your friend will alternate taking turns, and you go first.
- On each turn, the person whose turn it is will remove 1 to 3 stones from the heap.
- The one who removes the last stone is the winner.
Given n, the number of stones in the heap, return true if you can win the game assuming both you and your friend play optimally, otherwise return false.

## Input

There will be a single line of input n representing the number.

## Constraints

**1 ≤ n ≤ 2<sup>31</sup> - 1**

## Output

Print true if you can win the game assuming both you and your friend play optimally, otherwise print false.

## Sample

- Input:
```
4

1
```

- Output:
```
false

true
```

## Explanation

- For case 1: <br> **n = 4
These are the possible outcomes:
1. You remove 1 stone. Your friend removes 3 stones, including the last stone. Your friend wins.
2. You remove 2 stones. Your friend removes 2 stones, including the last stone. Your friend wins.
3. You remove 3 stones. Your friend removes the last stone. Your friend wins.
In all outcomes, your friend wins.** <br>
