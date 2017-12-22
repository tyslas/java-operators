package com.tito;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        result -= 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result *= 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result /= 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result %= 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result ++;
        System.out.println("the result is now: " + result);

        previousResult = result;
        result --;
        System.out.println("the result is now: " + result);
        
    }
}
