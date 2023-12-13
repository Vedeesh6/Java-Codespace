# [Problem: Team Dinner I](https://my.newtonschool.co/playground/code/31yc18hdsw6v)

Seven team members eagerly gathered for a memorable team dinner at a luxurious restaurant. As the dishes arrived, they indulged in a feast, enjoying every bite. However, when the moment of truth arrived, they were taken aback. The bill was presented, and the team leader, who was assumed to be paying, revealed that each team member must contribute their fair share if the floor value of 1/3rd of the total bill is not a prime number otherwise they have to pay 0 rupees.
<br>
**NOTE: 1 is prime according to your team leader!**

## Input

The first line of the input contains a number n representing the number of items they ordered for the dinner. <br>
The second line of the input contains n space separated integers representing the price of each item.

## Constraints

**4 <= n <= 10<sup>4</sup> <br>
1 <= array_elements <= 499 <br>
The sum of array elements doesn't exceed 108 over all test cases.**

## Output

Return the amount (correct upto 2 decimal places) that each person have to contribute to ensure a fair distribution of the bill.

## Sample

- Input:
```
4
825 180 260 265
```

- Output:
```
218.57
```

## Explanation

- For case 1: <br> **21:00 + 63 => 60 min = 1 hr <br> 21 + 1 = 22 and 63 - 60 = 3 <br> 3 => 03 <br> 22:03** <br>
- For case 2: <br> **21:00 + 45 => 21:45** <br>
- For case 3: <br> **21:00 + 100 => 60 min = 1 hr <br> 21 + 1 = 22 and 100 - 60 = 40 <br> 22:40** <br>
