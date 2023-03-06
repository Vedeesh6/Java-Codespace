What is the time complexity of the following code :
```java
int a = 0;
for (i = 0; i < N; i++) {
  for (j = N; j > i; j--) {
    a = a + i + j;
  }
}
```

- O(N)
- O(N*log(N))
- O(N * Sqrt(N))
- O(N*N)

**Answer D**
