# [Problem: Baldev: The Destroyer](https://my.newtonschool.co/playground/code/p1wz67hy2kwi)

Baldev, known as the destroyer, possesses immense strength and is on a mission to raze buildings to the ground. The cityscape is filled with n buildings, each with its own strength represented by st[i], (1<= i <= n).
<br>
Baldev's initial strength is K, and with each building he destroys, his power increases by the strength of that building. Your task is to help Baldev determine the maximum number of buildings he can destroy while considering his initial strength and the strength of each building.

## Input

The first line of the input contains two space separated integers n and K, representing the number of buildings in the city and Baldev's initial strength.<br>
The second line contains n integers separated by spaces, where the ith integer represents the strength of the ith building.

## Constraints

**1 <= n <= 10<sup>5</sup> <br>
0 <= K <= 10<sup>6</sup> <br>
0 <= st[i] <= 10<sup>6</sup>**

## Output

Print an integer, the maximum number of buildings Baldev can destroy while considering his initial strength and the building strengths.

## Sample

- Input:
```
3 1
2 1 5
```

- Output:
```
2
```

## Explanation

- For case 1: <br> **Baldev's initial strength is 1.
He destroys the building with strength 1 and now his strength becomes 2(1+1).
Now, he demolishes the building with strength 2 and his strength is 4(2+2).
He cannot destroy the building with strength 5.
Hence the output is 2.**
