# [Problem: Ordering array](https://my.newtonschool.co/playground/code/7quar4gkzewu)

An array b1, b2 ,…, bn of positive integers is good if all the sums of two adjacent elements are equal to the same value.
More formally, the array is good if there exists a k such that b[1] + b[2] = b[2] + b[3] = … = b[n−1] + b[n] = k . Doremy has an array a of length n. Now Doremy can permute its elements (change their order) however she wants. Determine if she can make the array good.

## Input

The first line of input contains a single integer n (2 ≤ n ≤ 100 ) — the length of the array a . <br>
The second line of input contains n integers a1,a2,…,an (1 ≤ a[i] ≤ 10^5 ).

## Output

Print "Yes" (without quotes), if it is possible to make the array good, and "No" (without quotes) otherwise.

## Sample

- Input:
```
3
1 1 2
```

- Output:
```
Yes
```

## Explanation

- For case 1: <br> **[1,2,1] is good because a[1] + a[2] = a[2] + a[3] = 3.**
