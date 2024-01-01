# [Problem: 3 Logicians Walk into a Bar](https://www.codechef.com/problems/LOGICIAN?tab=statement)

3 logicians walk into a bar. The bartender asks them, "Does everyone want a beer?".  <br>
Logician 1 replies "I don't know". <br>
Then, logician 2 replies "I don't know". <br>
Finally, logician 3 replies "Yes". <br><br>
<img src="https://cdn.codechef.com/download/Contest+images/START112/logician.jpg" alt="image"/> <br/><br>
Now, coming to the actual problem. <br/>
N logicians numbered 1,2,…,N walk into a bar. <br/>
You are given a binary string S where S<sub>i</sub>=1 if and only if the i-th logician wants beer for himself, otherwise S<sub>i</sub>=0.

Note that the logicians don't know the string S — each one only knows whether they themself want a beer.
They are also perfect logicians, and hence can extract information from hearing what the previous logicians reply.

The bartender asks them, "Does everyone want a beer?".
Predict what will be the replies of logician 1,2,…,N if they reply in that order.

Once again, note that logician i only has the following information: 
- S<sub>i</sub>, i.e, whether he himself wants a beer or not; and
- The replies of logicians 1,2,3,…,i−1.

Output "IDK" for "I Don't know", "YES" or "NO" with their respective meanings.


## Input

- The first line of input will contain a single integer T, denoting the number of test cases.
- Each test case consists of multiple lines of input.
  - The first line of each test case one integer N, the number of logicians.
  - The second line contains a binary string S of length N, representing whether each logician wants beer or not.

## Constraints

- 1≤T≤100
- 1≤N≤100
- S is a binary string of length N

## Output

For each test case, output N lines: the responses of logicians 1,2,…,N in order.

Each character of the output may be printed in either uppercase or lowercase, i.e, the strings no, No, nO, and NO will all be treated as equivalent.

## Sample

- Input:
```
2
3
111
2
00
```

- Output:
```
IDK
IDK
YES
NO
NO
```

## Explanation

- For case 1: Logician 1 wants beer, but is not sure whether 2 and 3 also want it. <br>
Similarly, logician 2 is also not sure. <br>
With perfect deduction, logician 3 can be sure they all want beer. <br>
This test is represented in the picture above. <br>
- For case 2: Logicians 1 and 2 don't want beer themselves, hence are sure and reply NO immediately.
