# [Problem: Lit the Bulbs](https://my.newtonschool.co/playground/code/cmoz586yg796)

You have a garland consisting of **4** colored light bulbs, the color of the **i<sup>th</sup>** light bulb is **s<sub>i</sub>**.
Initially, all the light bulbs are turned off. Your task is to turn all the light bulbs on. You can perform the following operation any number of times: 
- select a light bulb and switch its state (turn it on if it was off, and turn it off if it was on). <br>

The only restriction on the above operation is: 
- that you can apply the operation to a light bulb only if the previous operation was applied to a light bulb of a different color (the first operation can be applied to any light bulb). <br>

Calculate the minimum number of operations to turn all the light bulbs on, or report that this is impossible.

## Input

The input contains **s** — a sequence of 4 characters, where each character is a decimal digit. The **i<sup>th</sup>** character denotes the color of the **i<sup>th</sup>** light bulb.

## Output

Print one integer denoting the minimum number of operations to turn all the light bulbs on. If it is impossible to turn all the bulbs on, print **-1**.

## Sample

- Input:
```
9546
0000
```

- Output:
```
4
-1
```

## Explanation

- For case 1: <br> **Select each bulb one by one** <br>
- For case 2: <br> **No bulbs left for second round** <br>
- For case 3: <br> **21:00 + 100 => 60 min = 1 hr <br> 21 + 1 = 22 and 100 - 60 = 40 <br> 22:40** <br>
