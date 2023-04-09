# [Problem: Replace Tires](https://my.newtonschool.co/playground/code/39d5ryzqcp5j)

Spring has come, and the management of the AvtoBus bus fleet has given the order to replace winter tires with summer tires on all buses. You own a small bus service business and you have just received an order to replace n tires. You know that the bus fleet owns two types of buses: with two axles (these buses have 4 wheels) and with three axles (these buses have 6 wheels).
You don't know how many buses of which type the AvtoBus bus fleet owns, so you wonder how many buses the fleet might have. You have to determine the minimum and the maximum number of buses that can be in the fleet if you know that the total number of wheels for all buses is n.

## Input

The input consists of an integer **n** denoting the number of wheels for all buses.

## Constraints

**1 ≤ n ≤ 10<sup>18</sup>**

## Output

Print two integers **x and y (1 ≤ x ≤ y)** — the minimum and the maximum possible number of buses that can be in the bus fleet. If there is no suitable number of buses for the given **n**, print the number **−1** as the answer.

## Sample

- Input:
```
4
7
```

- Output:
```
1 1
-1
```

## Explanation

- For case 1: <br> **1 bus of 4 wheels** <br>
- For case 2: <br> **not possible**
