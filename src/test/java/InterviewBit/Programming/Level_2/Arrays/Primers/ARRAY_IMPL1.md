Predict the output of the following program :
```java
int* performOps(int *A, int len, int *blen) {
    int i;
    *blen = len * 2;
    int *B = (int *)malloc((*blen) * sizeof(int));
    for (i = 0; i < len; i++) {
        B[i] = A[i];
        B[i + len] = A[(len - i) % len];
    }
    return B;
}
```
**Lets say performOps was called with len = 4, and A : [5, 10, 2, 1].** <br>

What would be the output of the following call :<br>
( NOTE : The output shoudl be written in the below provided text field , there should not be any ‘,’ between the numbers . For example: 1 2 3 4 )
```java
int blen; 
int *B = performOps(A, len, &blen);
int i;
for (i = 0; i < blen; i++) {
    printf("%d ", B[i]);
}
```
Your answer here
```
5 10 2 1 5 1 2 10
```
