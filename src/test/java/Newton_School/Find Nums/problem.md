# [Problem: Find Nums](https://my.newtonschool.co/playground/code/rnn1ot3fqe4w)

Find if positive integers a and b for given numbers l and r so that:<br>
1) The sum a+b lies between l and r inclusive.
2) The greatest common divisor(GCD) of a and b isn't 1.
<br>
are possible or not? <br>
If no such numbers exist, print "No" else print "Yes". <br>
**For example, gcd(6, 9)=3, gcd(8, 9)=1, gcd(4, 2)=2.**

## Input

Input contains two integers **l and r (1 ≤ l ≤ r ≤ 10^6)**.

## Output

Print "Yes" if it's possible to find two numbers satisfying both the conditions, "No" otherwise.

## Sample

- Input:
```
11 15

1 3
```

- Output:
```
Yes

No
```

## Explanation

- For case 1: <br> **In the example, 11 ≤ 6+9 ≤ 15, gcd(6, 9)=3, and all conditions are satisfied. Note that this is not the only possible answer, for example, {4, 10}, {5, 10}, {6, 6} are also valid answers for this test case. Hence the output is "Yes".** <br>
- For case 2: <br> **In this example, the only pairs {a,b} that satisfy the condition 1 ≤ a+b ≤ 3 are {1,1}, {1,2}, {2,1}, but in each of these pairs gcd(a,b) equals 1, so there is no answer.**
