# [Problem: Most Craved Dish](https://my.newtonschool.co/playground/code/wgxzbnwwb3js)

In a bustling restaurant known for its delectable offerings, each dish is tagged with a unique integer ID. The restaurant management is curious to find out the most craved dish among its customers. They've collected feedback from n customers, each providing their favorite dish's ID in the form of an array.
<br>
Your task is to determine the dish ID that is the favorite of the maximum number of people. (It's guaranteed that there is only one most craved dish)

## Input

The input consists of two lines:
- The first line contains an integer n, the number of customers.
- The second line contains n integers separated by spaces, representing the favorite dish IDs of the customers.

## Constraints

**1 <= n <= 10<sup>5</sup> <br>
1 <= ID[i] <= 10<sup>6</sup> <br>
1 <= i <= n**

## Output

Print an integer, the Dish Id that is favorite of the maximum number of people.

## Sample

- Input:
```
10
1 2 1 2 3 2 3 2 4 2
```

- Output:
```
2
```

## Explanation

- For case 1: <br> **Dish with Id 2, appears 5 times, which is maximum.
Hence the most craved dish is 2.**
