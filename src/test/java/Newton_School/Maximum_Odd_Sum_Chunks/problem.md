# [Problem: Maximum Odd Sum Chunks](https://my.newtonschool.co/playground/code/ix32ea19g8tg)

You have a collection of n cards, each of which has a number written on it. There are k cards with odd numbers, and the rest are even numbers. Your goal is to divide these cards into chunks in such a way that the sum of numbers in each chunk is odd, and each chunk contains more than one card. You need to determine the maximum number of chunks that can be created under these constraints.

## Input

The only line of the input contains two integers n and k representing the number of cards and the number of cards having odd numbers.

## Constraints

**1<=k<=n<=10<sup>9</sup>**

## Output

Print an integer representing the maximum number of chunks that can be created with the given cards.

## Sample

- Input:
```
6 5
```

- Output:
```
2
```

## Explanation

- For case 1: <br> **Odd numbers = 5
Even numbers = 1
First chunks - 1 even number card and 1 odd number card
Second chunk - 3 odd number cards
We're left with one card with odd number but we can't create a chunk with single card.
So, the output is 2.**
