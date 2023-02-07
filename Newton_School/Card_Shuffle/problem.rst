.. _Problem Card Shuffle:
    https://my.newtonschool.co/playground/code/2pw5am9txzai

========================
`Card Shuffle`_
========================

Problem
-------
We have 4 cards with an integer 1 written on it, 4 cards with 2, …, 4 cards with **N**, for a total of 4 **N** cards.
Alexa shuffled these cards, removed one of them, and gave you a pile of the remaining 4 **N** −1 cards. The i- th card (1≤i≤4 **N** −1) of the pile has an integer Ai written on it.

Find the integer written on the card removed by Alexa.

.. |i| raw:: html

    <b><sub>i</sub></b>

Input
-----
The first line of input contains an integer N.
The second line contains N space separated integers as follows:

**N**\ |i|

.. |blank| raw:: html

A1 A2. . AN |i|

.. |blank| raw:: html

    <u>blank</u>

Constraints
------
1 ≤ **N** ≤ 10^5

.. |blank| raw:: html

1 ≤ A \ |i| ≤ **N**\ |i| ( 1≤ i≤ 4 **N** −1)

.. |blank| raw:: html

For each k( 1 ≤ k ≤ **N** ), there are at most 4 indices i such that A \ |i| =k.
All values in input are integers.

.. |blank| raw:: html

    <u>blank</u>

Output
------
Print the answer.
