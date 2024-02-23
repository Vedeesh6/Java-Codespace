# [Problem: Priorities](https://my.newtonschool.co/playground/code/75b48dcxfqs0)

You are given an array of `n` integers and a number K. The integers in the array represent customer IDs, and the number of times an ID appears in the array indicates how frequently that customer has visited.
Your task is to find the top K unique IDs corresponding to the most frequent customers. If there is a tie in frequency, prioritize the customer with the higher ID number.

## Input

Input consists of three lines-
- The first line contains an integer - n : the size of the array.
- The second line contains n integers - representing the elements of the array.
- The third line contains an integer - K.

## Output

Print K integers according to the quesstion.

## Sample

- Input:
```
8
1 1 2 2 3 3 3 4
3
```

- Output:
```
3 2 1
```

## Explanation

- For case 1: <br> **Frequency of 3 is greatest, hence 3 comes. And Id of 2 > Id of 1, so 2 comes first and then 1.**
