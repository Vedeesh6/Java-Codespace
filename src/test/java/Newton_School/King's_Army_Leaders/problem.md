# [Problem: King's Army Leaders](https://my.newtonschool.co/playground/code/2601wkbrq9nj)

In a kingdom, there is a war going on between two armies led by two kings. Each king has an army of positive integers. Your task as a military advisor is to find the number of leaders of each army.

An element of the army is a leader if it is greater than or equal to all the soldiers on its right side. The rightmost soldier of each army is always a leader. The more the number of leaders more the chances of winning the war, predict the winner of the battle.

## Input

The first line contains the size of the armies **n1, n2**.
The next line contains **n1** space- separated integers for the army members of the first army.
The next line contains **n2** space- separated integers for the army members of the second army.

## Output

A single integer **1** if the first army wins else **2**. They will never tie.

## Sample

- Input:
```
6 6
1 3 2 5 7 3
1 2 3 8 7 6
```

- Output:
```
2
```

## Explanation

- For case 1: <br> **First army contains 2 leaders(7, 3) and the second army contains 3 leaders (8, 7, 6) so we print 2**
