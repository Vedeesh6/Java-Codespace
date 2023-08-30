# [Problem: Total gift pairs](https://my.newtonschool.co/playground/code/09jmjpdmolk0)

In a gift store, you have won a coupon with a coupon number. This coupon can be used to purchase pairs of gifts, and it provides a discount on pairs of gifts whose sum is a multiple of the coupon number. You are given a list of n gifts with their respective costs. Your task is to find the total number of pairs of gifts that you can purchase using the coupon to get a discount.

## Input

The first line contains an integer n representing the size of gifts list. <br>
The second line contains a list of n positive integers representing the cost of each gift <br>
The third line contains a single integer representing the coupon number.

## Constraints

**1 <= n <= 10<sup>6</sup> <br>
1 ≤ gifts[i] ≤ 10<sup>5</sup> <br>
1 ≤ coupon_number ≤ 10<sup>5</sup> <br>**

## Output

Print an integer representing the total number of pairs of gifts that can be purchased using the coupon to get a discount.

## Sample

- Input:
```
5
5 7 9 10 15
5
```

- Output:
```
3
```

## Explanation

- For case 1: <br> **In the example, the pairs of gifts with sums divisible by 5 are:**
- (5, 10)
- (5, 15)
- (10, 15)
**So, the total number of such pairs is 3.**
