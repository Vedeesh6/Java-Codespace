# [Problem: Subham and Arrays](https://my.newtonschool.co/playground/code/w78o2izc3iua)

Shubham has an array **a** of size **n**, and wants to select exactly **x** elements from it, such that their sum is odd. These elements do not have to be consecutive. The elements of the array are not guaranteed to be distinct.
<br>
Tell him whether he can do so.

## Input

The first line of input consists of two space- separated integers **n** and **x**. The next line consists of **n** space- separated integers **a<sub>1</sub>, a<sub>2</sub>,. , a<sub>n</sub>**.

## Constraints

**1 ≤ x ≤ n ≤ 100 <br>
1 ≤ a<sub>i</sub>** ≤ 1000**

## Output

Print **"Yes"** or **"No"** depending on whether it is possible to choose **x** elements such that their sum is odd.

## Sample

- Input:
```
2 2
51 50

3 3
101 102 103
```

- Output:
```
Yes
No
```

## Explanation

- For case 1: <br> **51 + 50 = 101** <br>
- For case 2: <br> **101 + 102 + 103 = 306**
