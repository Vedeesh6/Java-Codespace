# [Problem: String Encryption](https://my.newtonschool.co/playground/code/spywm57999z7)

Given a string S, transform it as follows: replace every substring of identical letters with a single instance of that letter followed by the hexadecimal representation of the number of occurrences of that letter. Then, take the resulting string and reverse it. Finally, print the encrypted string. <br>
**Note: Ensure that all hexadecimal letters are converted to lowercase letters before printing the encrypted string.**

## Input

The only line contains a non-empty string of uppercase English letters of length at most 3*105.

## Output

Output the encrypted string.

## Sample

- Input:
```
aaaaaaaaaaa
```

- Output:
```
ba
```

## Explanation

- For case 1: <br> **aaaaaaaaaaa Step1: a11 (a occurs 11 times) Step2: a11 is ab [since 11 is b in hexadecimal] Step3: ba [After reversing]**
