# [Problem: Alexa's XOR Quest](https://my.newtonschool.co/playground/code/jx8ra1dq3h8e)

Alexa loves to play with exclusive OR of numbers. She wants to find the exclusive OR of numbers **A, A+1, and A+2,....B**.

## Input

Input is given from Standard Input in the following format: <br>
A B

## Constraints

**All values in the input are integers. <br>
0≤A≤B≤10^12**

## Output

Compute the exclusive OR and print it.

## Sample

- Input:
```
2 4

123 456

123456789012 123456789012
```

- Output:
```
5

435

123456789012
```

## Explanation

- For case 1: <br> **The XOR of 2, 3 and 4 is 5. Here's how it works: The binary representation of 2 is 10, of 3 is 11, and of 4 is 100. Now, XOR all of these: 10 XOR 11 XOR 100 = 101 which is 5 in decimal.** <br>
- For case 2: <br> **The XOR of all numbers from 123 to 456 is 435.** <br>
- For case 3: <br> **Since A and B are the same, the output is the number itself, i.e., 123456789012.** <br>
