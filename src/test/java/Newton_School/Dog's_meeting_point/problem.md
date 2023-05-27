# [Problem: Dog's meeting point](https://my.newtonschool.co/playground/code/le9rlr1uocdy)

Mark is walking his two dogs Fido and Rover in a park. Fido walks faster than Rover. The positions of Fido and Rover can be represented as integer coordinates on a straight path. Fido is currently at position **p** and Rover is at position **q (p < q)**. Fido walks **r** meters towards the right and Rover walks **s** meters towards the left every minute. Determine if the two dogs will meet and, if so, calculate the time it will take for them to meet. If they will not meet, print **-1**.

## Input

A single line containing four positive integers **p, q, r, and s**

## Constraints

**p < q, r, s ≤ 10<sup>9</sup>**

## Output

Print the single integer, the number of minutes the two dogs will take to be at the same position, if the can't meet at one place print **-1**.

## Sample

- Input:
```
0 10 2 3
```

- Output:
```
2
```

## Explanation

- For case 1: <br> **p = 0, q = 10, r = 2, and s = 3. At the end of the first minute, Fido will be at position 2, and Rover will be at position 7. At the end of the second minute, Fido will be at position 4 and Rover will also be at position 4.**
