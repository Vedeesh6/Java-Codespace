# [Problem: Raj and Party](https://my.newtonschool.co/playground/code/0vzuohqzxi2n)

Raj is organizing a surprise party for his friend Arjun and is busy selecting entertainers while also receiving regular updates from his friend, the mountaineer Ishaan, who calls him from the Himalayas. <br>
Ishaan calls Raj every n minutes, meaning he calls at minutes n, 2n, 3n, and so on. Entertainers arrive to meet Raj every m minutes, meaning they come at minutes m, 2m, 3m, and so on.
The day is z minutes long, consisting of minutes 1, 2,. , z. Raj needs to figure out how many entertainers he should send away so that there are none in the room when Ishaan calls. Assume that both a call and a meeting with an entertainer take exactly one minute.

## Input

Input contains 3 space separated integers n, m, z. (1 ≤ n, m, z ≤ 104)

## Output

Print single integer — the minimum number of artists that should be killed so that there are no artists in the room when Ishaan calls.

## Sample

- Input:
```
1 2 5
```

- Output:
```
2
```

## Explanation

- For case 1: <br> **We need to send away entertainers which come on the second and the fourth minutes.**
