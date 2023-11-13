# [Problem: Passing the Parcel - ll](https://my.newtonschool.co/playground/code/d64jlhpl91ts)

There is a line of n people labeled from 1 to n. The person at the front of the line initially holds a parcel. Every second, the person with the parcel passes it to the next person in the line. Once the parcel reaches the end of the line, it changes direction, and people continue passing the parcel in the opposite direction.
<br>
For example, if n = 4, the passing of the parcel looks like this: 1 - > 2 - > 3 - > 4 - > 3 - > 2 - > 1 - > 2 - > 3 - > 4 - >. .
<br>
You are given two positive integers, n and time. Your task is to determine the index of the person holding the parcel after time seconds have passed.

## Input

Input consist of two positive integers-
- n : the number of people in the line, and
- time : the number of seconds.

## Constraints

**1 ≤ n ≤ 10<sup>9</sup> <br>
1 ≤ time ≤ 10<sup>9</sup>**

## Output

Print an integer, the index of the person holding the parcel after time seconds.

## Sample

- Input:
```
4 5
```

- Output:
```
2
```

## Explanation

- For case 1: <br> **People pass the pillow in the following way: 1 - > 2 - > 3 - > 4 - > 3 - > 2.
After five seconds, the pillow is held by the 2nd person.**
