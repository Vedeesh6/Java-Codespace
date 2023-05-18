# [Problem: Chess Game](https://my.newtonschool.co/playground/code/apadujzvvoz2)

Alexa and Bob play a game to find who is a better player in chess but they have never played against each other. They have played same number of matches against Edward. You are given 4 integers **a, b, c, and d** denoting the number of matches won by Alexa, the number of matches tied by Alexa, the number of matches won by Bob, and the number of matches tied by Bob respectively. If winning a match gives you 2 points and having a tie gives you 1 point, determine who is a better player by comparing the total points.

## Input

The input consists of 4 space- separated integers **a, b, c, and d**.

## Constraints

**0 ≤ a,b,c,d ≤ 10<sup>5</sup>**

## Output

Print **"Alexa"** if she scores more points else print **"Bob"** if he scores more points else print **"Tie"** if both scores equal points.

## Sample

- Input:
```
5 4 6 3
4 4 3 5
```

- Output:
```
Bob
Alexa
```

## Explanation

- For case 1: **Alexa => 14 Bob => 15** <br>
- For case 2: **Alexa => 12 Bob => 11**
