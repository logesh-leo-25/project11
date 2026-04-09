package com.logic;

public class App {
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    public boolean isPositive(int number) {
        return number > 0;
    }

    public static void main(String[] args) {
        System.out.println("CI/CD Logic App Running...");
    }
}