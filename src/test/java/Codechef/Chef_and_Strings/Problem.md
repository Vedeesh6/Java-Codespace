# [Problem: Chef and Strings](https://www.codechef.com/problems/CHEFSTR1)

Having already mastered cooking, Chef has now decided to learn how to play the guitar. Often while trying to play a song, Chef has to skip several strings to reach the string he has to pluck. Eg. he may have to pluck the 1<sup>st</sup> string and then the 6<sup>th</sup> string. This is easy in guitars with only 6 strings; However, Chef is playing a guitar with 10<sup>6</sup> strings. In order to simplify his task, Chef wants you to write a program that will tell him the total number of strings he has to skip while playing his favourite song. <br><br>

<img src="https://codechef_shared.s3.amazonaws.com/download/Images/JULY20/CHEFSTR1/CHEFSTR1.png" height="300px" /><br><br>

This is how guitar strings are numbered (In ascending order from right to left). Eg. to switch from string 1 to 6, Chef would have to skip 4 strings (2,3,4,5).

## Input

- First line will contain T, number of testcases. Then the testcases follow.
- The first line of each test case contains N, the number of times Chef has to pluck a string.
- The second line of each test case contains N space separated integers - S<sub>1</sub>, S<sub>2</sub>, ..., S<sub>n</sub> where S<sub>i</sub> is the number of the i<sup>th</sup> string Chef has to pluck.

## Constraints

- 1 ≤ T ≤ 10
- 2 ≤ N ≤ 10<sup>5</sup>
- 1 ≤ S<sub>i</sub> ≤ 10<sup>6</sup>
- For each valid i, S<sub>i</sub> is not equal to S<sub>i+1</sub>

## Output

For each testcase, output the total number of strings Chef has to skip over while playing his favourite song.

## Sample

- Input:
```
2
6
1 6 11 6 10 11
4
1 3 5 7
```

- Output:
```
15
3
```

## Explanation

- For case 1: 
  - Chef skips 4 strings (2,3,4,5) to move from 1 to 6
  - Chef skips 4 strings (7,8,9,10) to move from 6 to 11
  - Chef skips 4 strings (10,9,8,7) to move from 11 to 6
  - Chef skips 3 strings (7,8,9) to move from 6 to 10
  - Chef skips 0 strings to move from 10 to 11 <br>
  - Therefore, the answer is 4+4+4+3+0=15 
