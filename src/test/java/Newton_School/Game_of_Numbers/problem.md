# [Problem: Game of Numbers](https://my.newtonschool.co/playground/code/b805elzjwjfn)

Ram, Shyam, and Rahul are friends who are looking to have some fun during their vacation. They decide to play a game involving odd and even integers. There are n even integers and m odd integers. Ram can only choose even integers, Shyam can choose only odd integers, and Rahul, being the youngest, chooses two numbers: one from the even integers and one from the odd integers.
<br>
The game is played in turns, starting with Ram, followed by Shyam, and finally Rahul. Each player selects their required number based on their restrictions. The player who is left with no valid option loses the game.

## Input

The first line contains an integer n representing the number of even integers. <br>
The second line contains an integer m representing the number of odd integers.

## Constraints

**1 <= n <= 10<sup>9</sup>
1 <= m <= 10<sup>9</sup>**

## Output

Print a string, the name of the player who loses the game (Ram, Shyam, or Rahul).

## Sample

- Input:
```
n = 4
m = 4
```

- Output:
```
Ram
```

## Explanation

- For case 1: <br> **Ram chose one from even integers: (n, m) = (3, 4)
Shyam chose one from odd integers: (n, m) = (3, 3)
Rahul chose one from each group: (n, m) = (2, 2)
Ram chose one from even integers: (n, m) = (1, 2)
Shyam chose one from even integers: (n, m) = (1, 1)
Rahul chose one from each group: (n, m) = (0, 0)
Now, It's Ram's turn and there are no even integers. So, Ram lost the game.**
