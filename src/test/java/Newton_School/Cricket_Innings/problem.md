# [Problem: Cricket Innings](https://my.newtonschool.co/playground/code/uxh8b3kevlpr)

Given the scores of a cricket player in **n** innings and a target score **k**, you can choose an inning score **x** from the list, erase **x** from the list, and subtract the value of **x** from all the remaining innings scores. Find if there is a sequence of **n-1** operations such that, after applying the operations, the only remaining inning score is equal to a target score **k**.

## Input

The first line contains two integers **n and k**, the number of integers in the list, and the target value, respectively. <br>
The second line contains the n innings **a<sub>1</sub>, a<sub>2</sub>, a<sub>3</sub>...a<sub>n</sub>.**

## Constraints

**12 ≤ n ≤ 2*10<sup>5</sup> <br>
1 ≤ k ≤ 10<sup>9</sup> <br>
-10<sup>9</sup> ≤ a<sub>i</sub> ≤ 10<sup>9</sup>**

## Output

Print **"YES"** if there is some sequence of **n−1** operations such that, after applying the operations, the only remaining inning score is equal to **k**. Else print **"NO"**.

## Sample

- Input:
```
4 5
4 2 2 7
```

- Output:
```
YES
```

## Explanation

- For case 1: <br> **We have the list {4, 2, 2, 7}, and we have the target k=5. One way to achieve it is the following: first, we choose the third element, obtaining the list {2, 0, 5}. Next, we choose the first element, obtaining the list {−2, 3}. Finally, we choose the first element, obtaining the list {5}.**
