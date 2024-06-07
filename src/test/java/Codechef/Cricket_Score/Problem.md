# [Problem: Cricket Score](https://www.codechef.com/problems/CRICSCR)

Teja likes cricket very much and likes to watch it all the time, but he is bored of watching the matches alone and asks his friend to give him company. But his friend doesn’t know how to read cricket scores so Teja decided to teach him. To make him understand better Teja gave him a list of scores of an innings of a match. The scores are ordered in the increasing order of time at which it was recorded.

In the version of Cricket Teja follows, runs can't be taken away from the batting team and a batsmen is not allowed to bat once he is dismissed, also the innings gets over when the 10th wicket falls or when the required number of overs are completed and no more scores are recorded once an innings get over.

Now Teja wants his friend to find out if its a valid score card or not. Since his friend is busy watching football he asks for your help to answer Teja.

## Input

- First line cointains an integer N denoting the number of scores recorded.
- Next n line contain two integers Ri and Wi, Ri is the runs scored and Wi is the number of wickets lost.

## Constraints

- 1 ≤ N ≤ 10<sup>6</sup> 
- 0 ≤ R<sub>i</sub> ≤ 10<sup>6</sup> 
- 0 ≤ W<sub>i</sub> ≤ 10<sup>6</sup> 

## Output

print “YES” if it is valid else print “NO” without quotes.

## Sample

- Input:
```
3
1 1
4 1
7 6

3
1 1
9 1
7 6
```

- Output:
```
YES
NO
```
