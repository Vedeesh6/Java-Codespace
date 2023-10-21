# [Problem: Chef and Coupon](https://www.codechef.com/problems/COUPON2)

Chef wants to order food from a food delivery app. He wishes to order once today, and buy three items costing A<sub>1</sub>, A<sub>2</sub> and A<sub>3</sub> rupees, respectively. He'll also order once tomorrow, when he'll buy three items costing B<sub>1</sub>, B<sub>2</sub> and B<sub>3</sub> rupees, respectively. There is an additional delivery charge of rupees D for each order.

He notices that there is a coupon on sale, which costs rupees C. If he buys that coupon, the delivery charges on any day, on an order of rupees 150 or more shall be waived (that is, the D rupees will not be added, if the sum of the costs of the items is ≥150).

Note that Chef is ordering the three items together on each day, so the delivery charge is charged only once each day. Also, note that it's only needed to buy the coupon once to avail the delivery fee waiver on both days.

Should Chef buy the coupon? Note that Chef shall buy the coupon only if it costs him strictly less than what it costs him without the coupon, in total.

## Input

- The first line of the input contains a single integer T, denoting the number of test cases.
- The first line of each test case contains two space-separated integers D and C, denoting the delivery charge, and the price of the coupon, respectively.
- The second line of each test case contains three space-separated integers A<sub>1</sub>, A<sub>2</sub> and A<sub>3</sub>, denoting the prices of the food items that Chef plans to order on Day 1, respectively.
- The third line of each test case contains three space-separated integers B<sub>1</sub>, B<sub>2</sub> and B<sub>3</sub>, denoting the prices of the food items that Chef plans to order on Day 2, respectively.

## Constraints

- 1 ≤ T ≤ 10<sup>4</sup>
- 1 ≤ D,C ≤ 100
- 1 ≤ A<sub>1</sub>, A<sub>2</sub>, A<sub>3</sub> ≤ 100
- 1 ≤ B<sub>1</sub>, B<sub>2</sub>, B<sub>3</sub> ≤ 100

## Output

For each test case, output YES if Chef should buy the coupon, and NO otherwise, in a separate line.

## Sample

- Input:
```
2
90 100
100 50 10
80 80 80
30 30
100 100 100
10 20 30
```

- Output:
```
YES
NO
```

## Explanation

- For case 1: On the first day, Chef plans on ordering three food items, costing a total of rupees (100+50+10)=160. On the second day, Chef plans on ordering three food items, costing a total of rupees (80+80+80)=240. <br>
If Chef buys the coupon he shall save the delivery charge on both days, but the coupon shall cost him rupees 100 extra. In total, it shall cost him (160+240+100)=500. <br>
Without the coupon, Chef will have to pay the delivery charges for both days, which shall cost him a total of rupees (160+240+90+90)=580. <br>
Thus, it's better for Chef to buy the coupon.<br>
- For case 2: On the first day, Chef plans on ordering three food items, costing a total of rupees (100+100+100)=300. On the second day, Chef plans on ordering three food items, costing a total of rupees (10+20+30)=60. <br>
If Chef buys the coupon he shall save the delivery charge on only the first day, but the coupon shall cost him rupees 30 extra. In total, it shall cost him (300+60+30 (coupon cost) +30 (delivery cost for second day))=420. <br>
Without the coupon, Chef will have to pay the delivery charges for both days, which shall cost him a total of rupees (300+60+30 (delivery cost for first day)
+30 (delivery cost for second day))=420. <br>
Since it shall cost him the same amount in both the cases, Chef shall not buy the coupon.
