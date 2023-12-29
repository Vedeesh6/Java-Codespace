# [Problem: Chef and Icecream](https://www.codechef.com/problems/CHFICRM)

Chef owns an icecream shop in Chefland named scoORZ. There are only three types of coins in Chefland: Rs. 5, Rs. 10 and Rs. 15. An icecream costs Rs. 5.

There are N people (numbered 1 through N) standing in a queue to buy icecream from scoORZ. Each person wants to buy exactly one icecream. For each valid i, the i-th person has one coin with value a<sub>i</sub>. It is only possible for someone to buy an icecream when Chef can give them back their change exactly ― for example, if someone pays with a Rs. 10 coin, Chef needs to have a Rs. 5 coin that he gives to this person as change.

Initially, Chef has no money. He wants to know if he can sell icecream to everyone in the queue, in the given order. Since he is busy eating his own icecream, can you tell him if he can serve all these people?

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains a single integer N.
- The second line contains N space-separated integers a<sub>1</sub>, a<sub>2</sub>,...., a<sub>N</sub>
​
## Constraints

- 1 ≤ T ≤ 100
- 1 ≤ N ≤ 10<sup>3</sup>
- a<sub>i</sub> ∈ {5,10,15} for each valid i

## Output

For each test case, print a single line containing the string "YES" if all people can be served or "NO" otherwise (without quotes).

## Sample

- Input:
```
3
2
5 10
2
10 5
2
5 15
```

- Output:
```
YES
NO
NO
```

## Explanation

- For case 1:  The first person pays with a Rs. 5 coin. The second person pays with a Rs. 10 coin and Chef gives them back the Rs. 5 coin (which he got from the first person) as change.
- For case 2: The first person already cannot buy an icecream because Chef cannot give them back Rs. 5.
- For case 3: The first person pays with a Rs. 5 coin. The second person cannot buy the icecream because Chef has only one Rs. 5 coin, but he needs to give a total of Rs. 10 back as change.
