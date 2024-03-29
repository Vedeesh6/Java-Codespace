# [Problem: Making a Meal](https://www.codechef.com/problems/CFMM)

Today, Chef decided to cook some delicious meals from the ingredients in his kitchen. There are N ingredients, represented by strings S<sub>1</sub>, S<sub>2</sub>,..., S<sub>N</sub>. Chef took all the ingredients, put them into a cauldron and mixed them up. <br>
In the cauldron, the letters of the strings representing the ingredients completely mixed, so each letter appears in the cauldron as many times as it appeared in all the strings in total; now, any number of times, Chef can take one letter out of the cauldron (if this letter appears in the cauldron multiple times, it can be taken out that many times) and use it in a meal. A complete meal is the string "codechef". Help Chef find the maximum number of complete meals he can make!

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains a single integer N.
- N lines follow. For each i(1 ≤ i ≤ N), the i-th of these lines contains a single string S<sub>i</sub>.

## Constraints

- 1 ≤ T ≤ 100
- 1 ≤ N ≤ 100
- |S<sub>1</sub>|, |S<sub>2</sub>|,..., |S<sub>N</sub>| ≤ 1000
- Each string contains only lowercase English letters

## Output

For each test case, print a single line containing one integer — the maximum number of complete meals Chef can create.

## Sample

- Input:
```
3
6
cplusplus
oscar
deck
fee
hat
near
5
code
hacker
chef
chaby
dumbofe
5
codechef
chefcode
fehcedoc
cceeohfd
codechef
```

- Output:
```
1
2
5
```

## Explanation

- For case 1: After mixing, the cauldron contains the letter 'c' 3 times, the letter 'e' 4 times, and each of the letters 'o', 'd', 'h' and 'f' once. Clearly, this is only enough for one "codechef" meal. <br>
- For case 2: After mixing, the cauldron contains the letter 'c' 4 times, 'o' 2 times, 'd' 2 times, 'e' 4 times, 'h' 3 times and 'f' 2 times, which is enough to make 2 meals.
