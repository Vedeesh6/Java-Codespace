# [Problem: Truth and Dare](https://www.codechef.com/problems/TRUEDARE)

Ram and Shyam are playing a game of Truth and Dare. In this game, Shyam will ask Ram to perform tasks of two types:

- Truth task: Ram has to truthfully answer a question.
- Dare task: Ram has to perform a given task.

Each task is described by an integer. (If a truth task and a dare task are described by the same integer, they are still different tasks.) You are given four lists of tasks:

- T<sub>r,1</sub>, T<sub>r,2</sub>, ..., T<sub>r,t<sub>r</sub></sub> : the truth tasks Ram can perform.
- D<sub>r,1</sub>, D<sub>r,2</sub>, ..., D<sub>r,d<sub>r</sub></sub> : the dare tasks Ram can perform.
- T<sub>s,1</sub>, T<sub>s,2</sub>, ..., T<sub>s,t<sub>s</sub></sub> : the truth tasks Shyam can ask Ram to perform.
- D<sub>s,1</sub>, D<sub>s,2</sub>, ..., D<sub>s,d<sub>s</sub></sub> : the dare tasks Shyam can ask Ram to perform.

Note that the elements of these lists are not necessarily distinct, each task may be repeated any number of times in each list.

Shyam wins the game if he can find a task Ram cannot perform. Ram wins if he performs all tasks Shyam asks him to. Find the winner of the game.

Let's take an example where Ram can perform truth tasks 3, 2 and 5 and dare tasks 2 and 100, and Shyam can give him truth tasks 2 and 3 and a dare task 100. We can see that whichever truth or dare tasks Shyam asks Ram to perform, Ram can easily perform them, so he wins. However, if Shyam can give him dare tasks 3 and 100, then Ram will not be able to perform dare task 3, so Shyam wins.

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains a single integer t<sub>r</sub>.
- The second line contains t<sub>r</sub> space-separated integers T<sub>r,1</sub>, T<sub>r,2</sub>, ..., T<sub>r,t<sub>r</sub></sub>.
- The third line contains a single integer d<sub>r</sub>.
- The fourth line contains d<sub>r</sub> space-separated integers D<sub>r,1</sub>, D<sub>r,2</sub>, ..., D<sub>r,d<sub>r</sub></sub>.
- The fifth line contains a single integer t<sub>s</sub>.
- The sixth line contains t<sub>s</sub> space-separated integers T<sub>s,1</sub>, T<sub>s,2</sub>, ..., T<sub>s,t<sub>s</sub></sub>.
- The seventh line contains a single integer d<sub>s</sub>.
- The eighth line contains d<sub>s</sub> space-separated integers D<sub>s,1</sub>, D<sub>s,2</sub>, ..., D<sub>s,d<sub>s</sub></sub>.

## Constraints

- 1 ≤ T ≤ 100
- 1 ≤ t<sub>r</sub>, d<sub>r</sub>, t<sub>s</sub>, d<sub>s</sub> ≤ 100
- 1 ≤ T<sub>r,i</sub> ≤ 100 for each valid i.
- 1 ≤ D<sub>r,i</sub> ≤ 100 for each valid i.
- 1 ≤ T<sub>s,i</sub> ≤ 100 for each valid i.
- 1 ≤ D<sub>s,i</sub> ≤ 100 for each valid i.

## Output

For each test case, print a single line containing the string "yes" if Ram wins the game or "no" otherwise.

## Sample

- Input:
```
4
2
1 2
3
1 3 2
1
2
2
3 2
2
1 2
3
1 3 2
1
2
3
3 2 4
3
3 2 5
2
2 100
1
2
1
100
2
1 2
3
1 3 2
1
2
3
3 2 2
```

- Output:
```
yes
no
yes
yes
```

## Explanation

- For case 1: Ram's truth tasks are [1,2] and his dare tasks are [1,3,2]. Shyam's truth tasks are [2] and his dare tasks are [3,2]. Ram can perform all tasks Shyam gives him.
- For case 2: Ram's truth tasks are [1,2] and his dare tasks are [1,3,2]. Shyam's truth tasks are [2] and his dare tasks are [3,2,4]. If Shyam asks Ram to perform dare task 4, Ram will not be able to do it.
