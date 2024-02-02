# [Problem: Raj and Game](https://my.newtonschool.co/playground/code/twe6cbduibn8)

Raj is learning to play a game called Ruma. In this game, he is given a row of colored balls. Raj has to choose the color of one new ball and the place to insert it (between two balls, or to the left of all the balls, or to the right of all the balls). <br>
When the ball is inserted, the following happens repeatedly: if some segment of balls of the same color becomes longer as a result of a previous action and its length becomes at least 3, then all the balls of this segment are eliminated. <br>
Consider, for example, a row of balls 'AAABBBWWBB'. Suppose Raj chooses a ball of color 'W' and the place to insert it after the sixth ball, i.e., to the left of the two 'W's. After Raj inserts this ball, the balls of color 'W' are eliminated since this segment was made longer and has a length of 3 now, so the row becomes 'AAABBBBB'. The balls of color 'B' are eliminated now because the segment of balls of color 'B' became longer and has a length of 5 now. Thus, the row becomes 'AAA'. However, none of the balls are eliminated now because there is no elongated segment. <br>

Help Raj count the number of possible ways to choose the color of a new ball and a place to insert it that leads to the elimination of all the balls.

## Input

The only line contains a non-empty string of uppercase English letters of length at most 3*10^5. Each letter represents a ball with the corresponding color.

## Output

Output the number of ways to choose a color and a position of a new ball in order to eliminate all the balls.

## Sample

- Input:
```
BBWWBB
```

- Output:
```
3
```

## Explanation

- For case 1: <br> **In this example, Raj could choose a ball of color 'B' and insert it between the two 'W's, resulting in the elimination of all the 'B's then the 'W's, leaving no balls. Alternatively, he could choose a ball of color 'W' and insert it between the two segments of 'B's, resulting in the elimination of all the 'W's then the 'B's, leaving no balls. Therefore, there are 3 ways to choose a color and a position for the new ball that will result in the elimination of all the balls.**
