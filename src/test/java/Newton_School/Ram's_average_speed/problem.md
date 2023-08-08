# [Problem: Ram's average speed](https://my.newtonschool.co/playground/code/hz2vrz4p0e1w)

Ram is participating in a race, and you are tasked with calculating his average speed during the race. The race consists of two parts: running and cycling. <br>
Ram starts by running a distance of **d1** kilometers at a speed of **s1** kilometers per hour. After completing the running part, he transitions to cycling. He cycles a distance of **d2** kilometers at a speed of **s2** kilometers per hour. <br>
Write a program that calculates Ram's average speed during the entire race, taking into account both running and cycling.

## Input

The first and the only line of input contains 4 space separated integers **d1, s1, d2, s2**

## Constraints

**2<=d1,d2 <=1000 <br>
2<= s1,s2 <=1000**

## Output

The output contains the average speed of Ram for the whole race rounded up to 2 decimal places.

## Sample

- Input:
```
10 5 20 4
```

- Output:
```
4.29
```

## Explanation

- For case 1: <br> **Time = Distance / Speed
<br>
Time taken while running = 10 / 5 = 2
Time taken while cycling = 20 / 4 = 5
<br>
Total Distance = 30KM
Total Time = 7 Hours
<br>
Average Speed = 30 / 7
= 4.29**
