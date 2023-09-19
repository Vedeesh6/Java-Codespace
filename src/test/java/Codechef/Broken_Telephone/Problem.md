# [Problem: Broken Telephone](https://www.codechef.com/problems/BROKPHON)

Chef is judging a game called "Broken telephone". There are total N players taking part in the game. They are all sitting in a line. In the start of the game, first player is given a secret message written on a sheet of paper. Then they keep sending the message by whispering it to the player sitting immediate right to one and so on until it reaches the last person. <br>
Finally, the message received by the last player is compared with the message said by first player. If these messages aren't equal, there is someone who has misheard the message or whispered it wrongly to the next player. If messages is equal, then the players win and receive a tasty chocolate. <br>
Note that first player receives the message on a sheet of paper, thus he cannot mishear it. <br>
As Chef wants to be sure that every player has fulfilled his/ her role in the game, so he asks everyone to state their received messages after the end of the game. You are given an array A of N integers denoting messages received by each person. <br>
Please help Chef to find the number of players that could mishear the message or whisper it wrongly. 

## Input

- The first line of the input contains an integer T denoting the number of test cases.
- The first line of each test case contains a single integer N denoting the number of players
- The second line contains N space-separated integers A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>N</sub> denoting the messages of players.

## Constraints

- 1 ≤ T ≤ 5
- 1 ≤ A<sub>i</sub> ≤ 10<sup>9</sup>

### Subtask 1: 40 points

- 2 ≤ N ≤ 10<sup>3</sup>

### Subtask 2: 60 points

- 2 ≤ N ≤ 10<sup>5</sup>

## Output

For each test case, output a single line containing an integer corresponding to the number of players that could mishear the message or whisper it wrongly.

## Sample

- Input:
```
3
7
1 1 1 3 3 3 2
5
1 3 1 1 1
4
5 5 5 5
```

- Output:
```
4
3
0
```

## Explanation

- For case 1:  The 3<sup>rd</sup>, 4<sup>th</sup>, 6<sup>th</sup> and 7<sup>th</sup> player could mishear the message or whisper it wrongly. <br>
- For case 2:  First 3 players could mishear the message or whisper it wrongly.
