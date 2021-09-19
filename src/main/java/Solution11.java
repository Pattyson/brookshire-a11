/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Patrick Brookshire
 */

import java.util.Scanner;

public class Solution11 {

    public static void main(String[] agrs) {

        Scanner input = new Scanner(System.in);
        float dollars, euros, conversion;

        System.out.println("How many euros are you exchanging?");
        euros = input.nextFloat();

        System.out.println("What is the exchange rate?");
        conversion = input.nextFloat();

        dollars = euros * conversion;
        double roundOff = Math.round(dollars*100.0)/100.0;

        System.out.println(euros + " euros at an exchange rate of " + conversion + " is " + roundOff + " U.S dollars");

    }

}
