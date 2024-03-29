# [Problem: Funny Hand](https://www.codechef.com/problems/FUNHAND)

MoEngage has 3 decks. Each deck consists of N cards, numbered from 1 to N. He draws out 1 card from each deck randomly with each card having an equal probability of being drawn.

MoEngage drew cards numbered A and B from the decks 1 and 2 respectively. Now, he wonders what is the probability that he will end up with a funny hand after drawing the third card.

A funny hand is when 3 consecutive numbered cards are present in your hand.
Help MoEngage calculate the probability of ending up with a funny hand after drawing the third card.

If the final probability of ending up with a funny hand is P, you need to print the value P⋅N. It can be shown that this value is an integer.

## Input

- First line will contain T, the number of test cases. Then the test cases follow.
- Each test case contains a single line of input consisting of three space-separated integers N,A, and B denoting the size of each deck, the card drawn from the first deck, and the card drawn from the second deck respectively.

## Constraints

- 1 ≤ T ≤ 1000
- 3 ≤ N ≤ 1000
- 1 ≤ A, B ≤ N

## Output

For each test case, output a single integer, denoting P⋅N on a separate line.

## Sample

- Input:
```
3
4 2 3
6 2 1
5 2 5
```

- Output:
```
2
1
0
```

## Explanation

- For case 1: Drawing the cards 1 or 4 will result in a funny hand. Hence, the probability will be P = 1/2. The value P⋅N = (1/2)⋅4 = 2.
- For case 3: No matter what card MoEngage draws, he will never end up with a funny hand.
