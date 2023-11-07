# [Problem: Magical Containers](https://my.newtonschool.co/playground/code/zl2g9b9owg6o)

There are infinite number of magical containers that only get filled with wealth when an even number of coins are placed inside. You are given n coin packets, where the ith packet contains num[i] number of coins. You cannot open a packet to take coins out, but you can combine two or more packets to form an even number of coins and fill magical wealth containers.
<br>
Determine the maximum number of containers that can be filled with the given coin packets.

## Input

- The first line of the input contains a single integer n representing the number of packets.
- The second line of the input contains n space separated integers representing the coins in each packet.

## Constraints

**1 <= n <= 10<sup>5</sup> <br>
0 <= num[i] <= 10<sup>6</sup> **

## Output

Print an integer representing the maximum number of containers that can be filled.

## Sample

- Input:
```
5
2 4 1 3 8
```

- Output:
```
4
```

## Explanation

- For case 1: <br> **Container 1 can be filled with packet 1 (2 coins)
Container 2 can be filled with packet 2 (4 coins)
Container 3 can be filled with 3rd and 4th packer combined ( 1+ 3 = 4 coins)
And Container 4 can be filled with last packet ( 8 coins)
Thus, We can fill maximum of 4 containers. So the output is 4.**
