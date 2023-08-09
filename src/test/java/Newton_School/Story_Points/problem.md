# [Problem: Story Points](https://my.newtonschool.co/playground/code/r0exmxxrcg8g)

Himanshu, Gorakh, Vikas, and Hritvik are competing to collect the highest number of story points for the week. Ram, an expert, has created a 2-D array representing the story points for each person from Monday to Friday. The array has dimensions 4x5, with each row corresponding to Himanshu, Gorakh, Vikas, and Hritvik, and each column representing the story points for a specific day.
<br>
Your task is to determine the person who accumulates the maximum story points throughout the entire week. Compare the total story points earned by each person and identify the one with the highest count.
<br>
Write a program that takes the 2-D array as input and outputs the name of the person who obtains the maximum story points for the week.

## Input

Input consists of a 2-D array of size 4*5
There are 4 lines and each line consists of 5 integers separated by space representing the story points for each day of the week.

## Constraints

**1<= Story Points <= 20**

## Output

Print the name of the person with the highest story points for the week.

## Sample

- Input:
```
4 5 2 7 6
1 2 3 4 5
8 7 6 4 2
1 4 9 7 8
```

- Output:
```
Hritvik
```

## Explanation

- For case 1: <br> **Himanshu - 4 + 5 + 2 + 7 + 6 = 24
Gorakh - 1 + 2 + 3 + 4 + 5 = 15
Vikas - 8 + 7 + 6 + 4 + 2 = 27
Hritvik - 1 + 4 + 9 + 7 + 8 = 29**
