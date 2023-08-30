# [Problem: Patients in the hospital](https://my.newtonschool.co/playground/code/71eeo8rws4hd)

Bob owns a hospital and In that hospital, a total n number of patients have booked the time slots for their check-up. Bob doesn’t want any patient to wait for their turn due to the unavailability of doctors. Bob asks you to determine the number of doctors needed such that no patient needs to wait for check-up.
<br>
Time slots are given in form of two arrays:
- Arrival time array (A) : Time when the patient arrives
- Departure time array (B) : Time when the patients leaves after check-up.

## Input

The first line of the input contains a single integer n, representing the number of patients. <br>
The second line of the input contains n space separated integers where the ith number represents the arrival time of the ith patient. <br>
The third line of the input contains n space separated integers where the ith number represents the leaving time of the ith patient. <br>

## Constraints

**1 ≤ n ≤ 10<sup>5</sup> <br>
0 ≤ A[i] ≤ B[i] ≤ 2359**

## Output

Print an integer representing the minimum number of doctors required in the hospital.

## Sample

- Input:
```
3
1000 1300 1100
1150 1420 1150
```

- Output:
```
2
```

## Explanation

- For case 1: <br> **First patient comes at 1000 and leaves at 1150 but the Third patient comes at 1100 (And the first patient is still in check-up), so minimum requirement is of 2 doctors so far. While the second patients comes when the patient 1 and 2 have gone.
Hence the total doctors required are 2.**
