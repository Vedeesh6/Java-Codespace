# [Problem: The Magical Riddle](https://my.newtonschool.co/playground/code/4fow0rzz3s9n)

One day, Ram was strolling through the forest when he stumbled upon a mysterious old book. He opened the book and found himself trapped inside! To escape, he had to solve a riddle. The riddle read:
<br>
"Dear stranger, you are presented with a task. Given three numbers, A, B, and C, your quest is to find the first two numbers that do not fall within the range [A, B] and are divisible by C. " <br>
Help Ram solve the riddle and escape.

## Input

The input consists of a single line containing three integers separated by spaces – A, B, and C.

## Constraints

**0 <= A <= B <= 10<sup>9</sup> <br>
1<= C <= 10<sup>5</sup>**

## Output

Print two integers X, Y (X>0 ,Y>0)– the first two integers that fulfills the riddle.

## Sample

- Input:
```
1 14 7
```

- Output:
```
21 28
```

## Explanation

- For case 1: <br> **The numbers divisible by 7 are:
7, 14, 21, 28, 35. .
In these, 21 and 28 are the first two integers that are not in the range [1, 14].**
