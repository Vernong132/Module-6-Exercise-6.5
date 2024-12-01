import java.util.Scanner;

public class NumberSorter {
 
    public static void main(String[] args) {
        // Scannenr to allow user input
        Scanner input = new Scanner(System.in); 

        // Prompt the user to enter three numbers
        System.out.print("Please enter three numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        
        // Close Scanner
        input.close();
    
        // Display numbers in ascending order
        DisplaySorted(number1, number2, number3);
    }

    
    public static void DisplaySorted(double num1, double num2, double num3) {
        double temp; 

        // Compare numbers to find/sort into ascending order
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num1 > num3) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        // Display result
        System.out.println(num1 + " " + num2 + " " + num3);
    }
}

// Pseudocode
// START

  // PROMPT the user to enter three numbers
  // READ the three numbers into number1, number2, and number3

  // CALL DisplaySorted with number1, number2, number3

  // FUNCTION DisplaySorted(num1, num2, num3):
      // SET temp to 0

      // IF num1 > num2 THEN
          // SWAP num1 and num2
      // END IF

      // IF num1 > num3 THEN
          // SWAP num1 and num3
      // END IF

      // IF num2 > num3 THEN
          // SWAP num2 and num3
      // END IF

      // PRINT num1, num2, num3
  // END FUNCTION

// END
