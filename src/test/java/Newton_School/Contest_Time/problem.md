# [Problem: Contest Time](https://my.newtonschool.co/playground/code/0vzuohqzxi2n)

Newton School Coding Contest usually starts at **21:00 IST** and lasts for **100 minutes** .
You are given an integer **K** between 0 and 100 (inclusive). Print the time **K** minutes after 21:00 in the **HH:MM** format, where **HH** denotes the hour on the 24- hour clock and **MM** denotes the minute. If the hour or the minute has just one digit, append a **0** to the beginning to represent it as a **2- digit integer** .

## Input

The input consists of a single integer.
**K**

## Constraints

**1 ≤ K ≤ 100** <br>
**K** is an integer.

## Output

Print the time **K** minutes after **21:00** in the format specified in the Problem Statement.

## Sample

- Input:
```
63
45
100
```

- Output:
```
22:03
21:45
22:40
```

## Explaination

- For case 1: <br> **21:00 + 63 => 60 min = 1 hr <br> 21 + 1 = 22 and 63 - 60 = 3 <br> 3 => 03 <br> 22:03** <br>
- For case 2: <br> **21:00 + 45 => 21:45** <br>
- For case 3: <br> **21:00 + 100 => 60 min = 1 hr <br> 21 + 1 = 22 and 100 - 60 = 40 <br> 22:40** <br>
