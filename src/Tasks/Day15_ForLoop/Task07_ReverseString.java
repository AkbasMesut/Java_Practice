package Tasks.Day15_ForLoop;

public class Task07_ReverseString {

    public static void main(String[] args) {

       String str    = "Wooden Spoon";
       String result = "";

        for (int i = str.length()-1; i >= 0; i--) {//i : index numbers of str (starting last index to index 0)
            result += str.charAt(i);// adding each character to result
        }

        System.out.println("result = " + result);


    }
}
/*
Write a program that can reverse any given string

			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW

 */