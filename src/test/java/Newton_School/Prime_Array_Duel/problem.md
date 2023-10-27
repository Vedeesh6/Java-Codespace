# [Problem: Prime Array Duel](https://my.newtonschool.co/playground/code/78653q6z5cxd)

Ravi and Tia are fascinated by numbers and often engage in playful contests. This time, they have an intriguing array of integers A with a length of n. The rules are simple: they take turns selecting prime numbers from this array. Ravi always goes first. Once a prime number is selected, it's removed from the array.
<br>
The objective for both Ravi and Tia is to maximize their own sum of prime numbers. The game continues until there are no more prime numbers left in the array. The winner is the one who has the higher sum of prime numbers at the end.
<br>
Your mission is to determine who will triumph if both Ravi and Tia play their best game. Will it be Ravi, Tia, or will the game end in a draw? Output "Ravi" if Ravi wins, "Tia" if Tia wins, and "Draw" if it's a tie.

## Input

Input consists of 2 lines:
- The first line will contain a single integer n, indicating the length of the array.
- The second line will contain n integers A1, A2,. , An, which are the elements of the array A.

## Constraints

**2 ≤ n ≤ 10<sup>5</sup> <br>
1 ≤ A[i] ≤ 10<sup>5</sup>, (1 ≤ i ≤ n)**

## Output

Print a single string: "Ravi", "Tia", or "Draw", depending on the outcome when both play their best game.

## Sample

- Input:
```
6
2 3 5 4 8 9
```

- Output:
```
Ravi
```

## Explanation

- For case 1: <br> **Ravi starts by picking 5, then Tia selects 3, and finally, Ravi chooses 2. The sum for Ravi is 5 + 2 = 7 and for Tia, it's 3. Since 7 > 3, Ravi wins the game.**
