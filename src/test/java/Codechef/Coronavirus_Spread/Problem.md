# [Problem: Coronavirus Spread](https://www.codechef.com/problems/COVID19)

There are N people on a street (numbered 1 through N). For simplicity, we'll view them as points on a line. For each valid i, the position of the i-th person is X<sub>i</sub>.

It turns out that exactly one of these people is infected with the virus COVID-19, but we do not know which one. The virus will spread from an infected person to a non-infected person whenever the distance between them is at most 2. If we wait long enough, a specific set of people (depending on the person that was infected initially) will become infected; let's call the size of this set the final number of infected people. 

Your task is to find the smallest and largest value of the final number of infected people, i.e. this number in the best and in the worst possible scenario.

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains a single integer N.
- The second line contains N space-seperated integers X<sub>1</sub>, X<sub>2</sub>, ...,X<sub>N</sub>.

## Constraints

- 1 ≤ T ≤ 2,000
- 2 ≤ N ≤ 8
- 0 ≤ X<sub>i</sub> ≤ 10 for each valid i
- X<sub>1</sub> < X<sub>2</sub> < ... < X<sub>N</sub>.


## Output

For each test case, print a single line containing two space-separated integers ― the minimum and maximum possible final number of infected people.

## Sample

- Input:
```
3
2
3 6
3
1 3 5
5
1 2 5 6 7
```

- Output:
```
1 1
3 3
2 3
```

## Explanation

- For case 1: The distance between the two people is 3, so the virus cannot spread and at the end, there will always be only one infected person.
- For case 2: The distance between each two adjacent people is 2, so all of them will eventually get infected.
- For case 3: In one of the best possible scenarios, the person at the position 1 is infected initially and the virus will also infect the person at the position 2.
In one of the worst possible scenarios, the person at the position 5 is infected initially and the virus will also infect the people at the positions 6 and 7.
