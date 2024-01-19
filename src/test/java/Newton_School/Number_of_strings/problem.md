# [Problem: Number of strings](https://my.newtonschool.co/playground/code/0ffg67gurg1c)

Given a length n, count the number of strings of length n that can be made using a,  b and c.

## Input

Input contains an integer n. ( 1 <= n < 15)

## Output

Print the number of strings of length n containing a, b and c.

## Sample

- Input:
```
3
```

- Output:
```
27
```

## Explanation

- For case 1: <br> **Starting with 'a':**
- 'aa': The third character can be 'a', 'b', or 'c'.
- aaa, aab, aac
- 'ab': The third character can be 'a', 'b', or 'c'.
- aba, abb, abc
- 'ac': The third character can be 'a', 'b', or 'c'.
- aca, acb, acc

**Starting with 'b':**
- 'ba': The third character can be 'a', 'b', or 'c'.
- baa, bab, bac
- 'bb': The third character can be 'a', 'b', or 'c'.
- bba, bbb, bbc
- 'bc': The third character can be 'a', 'b', or 'c'.
- bca, bcb, bcc

**Starting with 'c'**:
- 'ca': The third character can be 'a', 'b', or 'c'.
- caa, cab, cac
- 'cb': The third character can be 'a', 'b', or 'c'.
- cba, cbb, cbc
- 'cc': The third character can be 'a', 'b', or 'c'.
- cca, ccb, ccc
