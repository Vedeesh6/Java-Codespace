# [Problem: Weird Walk](https://www.codechef.com/problems/WWALK)

Alice and Bob are walking on an infinite straight street. Initially, both are at the position X=0 and they start walking in the direction of increasing X. After N seconds, they stop. Let's denote Alice's speed and Bob's speed during the i-th of these seconds by A<sub>i</sub> and B<sub>i</sub> respectively.

Sometimes, Alice and Bob walk together, i.e. with the same speed side by side. Let's define the weird distance as the total distance they walk this way. Find this weird distance. 

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains a single integer N.
- The second line contains N space-separated integers A<sub>1</sub>, A<sub>2</sub>,...., A<sub>N</sub>.
- The third line contains N space-separated integers B<sub>1</sub>, B<sub>2</sub>,...., B<sub>N</sub>.

## Constraints

- 1 ≤ T ≤ 20
- 1 ≤ N ≤ 10<sup>5</sup>
- 1 ≤ A<sub>i</sub> ≤ 10<sup>5</sup> for each valid i
- 1 ≤ B<sub>i</sub> ≤ 10<sup>5</sup> for each valid i
- The sum of N over all test cases does not exceed 10<sup>6</sup>

## Output

For each test case, print a single line containing one integer ― the total weird distance. It can be proved that this distance is an integer.

## Sample

- Input:
```
3
4
1 3 3 4
1 2 4 4
2
2 3
3 2
2
3 3
3 3
```

- Output:
```
5
0
6
```

## Explanation

- For case 1:
  - Alice and Bob walk side by side during the first second, from X=0 to X=1.
  - Then, Alice starts walking faster than Bob, so they do not walk side by side during second 2. At the end of second 2, Alice is at X=4, while Bob is at X=3.
  - During the next second, they again do not walk side by side, but Bob walks faster, so they both end up at X=7.
  - During the last second, they both walk side by side and the distance they walk is 4.
  - Alice and Bob walk side by side during the 1-st and 4-th second and the total weird distance they travel is 1+4=5.
- For case 2:
  - First, Alice walks with speed 2 and Bob walks with speed 3, so they do not walk side by side. Alice ends up at X=2, while Bob ends up at X=3 at the end of the 1-st second.
  - Then, Alice walks with speed 3 and Bob walks with speed 2, so they do not walk side by side either.
  - Although Alice and Bob both end up at X=5 at the end of the 2-nd second, the weird distance is 0.
- For case 3: We can see that Alice and Bob always walk together, so the weird distance is 3+3=6.
   
