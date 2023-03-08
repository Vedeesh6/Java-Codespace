What is time complexity of following code :
```java
int count = 0;
for (int i = N; i > 0; i /= 2) {
  for (int j = 0; j < i; j++) {
    count += 1;
  }
}
```
- O(N * N)
- O(N * log N)
- O(N * log(log(N)))
- O(N)
- O(N * Sqrt(N))

**Answer D**
