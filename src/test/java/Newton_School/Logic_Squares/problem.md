# [Problem: Logic Squares](https://my.newtonschool.co/playground/code/nhothqb5a1a9)

There are **4** squares lined up horizontally. You are given a string **S** of length 4 **consisting of 0 and 1** . <br>
If the **i<sup>th</sup>** character of **S** is 1, there is a person in the **i<sup>th</sup>** square from the left; if the **i<sup>th</sup>** character is 0, there is no person in the ith square from the left. <br>
Now, everyone will move to the next square to the right simultaneously. With this move, the person who was originally in the rightmost square will disappear. Determine if there will be a person in each square after the move. Print the result as a string in the same format as **S** . (See also Sample Input/Output for clarity.)

## Input

The input consists of a single string.

## Constraints

S is a string of length 4 consisting of 0 and 1.

## Output

Print a string of length 4 such that the **i<sup>th</sup>** character is 1 if there will be a person in the **i<sup>th</sup>** square from the left after the move, and 0 otherwise.

## Sample

- Input:
```
1011
0000
1111
```

- Output:
```
0101
0000
0111
```

## Explaination

- For case 1: **0 --> 101 --> 1** <br>
- For case 2: **0 --> 000 --> 0** <br>
- For case 3: **0 --> 111 --> 1** <br>
