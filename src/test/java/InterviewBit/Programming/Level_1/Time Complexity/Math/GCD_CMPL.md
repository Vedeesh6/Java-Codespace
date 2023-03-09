In the following C++ function, let n >= m.
```java
int gcd(int n, int m) {
  if (n%m ==0) return m;
  if (n < m) swap(n, m);
  while (m > 0) {
    n = n%m;
    swap(n, m);
  }
  return n;
}
```
What is the time complexity of the above function assuming n > m?. <br>
**Θ symbol represents theta notation and Ω symbol represents omega notation.**

- Θ(logn)
- Ω(n)
- Θ(loglogn)
- Θ(sqrt(n))

**Answer A**
