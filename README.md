# homework2
###### by Thanapoom Rattanathumawat

public static long fibonacci(int n) {

 if (n < 2) return 1;

 return fibonacci(n-1) + fibonacci(n-2);
 
}

##### The code example above complies slowly due to it having to repetitively calcualte useless steps as it runs.
