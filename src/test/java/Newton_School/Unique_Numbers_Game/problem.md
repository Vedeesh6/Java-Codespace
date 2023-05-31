# [Problem: Unique Numbers Game](https://my.newtonschool.co/playground/code/v6oemkvrrhzw)

Alexa and Bob play a game of Numbers. Both of them are given two arrays with **n** numbers each. The player having more unique numbers win the game. Find the winner of the game.

## Input

The first line of the input consists of an integer **n**. The next two lines of the input consist of **n** space-separated integers each that Alexa and Bob have respectively i.e. The first **n** integers represent the elements of Alexa's array and the next **n** integers represent the elements of Bob's array.

## Constraints

**1 ≤ n ≤ 100 <br>
1 ≤ a<sub>i</sub> ≤ 10<sup>3</sup>**

## Output

Print **Alexa** if the number of unique elements in Alexa's array is more than that of Bob's array else print **Bob**.

## Sample

- Input:
```
3
4 4 2
5 3 4

4
5 6 7 10
2 3 3 2
```

- Output:
```
Bob
Alexa
```

## Explanation

- For case 1: <br> **Bob has 3** <br>
- For case 2: <br> **Alexa has 4**
