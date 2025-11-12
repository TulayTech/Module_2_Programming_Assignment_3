// Exercise 12.9 – BinaryFormatException
// ----------------------------------------------------------
/*
 * This program converts a binary string to a decimal number.
 * If the input is not a valid binary string (0s and 1s),
 * it throws a custom BinaryFormatException.
 */

import java.util.Scanner;

public class Bin2Dec {
    // Converts a binary string into a decimal integer.
    // Throws BinaryFormatException if the string contains
    // characters other than '0' or '1'.
    public static int bin2Dec(String binaryString) throws BinaryFormatException {
        // Validate that all characters are 0 or 1.
        for (int i = 0; i < binaryString.length(); i++) {
            char ch = binaryString.charAt(i);
            if (ch != '0' && ch != '1') {
                throw new BinaryFormatException(binaryString);
            }
        }

        // Converts binary string to decimal.
        int decimalValue = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            char ch = binaryString.charAt(i);
            decimalValue = decimalValue * 2 + (ch - '0');
        }

        return decimalValue;
    }
    // Main Method
    /*
     * Prompts user for a binary string, calls bin2Dec(),
     * and handles the custom BinaryFormatException.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = input.nextLine();

        try {
            int decimal = bin2Dec(binary);
            System.out.println("The decimal value is: " + decimal);
        } catch (BinaryFormatException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        input.close();
    }
}