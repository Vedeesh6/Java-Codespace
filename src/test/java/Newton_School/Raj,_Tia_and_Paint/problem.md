# [Problem: Raj, Tia and Paint](https://my.newtonschool.co/playground/code/tp7g48pxohdk)

Raj and Tia have purchased a ribbon consisting of n segments. They plan to paint it together. <br>
Initially, Raj will paint each segment of the ribbon using one of m available colors. He can freely choose the color for each segment. 
Then, Tia will choose at most k parts of the ribbon and repaint them into the same color (she chooses the affected parts and the color arbitrarily). <br>
Tia would like all parts to have the same color. However, Raj thinks that this is too dull, so he wants to paint the ribbon in such a way that Tia cannot make all parts have the same color. Find if this is poosible or not?

## Input

Input consists of three space separated integers: n, m, k (1 <= n, m, k <= 30).

## Output

Print "Yes" if it's possible, "No" otherwise.  (Case sensitive)

## Sample

- Input:
```
5 2 1

5 2 2
```

- Output:
```
Yes

No
```

## Explanation

- For case 1: <br> **Raj can paint the ribbon as follows: [1,2,1,2,1]. It's impossible to change the color of at most 1 part so that all parts have the same color.** <br>
- For case 2: <br> **No matter how Raj paints the ribbon, Tia will always be able to repaint 2 parts so that all parts have the same color.**
