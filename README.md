# homework2
###### by Thanapoom Rattanathumawat

```java
public static long fibonacci(int n) {
 // the base case
 if (n < 2) return 1;
 // the recursive step
 return fibonacci(n-1) + fibonacci(n-2);
}
```

##### The code example above complies slowly due to it having to repetitively calcualte useless steps as it runs.
