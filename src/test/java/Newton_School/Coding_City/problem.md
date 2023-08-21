# [Problem: Coding City](https://my.newtonschool.co/playground/code/rlbd4lc397fl)

Rojina, a budding mathematician, is currently a third-class student at an elementary school. She's delving into the world of addition operations.
<br>
Recently, her teacher presented her with a challenge - a sum composed of multiple numbers, limited to only 1, 2, and 3. However, there's a catch: Rojina can only calculate the sum if the numbers are arranged in non-decreasing order. For instance, she can compute sums like 1+1+2 and 3+3, but not a sum like 1+3+2+1.
<br>
Your task is to rearrange the summands in the given sum to form a new sum that Rojina can solve with ease. Once you've rearranged the numbers, print the modified summand.

## Input

The first line contains a non-empty string s representing the sum Rojina needs to count.
<br>
String s contains no spaces. It only contains digits and characters "+". <br>
Besides, string s is a correct sum of numbers 1, 2 and 3.

## Constraints

**1 <= s.length <= 100**

## Output

Print the updated string.

## Sample

- Input:
```
1+3+2+1+2+3
```

- Output:
```
1+1+2+2+3+3
```
