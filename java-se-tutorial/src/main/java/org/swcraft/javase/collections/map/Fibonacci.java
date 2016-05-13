package org.swcraft.javase.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    
    private final Map<Integer, Integer> cache = new HashMap<>();
    
    public int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return cache.computeIfAbsent(n, (key) -> fib(n - 1) + fib(n - 2));
        }
    }
    
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.fib(44);
        System.out.println("result = " + result);
    }
}
