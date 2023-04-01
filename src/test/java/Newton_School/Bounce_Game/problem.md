# [Problem: Bounce Game](https://my.newtonschool.co/playground/code/diabxuw5ll3o)

A ball will bounce along a number line, making **N+1** bounces. It will make the first bounce at coordinate **D<sub>1</sub> = 0**, and the **i<sup>th</sup>** bounce (**2≤i≤N+1**) at coordinate **D<sub>i</sub> = D<sub>i</sub>−1 + L<sub>i</sub>−1**. How many times will the ball make a bounce where the coordinate is at most **X**?

## Input

The first line of the input consists of two space-separated integers **N** and **X**. The next line consists of **N** space-separated integers as follows: <br>
**N X** <br>
**L<sub>1</sub> L<sub>2</sub> . . . L<sub>n</sub>**

## Constraints

**1 ≤ N ≤ 100** <br>
**1 ≤ L<sub>i</sub> ≤ 100** <br>
**1 ≤ X ≤ 10000** <br>
All the values are integers.

## Output

Print the number of times the ball will make a bounce where the coordinate is at most **X**.

## Sample

- Input:
```
3 6
3 4 5

4 9
3 3 3 3 
```

- Output:
```
2
4
```

## Explanation

- For case 1: <br> **[0+3,3+4,3+4+5] => [3,7,12] => Count on 0 and 3** <br>
- For case 2: <br> **[0+3,0+3+3,0+3+3+3,0+3+3+3+3] => [3,6,9,12] => Count on 0 and 3 and 6 and 9**
