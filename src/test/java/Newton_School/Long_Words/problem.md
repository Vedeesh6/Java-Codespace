# [Problem: Long Words](https://my.newtonschool.co/playground/code/e6mi3nya32yu)

You are given a list of words. Some words are considered too long if they have more than **10** characters. For each too-long word, you need to replace it with an abbreviation. The abbreviation consists of the first letter, the count of letters between the first and last letters, and the last letter of the word.
<be>
For example, the word **"uncharacteristically"** is too long and should be replaced with **"u18y"**. Similarly, **"internationalization"** should be replaced with **"i18n"**.
<be>
Write a program that automates this process. Replace all too-long words with their abbreviations while leaving the other words unchanged.

## Input

- The first line contains an integer **n (1 ≤ n ≤ 100)**, representing the number of words.
- Each of the following **n** lines contains one word. All words consist of lowercase Latin letters and have lengths ranging from **1 to 100** characters.

## Output

Print **n** lines. Each line should contain the result of replacing the corresponding word from the input data. Words that are not too long should remain unchanged.

## Sample

- Input:
```
5
word
localization
internationalization
pneumonoultramicroscopicsilicovolcanoconiosis
hippopotomonstrosesquippedaliophobia
```

- Output:
```
word
l10n
i18n
p43s
h34a
```
