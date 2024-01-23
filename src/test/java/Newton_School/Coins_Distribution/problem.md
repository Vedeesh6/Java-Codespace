# [Problem: Coins Distribution](https://my.newtonschool.co/playground/code/26djr69bvb8m)

Raj has three sisters: Ina, Bina, and Mina. They are collecting coins. Currently, Ina has a coins, Bina has b coins, and Mina has c coins.
Recently, Raj has returned from a trip around the world and brought n coins. He wants to distribute all these n coins between his sisters in such a way that the number of coins Ina has is equal to the number of coins Bina has, and is equal to the number of coins Mina has. <br>
In other words, if Raj gives A coins to Ina, B coins to Bina, and C coins to Mina (A + B + C = n), then a + A = b + B = c + C. Note that A, B, or C (the number of coins Raj gives to Ina, Bina, and Mina, respectively) can be 0. <br>
Your task is to find out if it is possible to distribute all n coins between sisters in a way described above.

## Input

The input consists of four space- separated integers a, b, c, and n (1 ≤ a, b, c, n ≤ 10^8) — the number of coins Ina has, the number of coins Bina has, the number of coins Mina has, and the number of coins Raj has.

## Output

Print "YES" if Raj can distribute all n coins between his sisters and "NO" otherwise.

## Sample

- Input:
```
5 3 2 8

3 2 1 100000000
```

- Output:
```
YES

NO
``
