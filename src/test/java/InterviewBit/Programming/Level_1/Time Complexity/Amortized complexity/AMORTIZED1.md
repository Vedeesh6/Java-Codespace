What is the time complexity of the following code :
```java
        int j = 0;
        for(int i = 0; i < n; ++i) {
            while(j < n && arr[i] < arr[j]) {
                j++;
            }
        }
```

- O(n)
- O(n^2)
- O(nlogn)
- O(n(logn)^2)
- Can't say. Depends on the value of arr.

**Answer A**
