package Tasks.Day11_IfStatement;

import java.util.Scanner;

public class FieldTrip {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n Please enter grade number" );
        int grade = input.nextInt();



        if (grade==1){
            System.out.println("\t\tgrade - 1\n" +
                    "        location -  Apple orchard\n" +
                    "        number of groups - 3\n" +
                    "        teacher in charge - Ms. Smith");
        }else if (grade==2){
            System.out.println("\t\tgrade - 2\n" +
                    "        location - Zoo\n" +
                    "        number of groups - 7\n" +
                    "        teacher in charge - Mr. Le");
        }else if (grade==3){
            System.out.println("\t\tgrade - 3\n" +
                    "        location - Aquarium\n" +
                    "        number of groups - 5\n" +
                    "        teacher in charge - Ms. Wilson");
        }else if (grade==4){
            System.out.println("\t\tgrade - 4\n" +
                    "        location - Movie theater  \n" +
                    "        number of groups - 2\n" +
                    "        teacher in charge - Ms. Reyes");
        }else if (grade==5){
            System.out.println("\t\tgrade - 5\n" +
                    "        location - Museum \n" +
                    "        number of groups - 5\n" +
                    "        teacher in charge - Ms. Lela ");
        }else if (grade==6){
            System.out.println("\t\t\tgrade - 6+\n" +
                    "           location - Six Flags\n" +
                    "           number of groups - 8\n" +
                    "           teacher in charge - Mr. Watt");
        }else {
            System.out.println("invalid value");
        }
    }
}
/*
    Create a class called FieldTrip. Your school goes on a Field trip each year.
The place you go will be based on your grade. Given a variable gradeNumber (1-6)
figure out the details of your field trip.Print the information at the end.

    Data based on grade:

        grade - 1
        location -  Apple orchard
        number of groups - 3
        teacher in charge - Ms. Smith

        grade - 2
        location - Zoo
        number of groups - 7
        teacher in charge - Mr. Lee

        grade - 3
        location - Aquarium
        number of groups - 5
        teacher in charge - Ms. Wilson

        grade - 4
        location - Movie theater
        number of groups - 2
        teacher in charge - Ms. Reyes

        grade - 5
        location - Museum
        number of groups - 5
        teacher in charge - Ms. Lela

        grade - 6
        location - Six Flags
        number of groups - 8
        teacher in charge - Mr. Watt
 */