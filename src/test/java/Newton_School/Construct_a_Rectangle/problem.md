# [Problem: Construct a Rectangle](https://my.newtonschool.co/playground/code/896rx2dztzlp)

There are three sticks with integer lengths **l1, l2 and l3**. You are asked to break exactly one of them into two pieces in such a way that:
- both pieces have positive (strictly greater than 0) integer length;
- the total length of the pieces is equal to the original length of the stick;
- it's possible to construct a rectangle from the resulting four sticks such that each stick is used as exactly one of its sides. A square is also considered a rectangle.

<br>
Determine if it's possible to do that.

## Input

The input consists of 3 space- separated integers l1, l2 and l3.The input consists of 3 space- separated integers l1, l2 and l3.

## Constraints

**1 ≤ l<sub>i</sub> ≤ 10<sup>8</sup>**

## Output

Print "Yes" if it's possible to break one of the sticks into two pieces with positive integer length in such a way that it's possible to construct a rectangle from the resulting four sticks. Otherwise, print "No".

## Sample

- Input:
```
6 1 5
2 5 2
```

- Output:
```
Yes
No
```

## Explanation

- For case 1: <br> **6 into 1 and 5** <br>
- For case 2: <br> **not possible** <br>
- For case 3: <br> **21:00 + 100 => 60 min = 1 hr <br> 21 + 1 = 22 and 100 - 60 = 40 <br> 22:40** <br>
