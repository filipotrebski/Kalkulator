package com.example.kalkulator;

public class Calculator {

    public int add(int substractA, int substractB){
        int result = substractA + substractB;
        return result;
    }
    public int substraction(int substractA, int substractB) {
        int result = substractA -substractB;
        return result;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("12476 + 4313 = " + calculator.add(12476,4313));
        System.out.println("12476 - 4313 = " + calculator.substraction(12476,4313));
    }

}
