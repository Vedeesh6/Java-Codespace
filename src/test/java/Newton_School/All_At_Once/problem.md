# [Problem: All At Once](https://my.newtonschool.co/playground/code/vvl8rdjzhglt)

You are given an array of **n** integers **a<sub>1</sub>, a<sub>2</sub>, …, a<sub>n</sub>**. <br>
After you watched the amazing film **"All At Once"**, you came up with the following operation. In one operation, you choose **n−1** elements of the array and replace each of them with their arithmetic mean (which doesn't have to be an integer). <br>For example, from the array **[1, 2, 3, 1]** we can get the array **[2, 2, 2, 1]**, if we choose the first three elements, or we can get the array **[43, 43, 3, 43]**, if we choose all elements except the third.
Is it possible to make all elements of the array equal by performing a finite number of such operations?

## Input

The first line of the input consists of an integer **n**. The second line of the input consists of **n** space- separated integers.

## Constraints

**3 ≤ n ≤ 50** <br>
**0 ≤ a<sub>i</sub> ≤ 100**

## Output

If it is possible to make all elements equal after some number of operations, output **Yes**. Otherwise, output **No**.

## Sample

- Input:
```
3
42 42 42

3
24 2 22
```

- Output:
```
Yes
No
```
