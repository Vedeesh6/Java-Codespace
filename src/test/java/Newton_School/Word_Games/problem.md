# [Problem: Word Games](https://my.newtonschool.co/playground/code/amzfet4l85es)

Ram is attempting to create his own text editor with a unique word correction feature. However, the rules for word correction in this editor are quite unusual.
Ram believes that if a word contains two consecutive vowels, it's somewhat odd and needs correction. The word corrector in his editor functions as follows: as long as a word has two consecutive vowels, it removes the first vowel of the pair. This process continues until there are no more consecutive vowels in the word. A word without consecutive vowels is considered correct. <br>
You are given a word s. Can you predict its form after it goes through Ram's correction process. <br>
(In this problem, the letters a, e, i, o, u, and y are considered vowels. )

## Input

- The first line contains one integer n (1 ≤ n ≤ 100) — the number of letters in word s before the correction.
- The second line contains a string s consisting of exactly n lowercase Latin letters — the word before the correction.

## Output

Output the corrected word.

## Sample

- Input:
```
5
weird
```

- Output:
```
wird
```

## Explanation

- For case 1: <br> **There is only one replace: weird - > wird;**
