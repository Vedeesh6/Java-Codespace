# [Problem: Transfusion Chain](https://www.codechef.com/problems/TRANCHAIN)

In living donation, the following blood types are compatible: 
- Blood type A donors can donate to recipients with blood types A and AB.
- Blood type B donors can donate to recipients with blood types B and AB.
- Blood type AB donors can donate to recipients with blood type AB only.
- Blood type O donors can donate to recipients with blood types A, B, AB and O.

There are N people in a hospital where the blood type of the i<sup>th</sup> person is denoted by B<sub>i</sub>. Note that the value of B<sub>i</sub> can be A, B, AB, or O only. <br>
A chain is formed when a donor can donate blood to a recipient, who in turn can donate blood to another recipient, and so on. <br>
Find the maximum number of people that can form a chain of blood transfusions.

## Input

- The first line of input will contain a single integer T, denoting the number of test cases.
- Each test case consists of multiple lines of input.
 - The first line of each test case contains an integer N — the number of people.
 - The next line contains N space separated strings B<sub>i</sub> — denoting the blood group of each person.

## Constraints

- 1 ≤ T ≤ 1000
- 1 ≤ N ≤ 10<sup>5</sup>
- B<sub>i</sub> ∈ {A, B, AB, O}.
- The sum of N over all test cases won't exceed 2⋅10<sup>5</sup>.

## Output

For each test case, output on a new line, the maximum number of people that can form a chain of blood transfusions.

## Sample

- Input:
```
4
3
A B A
2
A B
4
A B O B
5
AB A A AB A
```

- Output:
```
2
1
3
5
```

## Explanation

- For case 1: Person 1 can donate to person 3. Thus, a chain of 2 people is formed 
- For case 2: Neither person can donate blood to the other. Thus, there is a single person in the chain.
- For case 3: Consider the chain 3 → 2 → 4. Here, person 3 can donate to person 2, and person 2 can donate to person 4. Thus, a chain of 3 people can be formed.
- For case 4: The chain 2 → 3 → 5 → 1 → 4 of 5 people is possible for blood transfusions.
