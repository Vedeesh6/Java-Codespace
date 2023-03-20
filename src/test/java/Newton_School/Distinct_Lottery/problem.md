# [Problem: Distinct Lottery](https://my.newtonschool.co/playground/code/y6l8cl2nabdu)

You drew lottery **N** times. In the **i<sup>th</sup>** draw, you got an item of the kind represented by a string **S<sub>i</sub>**. How many kinds of items did you get? 

## Input

The first line of the input consists of a single integer **N**. The next **N** lines consists of **N** strings. <br>
**N** <br>
S<sub>1</sub>
S<sub>2</sub>
.
.
.
S<sub>N</sub>

## Constraints

**1 ≤ N ≤ 2 x 10<sup>5</sup>** <br>
**S<sub>i</sub>** consists of lowercase English letters and has a length between 1 and 10 (inclusive).

## Output

Print the number of kinds of items you got.

## Sample

- Input:
```
3
apple
orange
apple

5
grape
grape
grape
grape
grape
```

- Output:
```
2
1
```

## Explanation

- For case 1: <br> **apple and orange** <br>
- For case 2: <br> **graper only** <br>
