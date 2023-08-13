# [Problem: Minimum Operations to Perform](https://my.newtonschool.co/playground/code/btajx2l3z46w)

Given an initial single occurrence of the character 'A' displayed on a laptop screen, on which you can perform the following two operations at each step:
- Copy All: You can duplicate all the characters currently present on the screen, disallowing partial copies.
- Paste: You can paste the characters that were previously copied.
<br>
The task is to determine the minimum number of operations required to display the character 'A' exactly 'n' times on the screen.

## Input

The first and the only line of the input contains an integer n representing the number of occurrences of the letter 'A' required on the laptop screen.

## Constraints

**1 ≤ n ≤ 10<sup>8<sup>**

## Output

Print the minimum number of operations required to display the character n times in the screen.

## Sample

- Input:
```
8
```

- Output:
```
6
```

## Explanation

- For case 1: <br>
**There are several possible ways to get 8 A on the screen :**
  - CPCPCP
  - CPPPCP
  - CPPPPPPP <br>
**The minimum operations in this case would be 6. <br> Here C represents copying all A present in the screen. <br> P represents pasting whatever you have copied in in the screen. <br> Consider the initial state where there is a single 'A' displayed on the screen. By performing the copy operation, the content of the screen is duplicated, resulting in the copied part containing 'A'. <br> Subsequently, using the paste operation will append the copied content right after whatever was already present on the screen. Therefore, after pasting, the screen will display 'AA'. <br> Continuing this sequence, performing another paste operation will add an additional 'A' at the end, resulting in 'AAA' being displayed on the screen. <br> To extend the pattern further, performing the copy operation at this point will duplicate the entire content of the screen, which is 'AAA'. Subsequently, using the paste operation will append the copied content, resulting in the screen displaying 'AAA' followed by 'AAA'.**
