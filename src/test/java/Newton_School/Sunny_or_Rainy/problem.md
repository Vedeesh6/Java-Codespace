# [Problem: Sunny or Rainy?](https://my.newtonschool.co/playground/code/9d6h5ot6zsn8)

You are given a string **S**, which represents a weather forecast for the seven days starting tomorrow.
The ith of those seven days is forecast to be sunny if the **i<sup>th</sup>** character of **S** is **o**, and rainy if that character is **x**. Tell us whether the **N<sup>th</sup>** day is forecast to be sunny. 

## Input

The first line of the input consists of an integer **N**.
The second line of the input consists of a string.

## Constraints

**1 ≤ N ≤ 7** <br>
**N** is an integer.
**S** is a string of length 7 consisting of **o and x**.

## Output

Print **Yes** if the **N<sup>th</sup>** of the seven days starting tomorrow is forecast to be sunny, and **No** if that day is forecast to be rainy.

## Sample

- Input:
```
4
oooxoox
7
ooooooo
```

- Output:
```
No
Yes
```

## Explanation

- For case 1: <br> **4<sup>th</sup>** character is x hence rainy** <br>
- For case 2: <br> **7<sup>th</sup>** character is o hence sunny** <br>
