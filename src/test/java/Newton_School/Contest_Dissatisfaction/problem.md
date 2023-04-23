# [Problem: Contest Dissatisfaction](https://my.newtonschool.co/playground/code/1iwmj1onqeok)

There are **n** people participating in some contest, they start participating in **x** minutes intervals. That means the first participant starts at time **0**, the second participant starts at time **x**, the third — at time **2⋅x**, and so on. The duration of the contest is **t** minutes for each participant, so the first participant finishes the contest at time **t**, the second — at time **t+x**, and so on. When a participant finishes the contest, their dissatisfaction equals the number of participants that started the game (or starting it now) but haven't yet finished it. <br>
Determine the sum of dissatisfaction of all participants.

## Input

 The input consists of three space separated integers **n, t and x** — the number of participants, the start interval and the contest duration.

## Constraints

**1 ≤ n,x,t ≤ 10<sup>9</sup>**

## Output

Print the total dissatisfaction of participants.

## Sample

- Input:
```
4 2 5
3 1 2
```

- Output:
```
5
3
```

## Explanation

- For case 1: <br> **Dissatisfaction of Person 1 => 2 (beacuse of 2 and 3) <br> Dissatisfaction of Person 2 => 2 (beacuse of 3 and 4) <br> Dissatisfaction of Person 3 => 1 (beacuse of 4) <br> Dissatisfaction of last person is always 0** <br>
- For case 2: <br> **Dissatisfaction of Person 1 => 1 (beacuse of 2) <br> Dissatisfaction of Person 2 => 1 (beacuse of 3) <br> Dissatisfaction of last person is always 0** 
