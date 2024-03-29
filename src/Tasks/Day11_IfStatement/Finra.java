package Tasks.Day11_IfStatement;

import java.util.Scanner;

public class Finra {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = input.nextInt();

        if (num % 3 == 0) {
            System.out.println("FIN");
        }
        if (num % 5 == 0) {
            System.out.println("RA");
        }
        if (num % 15 == 0) {
            System.out.println("FİNRA");
        }

    }
}

/*
    Create a class called FINRA, Write a function which prints out the number.
but for number which is a multiple of 3, print "FIN" instead of the number
and for number which is a multiple of 5, print "RA" instead of the number.
and for number which is a multiple of both 3 and 5, print "FINRA" instead of the number.

            ex:
                number = 3
            output:FIN

                number = 10
            output: RA

                number = 15
            output: FINRA
 */