# [Problem: Non Zero Array]([https://my.newtonschool.co/playground/code/0vzuohqzxi2n](https://my.newtonschool.co/playground/code/tugd932i8ek9))

Tia has an array of n integers [a1, a2, …, an]. In one step, she can add 1 to any element of the array. Formally, in one step, they can choose any integer index i (1 ≤ i ≤ n) and do ai := ai + 1.<br>
However, her teacher gave her a special task. If either the sum or the product of all elements in the array is equal to zero, she doesn't mind doing this operation one more time.<br>
What is the minimum number of steps she needs to do to make both the sum and the product of all elements in the array different from zero? Formally, find the minimum number of steps to make a1 + a2 + … + an ≠ 0 and a1 * a2 * … * an ≠ 0.

## Input

Input consists of 2 lines:
- The first line contains an integer n — the size of the array.
- The second line contains n integers a1, a2, …, an — elements of the array.

## Constraints

**1 ≤ n ≤ 10<sup>6</sup> <br>
-100 ≤ a<sub>I</sub> ≤ 100**

## Output

Print the minimum number of steps required to make both the sum and the product of all elements in the array different from zero.

## Sample

- Input:
```
3
2 -1 -1
```

- Output:
```
1
```

## Explanation

- For case 1: <br> **In this example, the sum is 0. If they add 1 to the first element, the array will be [3, -1, -1], the sum will be equal to 1, and the product will be equal to 3.**
