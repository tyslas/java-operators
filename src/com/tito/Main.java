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

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("it isn't an alien!");

        int topScore = 90;
        if (topScore != 100)
            System.out.println("you got the high score!");

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("greater than secondTopScore and less than 100");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("topScore > 90 or secondTopScore <= 90");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("this is true");

        boolean isCar = false;
        if (isCar)
            System.out.println("this isn't supposed to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("wasCar is true \n");

        //CHALLENGE
        // 1. create a double variable with value of 20
        // 2. create a second variable of type double with value 80
        // 3. add both numbers and multiply by 25
        // 4. find the remainder from the result of (#3) mod 40
        // 5. write an if statement to display the message "total was over the limit"
        //  if the remaining total from (#4) is equal <= 20

        System.out.println("CHALLENGE:");
        double newDouble = 20d;
        System.out.println("newDouble: " + newDouble);
        double secondDouble = 80d;
        System.out.println("secondDouble: " + secondDouble);
        double sum = (newDouble + secondDouble) * 25d;
        System.out.println("sum: " + sum);
        double sumMod = sum % 40d;
        System.out.println(sum + " % 40: " + sumMod);
        if (sumMod <= 20)
            System.out.println("total was over the limit");

    }
}
