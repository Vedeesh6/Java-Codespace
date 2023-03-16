# [Problem: Meet in Time](https://my.newtonschool.co/playground/code/7gz3kb1qi1sh)

Alexa is meeting up with Bob. <br>
They have planned to meet at a place that is **D** meters away from Alexa's house in **T** minutes from now. Alexa will leave her house now and go straight to the place at a speed of **S** meters per minute. Will she arrive in time?

## Input

The input consists of three space separated integers. <br>
**D T S**

## Constraints

**1 ≤ D,T,S ≤ 10000** <br>
All values in input are integers.

## Output

If Alexa will reach the place in time, print **Yes**; otherwise, print **No**.

## Sample

- Input:
```
1000 15 80
2000 20 100
10000 1 1
```

- Output:
```
Yes
No
No
```

## Explanation

Using Formula => Distance = Speed X Time

- For case 1: <br> **Speed X Time** <br>**=> 15*80 => 1200 > 1000** <br>
- For case 2: <br> **Speed X Time** <br>**=> 20*100 => 2000 = 2000** <br>
- For case 3: <br> **Speed X Time** <br>**=> 1*1 => 1 << 10000** <br>
