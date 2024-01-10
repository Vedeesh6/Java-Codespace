# [Problem: Red Alert](https://www.codechef.com/problems/REDALERT)

Finally a monsoon has come. According to the Meteorological Department, there will be rain in the upcoming N days in the city. Initially, the water level of the city is zero millimetres. The amount of rain on the i-th day can be described by an integer A<sub>i</sub> as follows:

- If A<sub>i</sub> > 0, the water level of the city increases by A<sub>i</sub> millimetres on the i-th day.
- If A<sub>i</sub> = 0, there is no rain on the i-th day. The water level of the city decreases by D millimetres on such a day. However, if the water level is less than D millimetres before the i-th day, then it becomes zero instead.

There will be a red alert in the city if the water level becomes strictly greater than H millimetres on at least one of the N days. Determine if there will be a red alert.

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains three space-separated integers N, D and H.
- The second line contains N space-separated integers A<sub>1</sub>, A<sub>2</sub>,...., A<sub>N</sub>.

## Constraints

- 1 ≤ T ≤ 10<sup>3</sup> 
- 1 ≤ N, D ≤ 10<sup>2</sup>
- 0 ≤ A<sub>i</sub> ≤ 10<sup>2</sup> for each valid i
- 1 ≤ H ≤ 10<sup>4</sup>

## Output

For each test case, print a single line containing the string "YES" if there will be a red alert or "NO" otherwise.

## Sample

- Input:
```
4
4 2 6
1 3 0 2
2 1 100
1 100
4 2 3
1 2 0 2
3 7 10
5 3 9 
```

- Output:
```
NO
YES
NO
YES
```

## Explanation

- For case 1:
  - On the first day, the water level of the city increases to 1 millimtre.
  - On the second day, the water level increases by 3 millimeters and becomes 1+3=4 millimtres.
  - On the third day, there is no rain in the city, so the water level decreases by D=2 millimtres and becomes 4−2=2 millimtres.
  - On the fourth day, the water level increases by 2 millimtres and becomes 2+2=4 millimtres.
  
There will be no red alert in the city because the water level does not exceed H=6 millimtres on any of the four days.
- For case 2: The water level of the city on the 2-nd day is equal to 101 millimtres, which is greater than H=100 millimtres, so there will be a red alert in the city.
- For case 3: The water levels of the city on the four days are [1,3,1,3]. The water level is equal to H=3 millimtres on the second and fourth day, but it does not exceed the threshold.
