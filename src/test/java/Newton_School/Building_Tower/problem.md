# [Problem: Building Tower](https://my.newtonschool.co/playground/code/ldb71ler1ajz)

Sara is building a tower with N disks of sizes 1 to N. <br>
The rules for building the tower are simple:-
- Every day you are provided with one disk having distinct size.
- The disk with larger sizes should be placed at the bottom of the tower.
- The disk with smaller sizes should be placed at the top of the tower.
- You cannot put a new disk on the top of the tower until all the larger disks that are given to you get placed.
<br>
Your task is to print N lines denoting the disk sizes that can be put on the tower on the ith day.

## Input

The first line of input contains a single integer N. The next line of input contains N space separated integers depicting the size of the discs.

## Constraints

**1 <= N <= 100000 <br>
1 <= Size <= N**

## Output

Print N lines. In the ith line, print the size of disks that can be placed on the top of the tower in descending order of the disk sizes. 
If on the ith day no disks can be placed, then leave that line empty.

## Sample

- Input:
```
5
4 5 1 2 3
```

- Output:
```
5 4


3 2 1
```

## Explanation

- For case 1: <br> **On the first day, the disk of size 4 is given. But you cannot put the disk on the bottom of the tower as a disk of size 5 is still remaining.
On the second day, the disk of size 5 will be given so now the disk of sizes 5 and 4 can be placed on the tower.
On the third and fourth days, disks cannot be placed on the tower as the disk of 3 needs to be given yet. Therefore, these lines are empty.
On the fifth day, all the disks of sizes 3, 2, and 1 can be placed on the top of the tower.** 
