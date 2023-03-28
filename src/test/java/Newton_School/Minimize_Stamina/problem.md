# [Problem: Minimize Stamina](https://my.newtonschool.co/playground/code/ag2jaz1d2gia)

There are **N** people living on a number line. **I<sup>th</sup>** person lives at coordinate **X<sub>i</sub>**. You are going to hold a meeting that all **N** people have to attend. The meeting can be held at any integer coordinate. If you choose to hold the meeting at coordinate **P**, the **i<sup>th</sup>** person will spend **(X<sub>i</sub> − P)<sup>2</sup>** points of stamina to attend the meeting. <br>
Find the minimum total points of stamina the **N** people have to spend.

## Input

The first line of the input consists of an integer **N**. The second line consists of N space separated integers denoting the co- ordinate where the people live.

## Constraints

**1 ≤ N ≤ 100** <br>
**1 ≤ X<sub>i</sub> ≤ 100** <br>
All values in input are integers.

## Output

Print the minimum total stamina the **N** people have to spend.

## Sample

- Input:
```
2
1 4

7
14 14 2 13 56 2 37
```

- Output:
```
5
2354
```

## Explanation

- For case 1: <br> **(1+4)/2 =~ 3 <br> => (1-3)<sup>2</sup>+(4-3)<sup>2</sup> <br> => 4 + 1 = 5** <br>
- For case 2: <br> **(14+14+2+13+56+2+37)/7 =~ 20 <br> => (14-19)<sup>2</sup> + (14-19)<sup>2</sup> + (2-19)<sup>2</sup> + (13-19)<sup>2</sup> + (56-19)<sup>2</sup> + (2-19)<sup>2</sup> + (37-19)<sup>2</sup> <br> => 9 + 9 + 225 + 16 + 1369 + 225 + 400 = 2354**
