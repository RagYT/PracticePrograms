package org.example;

public class PrimeNumUpto100 {

    public static void main( String[] args )
    {
        primeNumInRange(100);
    }

    public static void primeNumInRange(int n){//sieve of eratosthenes is most efficient way to find prime num
        int[] sieve = new int[n+1];
        sieve[0] = 0;
        for(int i=1;i<n;i++)
            sieve[i]=1;
        for(int i=2; i*i<n; i++) {
            if (sieve[i] == 1) {
                for (int j = i*i; j<n; j = j+i) {
                    sieve[j] = 0;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(sieve[i] == 1)
                System.out.print(i+",");
        }
    }
    //Time : O(n*log(log(n))) Space: O(n)
}
