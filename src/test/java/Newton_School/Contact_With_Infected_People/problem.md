# [Problem: Contact With Infected People](https://my.newtonschool.co/playground/code/smi4flqdoars)

The Years 2020, and 2021 are pandemic years where people have suffered from Corona Virus. There were situations where accommodation was crucial. One such issue is now in front of us which we need to resolve.

A hostel has N rooms in a straight line. It has to accommodate **X** people. Unfortunately, out of these **X** people, **Y** of them are infected with Corona Virus. Due to safety norms, the following precaution must be taken:

No person should occupy a room directly adjacent to a room occupied by a Covid- infected person. In particular, two Covid- infected people cannot occupy adjacent rooms.

For example, if room 4 has a Covid- infected person, then nobody should occupy rooms 3 and 5. Similarly, if room 1 has a Covid- infected person then nobody should occupy room 2.

What's the minimum value of N for which all the people can be accommodated in the hostel, following the above condition?

## Input

Each test case contains the total number of people and the number of Covid- infected people.

## Constraints

**1 ≤ X ≤ 1000** <br>
**0 ≤ X ≤ Y** <br>

## Output

For each test case, output on a new line a single integer — the minimum value of **N** for which all the people can be accommodated in the hostel.

## Sample

- Input:
```
4 0
5 3
```

- Output:
```
4
8
```

## Explanation

- For case 1: **[1,1,1,1]** <br>
- For case 2:b **[1,0,1,0,1,0,1,1]**
