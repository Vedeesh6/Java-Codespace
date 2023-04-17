# [Problem: Split Numbers](https://my.newtonschool.co/playground/code/e1nybh0rxsrv)

You are given a multiset (i. e. a set that can contain multiple equal integers) containing **2n** integers. Determine if you can split it into exactly **n** pairs (e.g. each element should be in exactly one pair) so that the sum of the two elements in each pair is odd (i. e. when divided by 2, the remainder is 1).

## Input

The first line of input contains an integer **n**. The second line of the input contains **2n** integers **a<sub>1</sub>, a<sub>2</sub>, …, a<sub>2n</sub>, (0≤a<sub>i</sub>≤100)** denoting the numbers in the set.

## Constraints

**1 ≤ n ≤ 100** <br>
**0 ≤ a<sub>i</sub> ≤ 100**

## Output

Print **"Yes"** if it can be split into exactly **n** pairs so that the sum of the two elements in each pair is odd, and **"No"** otherwise.

## Sample

- Input:
```
2
2 3 4 5

3
2 3 4 5 5 5
```

- Output:
```
Yes
No
```

## Explanation

- For case 1: <br> **(2,3) and (4,5) or (2,5) and (3,4)** <br>
- For case 2: <br> **(2,3) (4,5) but still numbers are remaining**
