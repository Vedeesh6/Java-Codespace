# [Problem: Maximum Deliciousness](https://www.codechef.com/problems/KDELI)

A new patisserie has opened up to rave reviews. You, in your quest for deliciousness, are going to visit it. <br>
The patisserie has N pastries. With your trained eye, you judge that the i-th of them has deliciousness A<sub>i</sub>. <br>
Of course, you want to eat pastries whose total deliciousness is as high as possible. Unfortunately, you can't just buy everything out. <br>
There are K customers in the store, including you. They form a queue to order pastries, of which you're the L-th person.<br>
Each customer, including you, will do the following: 
- Among the remaining pastries, buy the one with the highest deliciousness
- Then, move to the back of the queue

This will repeat till all the pastries are sold out. <br>
What's the total deliciousness of the pastries you buy?

## Input

- The first line of input will contain a single integer T, denoting the number of test cases.
- Each test case consists of two lines of input.
  - The first line of each test case contains three space-separated integers N, K, and L — the number of pastries, the number of people, and your initial position in the queue.
  - The second line contains N space-separated integers A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>N</sub> — the deliciousness of the pastries.

## Constraints

- 1 ≤ T ≤ 10<sup>5</sup>
- 1 ≤ L ≤ K ≤ N ≤ 2⋅10<sup>5</sup>
- 1 ≤ A<sub>i</sub> ≤ 10<sup>9</sup>
- The sum of N across all tests won't exceed 2⋅10<sup>5</sup>.

## Output

For each test case, output on a new line the answer: the total deliciousness of the pastries you buy.

## Sample

- Input:
```
4
4 2 1
3 8 6 14
4 2 2
3 8 6 14
5 3 3
8 5 9 11 49
4 1 1
9 30 1 18
```

- Output:
```
20
11
9
58
```

## Explanation

- For case 1: There are 4 pastries, and 2 people in the queue. You're first among them. The process is as follows:
  - First, you buy the most delicious pastry, which is 14. You move to the back of the queue.
  - Next, the other person buys the most delicious remaining pastry, which is 8. They move to the back of the queue, so you're in front again.
  - You buy the most delicious remaining pastry, 6, and move to the back.
  - The other person buys the only remaining pastry, and the process ends.
  
The total deliciousness of the pastries you bought is 14+6=20.
- For case 2: This is the same as test case 1, but you start second instead. This means you get the other two pastries this time, for a total of 3+8=11.
- For case 3: You're third in line. The first two people will buy the pastries with deliciousness 49 and 11 respectively, so your best choice is to buy the one with 9.

The other two people then buy the remaining pastries.
- For case 4: You're the only person in line, so you can buy everything.
