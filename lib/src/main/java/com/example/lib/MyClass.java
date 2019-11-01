package com.example.lib;

public class MyClass {
    public static void main(String[] args){
        printPrime(100);
    }

    public static void printPrime(int n){
        if(n <= 1) {
            System.out.println("n>1");
            return;
        }
        StringBuilder primes = new StringBuilder();
        for (int dividend = 2; dividend < n; dividend++){
            int dividedCount = 0;
            for(int divisor = (dividend - 1); divisor > 1; divisor--){
                if(dividend % divisor == 0) {
                    dividedCount++;
                }
            }
            if(isPrime(dividedCount)) {
                primes.append(dividend).append(",");
            }
        }
        if(primes != null && primes.length() > 0){
            primes = primes.delete(primes.length() - 1, primes.length());
        }
        System.out.println(primes.toString());
    }

    private static boolean isPrime(int dividedCount){
        return dividedCount == 0 ? true : false;
    }

}
