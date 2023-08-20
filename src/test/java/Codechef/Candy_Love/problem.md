# [Problem: Candy Love](https://www.codechef.com/problems/CNDLOVE)

## Problem

Sammy and Simmy love candies and frequently visit the local candy shop. Sammy and Simmy have bought *N* candy packs. Packet *i* contains A<sub>*i*</sub> candies. Sammy being the elder one is happy only if she has strictly more candies than Simmy. However Simmy, the more sensible one, is happy only if the difference between their number of candies is not more than 1. <br>
The shopkeeper, being a generous lady, agrees to help Sammy and Simmy by distributing the candies among them in a way that makes both of them happy. The shopkeeper can open the packs and distribute the candies even within a single pack to different people.

## Input

- The first line will contain *T*, the number of testcases.
- The first line of every test case will contain *N*, the number of candy packs.
- The next line has *N* integers, the *i*<sub>*th*</sub> integer denoting *A*<sub>*i*</sub> , the number of candies in the *i*<sub>*th*</sub> pack.

## Constraints

- 1 ≤ T ≤ 10<sup>3</sup> 
- 1 ≤ N ≤ 10<sup>3</sup>
- 1 ≤ A<sub>i</sub> ≤ 100

## Output

Output "YES" if its possible for the shopkeeper to make both the sisters happy otherwise output "NO".

## Sample

- Input:
```
1  
2  
5 2
```

- Output:
```
YES
```

## Explanation

Sammy gets 4 candies from the first pack. <br>
Simmy gets 1 candy from the first pack and 2 from the second one. <br>
So in total, Sammy has 4, and Simmy has 3. Since Sammy has strictly more candies than Simmy, Sammy is happy. And since the difference is not more then 1, Simmy is also happy. Thus both of them are happy.
