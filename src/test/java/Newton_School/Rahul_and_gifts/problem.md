# [Problem: Rahul and gifts](https://my.newtonschool.co/playground/code/j9cdtbpsnimm)

Rahul is a gift lover he is currently located at {0, 0} in an n*m grid and the gift is located at {k, l}, given a string that contains characters {L, R, D, U}, the string represents path taken by Rahul, tell whether he will reach {k, l} at any point of time. L means left, R means right, U means up and D means down. Assuming (x, y) is the initial point, here's how L, R, D, and U works in a grid: L (Left): moves to (x-1, y) R (Right): moves to (x+1, y) D (Down): moves to (x, y-1) U (Up): moves to (x, y+1)

## Input

- The first line contains two integers k, l the position of the gift.
- The second line contains the string, path taken by Rahul.
<br>
**0≤{k, l}≤10^5 <br>
2≤|s|≤10^3**

## Output

Output a single string "YES" or "NO".

## Sample

- Input:
```
1 1
UR
```

- Output:
```
YES
```

## Explanation

- For case 1: <br> **After U it moves to - > {0, 1} and then R moves to - >{1, 1}. So, we print YES.**
