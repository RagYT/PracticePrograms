package org.example;

public class PrimeNumCheck {

    public static void main( String[] args )
    {
        primOrNot(44);
        primOrNot(47);
        primOrNot(59);
        primOrNot(73);
    }

    public static void primOrNot(int n){
        int f=0;
        for(int i=2;i*i<n;i++){//i*i is better than n/2
            if(n%i == 0){
                f++;
                break;
            }
        }
        if(f==1) System.out.println("Not Prime");
        else System.out.println("Prime");
    }
}
