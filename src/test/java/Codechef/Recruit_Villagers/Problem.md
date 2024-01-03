# [Problem: Recruit Villagers](https://www.codechef.com/problems/VILLINE)

WW3 is near and Gru wants to recruit minions for his team. Gru went to the planet of minions to recruit minions, he saw that there are two villages separated by a river. He cannot recruit minions from both villages because then his team will have internal conflicts.

Gru is now in a dilemma about which village to recruit as he wants to have the strongest possible team.

You are given coordinates of houses on the planet. Each house has exactly one minion and his power is given. The planet of minion is considered as a 2-D plane and the river is denoted by a straight line (y=mx+c). 

Note: None of the houses are situated on the river. 

## Input

- First-line will contain N, number of houses.
- Second-line will contain two integers, m and c denoting the river.
- Next N lines will have exactly 3 integers X[i],Y[i],P[i] denoting the coordinates of houses and the power of minion in that house.


## Constraints

- 1 ≤ N ≤ 10<sup>5</sup>
- -10<sup>4</sup> ≤ m, c ≤ 10<sup>4</sup> 
- -10<sup>4</sup> ≤ X[i], Y[i] ≤ 10<sup>4</sup>
- 1 ≤ P[i] ≤ 10<sup>4</sup>

## Output

Print the maximum power of the team which Gru can recruit.

## Sample

- Input:
```
3
1 0
0 5 5
0 6 5
0 -8 20
```

- Output:
```
20
```
