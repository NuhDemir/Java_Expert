package ch005.decision;

import java.util.Scanner;

public class SwitchCaseExpression {
    public static void main(String[] args) {
        SwitchCaseExpression se = new SwitchCaseExpression();

    }



    public void demo1() {
        System.out.println("A number for a month: ");
        Scanner stdin = new Scanner(System.in);
        int month = stdin.nextInt();


        //final  int i = 5;
        // final int i = returnConstant(); //That does'nt work because it

        String monthInString = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "January";
            default -> "Error! Please enter the month number between 1 and 12";
        };
        System.out.println(monthInString);
    }


    public void demo2()
    {
    System.out.println("A number for a month: ");
    Scanner stdin = new Scanner(System.in);
    int month = stdin.nextInt();
        //char c = 16;

        int square = switch (month)
        {
            case 1 -> 1;
            case 2 -> 2;
            case 3 -> 9;
            case 4 -> 16;
            case 5 -> 25;
            case 6 -> 36;
            case 7 -> 49;
            case 8 -> 64;
            case 9 -> 81;
            case 10 -> 100;
            case 11 -> 121;
            case 12 -> 144;
            default -> -1;
        };

        System.out.println("Its square is " + square);

    }



    public void demo3()
    {
System.out.println("A number for a day Monday being 1: ");
Scanner stdin = new Scanner(System.in);
int day = stdin.nextInt();
    }

    public void demo4()
    {

    }

    private int returnMinusOne()
    {
        return -1;
    }
}
