# [Problem: InsightFULL](https://my.newtonschool.co/playground/code/rg8exqidrf8j)

In the "Concise Insight Contest, " participants showcase their knowledge through brief written pieces. Each participant is given a distinct number ranging from 1 to 𝑛, and they each submit one piece. The length of the 𝑖- th submission is 𝑎𝑖 words, and it is awarded a distinct quality score of 𝑏𝑖. It's guaranteed that there is at least one submission that is 10 words long or shorter. The contest's champion is chosen by selecting the submission with the highest quality score from those that are 10 words or less in length. Which participant's submission will be declared the winner?

## Input

Input contains 2 lines:
- The first line contains an integer 𝑛 (1 ≤ 𝑛 ≤ 50), denoting the count of participants.
- Subsequently, each of the next 𝑛 lines presents two integers: 𝑎𝑖 (1 ≤ 𝑎𝑖 ≤ 50), indicating the submission length in words, and 𝑏𝑖 (1 ≤ 𝑏𝑖 ≤ 50), representing its quality score.

## Output

Print the ID of the contestant whose response emerges as the winner of the challenge, while considering only responses with a length of 10 words or fewer.

## Sample

- Input:
```
5
7 2
12 5
9 3
9 4
10 1
```

- Output:
```
4
```

## Explanation

- For case 1: <br> In the given example, the responses are as follows:
```
Response 1: 7 words, quality 2
Response 2: 12 words, quality 5
Response 3: 9 words, quality 3
Response 4: 9 words, quality 4
Response 5: 10 words, quality 1
````
Responses with indices 1, 3, 4, and 5 have lengths not exceeding 10 words. Out of these responses, the winner is the one with the highest quality.

Comparing the qualities, we find that:
```
Response 1 has quality 2.
Response 3 has quality 3.
Response 4 has quality 4.
Response 5 has quality 1.
```
Among these responses, Response 4 has the highest quality, making the participant with ID 4 the winner of the challenge.
