What is the time complexity of the following code :
```java
int i, j, k = 0;
for (i = n/2; i <= n; i++) {
    for (j = 2; j <= n; j = j * 2) {
         k = k + n/2;
    }
}
```

- Θ(n)
- Θ(nLogn)
- Θ(n^2)
- Θ(n^2 / Logn)
- Θ(n^2Logn)

**Answer B**
