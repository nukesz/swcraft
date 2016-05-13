package org.swcraft.javase.collections.puzzle;

public class Fibonacci {
    
    public int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
    
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.fib(44);
        System.out.println("result = " + result);
    }
}
