# [Problem: Rohan and friends](https://my.newtonschool.co/playground/code/1dvnp82shu6c)

Rohan has come up with an intriguing game for his friends. The game starts with a table laid out with an empty cup and n water mugs. Players take their turns sequentially. In each turn, a player selects one of the water mugs and pours all its contents into the cup. The game has a catch: if the water from the mug causes the cup to overflow, the player who caused this overflow loses. <br>
The challenge for Rohan and his friends is to figure out whether they can play this game in such a way that no one ends up losing. The capacities of all the mugs and the cup are known. Considering there are (n - 1) friends playing, the question is whether it's possible to play the game without any of them causing the cup to overflow. Print “Yes” if it’s possible else “No”.

## Input

The first line contains integers n and s (2 ≤ n ≤ 100; 1 ≤ s ≤ 1000) — the number of mugs and the volume of the cup.<br>
The next line contains n integers a1, a2,. , an (1 ≤ a[i] ≤ 10). Number ai means the volume of the i- th mug.

## Output

In a single line, print "Yes" (without the quotes) if his friends can play in the described manner, and "No" (without the quotes) otherwise.

## Sample

- Input:
```
3 4
3 1 3

3 4
4 4 4
```

- Output:
```
Yes

No
```
