# [Problem: Love Triangle](https://my.newtonschool.co/playground/code/12ah6au3xdb7)

There are |**n** students in a class. Each student with a number **i** likes a student with the number **l<sub>i</sub>**. Find if there exists a love triangle among the students. <br>
**A love triangle is a situation where student A likes student B, student B likes student C and student C likes student A.**

## Input

The first line of input consists of an integer **n**. The second line consists of **n** space- separated integers **l<sub>1</sub>, l<sub>2</sub>,. , l<sub>n</sub>**.

## Constraints

**2 ≤ n ≤ 100 <br>
1 ≤ l<sub>i</sub> ≤ n**

## Output

Output **"YES"** if there is a love triangle else print **"NO"**.

## Sample

- Input:
```
5
2 4 5 1 3

5
5 5 5 5 1
```

- Output:
```
YES
NO
```

## Explanation

- For case 1: <br> **1 likes 2, 2 likes 4 and 4 likes 1** <br>
- For case 2: <br> **not possible**
