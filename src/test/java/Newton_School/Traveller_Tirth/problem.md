# [Problem: Traveller Tirth](https://my.newtonschool.co/playground/code/n1lix1scedfo)

Tirth loves travelling and he plans to visit n places in his vacations. He consults with his friends, and they suggest n fascinating places he should visit. However, each of these places comes with a unique rating given by his friends, ranging from low to high. Tirth decides that he wants to visit these places in ascending order based on their ratings, starting from the least rated destination and culminating at the most highly rated one.<br>
Your task is to help Tirth determine the order in which he should visit these n places based on their ratings.

## Input

Input consists of 2 lines:
- The first line contains a single integer n, representing the number of places he plans to visit.
- The second line contains n space- separated integers r1, r2,. , rn, each representing the unique rating of the ith place.

## Constraints

**1 ≤ n ≤ 10^5 <br>
1 ≤ r[i] ≤ 10^9 <br>
1 <= i <= n**

## Output

Print n space- separated integers. These integers should represent the places (1- based index) in the order Tirth should visit them based on their ratings.

## Sample

- Input:
```
5
40 10 20 30 50
```

- Output:
```
2 3 4 1 5
```

## Explanation

- For case 1: <br> **Here, Tirth would visit the places in the following order based on their ratings: 10, 20, 30, 40, 50. Hence, the order of places he visits is 2nd, 3rd, 4th, 1st, 5th.**
