# [Problem: Chef and Notebooks](https://www.codechef.com/problems/CNOTE)

Chef likes to write poetry. Today, he has decided to write a X pages long poetry, but unfortunately his notebook has only Y pages left in it. Thus he decided to buy a new CHEFMATE notebook and went to the stationary shop. Shopkeeper showed him some N notebooks, where the number of pages and price of the i<sup>th</sup> one are P<sub>i</sub> pages and C<sub>i</sub> rubles respectively. Chef has spent some money preparing for Ksen's birthday, and then he has only K rubles left for now.

Chef wants to buy a single notebook such that the price of the notebook should not exceed his budget and he is able to complete his poetry.

Help Chef accomplishing this task. You just need to tell him whether he can buy such a notebook or not. Note that Chef can use all of the Y pages in the current notebook, and Chef can buy only one notebook because Chef doesn't want to use many notebooks.

## Input

- The first line of input contains an integer T, denoting the number of test cases. Then T test cases are follow.
- The first line of each test case contains four space-separated integers X, Y, K and N, described in the statement. The ith line of the next N lines contains two space-separated integers P<sub>i</sub> and C<sub>i</sub>, denoting the number of pages and price of the i<sup>th</sup> notebook respectively.

## Constraints

- 1 ≤ T ≤ 10<sup>5</sup>
- 1 ≤ Y < X ≤ 10<sup>3</sup>
- 1 ≤ K ≤ 10<sup>3</sup>
- 1 ≤ N ≤ 10<sup>5</sup>
- 1 ≤ P<sub>i</sub>, C<sub>i</sub> ≤ 10<sup>3</sup>

## Output

For each test case, Print "LuckyChef" if Chef can select such a notebook, otherwise print "UnluckyChef" (quotes for clarity).

## Sample

- Input:
```
3
3 1 2 2
3 4
2 2    
3 1 2 2
2 3
2 3    
3 1 2 2
1 1
1 2
```

- Output:
```
LuckyChef
UnluckyChef
UnluckyChef
```

## Explanation

- For case 1: In this case, Chef wants to write X = 3 pages long poetry, but his notebook has only Y = 1 page. And his budget is K = 2 rubles, and there are N = 2 notebooks in the shop. The first notebook has P<sub>1</sub> = 3 pages, but Chef cannot buy it, because its price is C<sub>1</sub> = 4 rubles. The second notebook has P<sub>2</sub> = 2 pages, and its price is C<sub>2</sub> = 2 rubles. Thus Chef can select the second notebook to accomplish the task. He will write 1 page of poetry in the old notebook, and 2 page of poetry in the new notebook.
- For case 2: Chef cannot buy any notebook, because the prices exceed the Chef's budget.
- For case 3: No notebook contains sufficient number of pages required to write poetry.
