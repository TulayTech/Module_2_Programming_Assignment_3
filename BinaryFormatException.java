// ----------------------------------------------------------
// BinaryFormatException.java Exercise_12.9
/*
 * Custom exception class that extends Exception.
 * This exception is thrown when a non-binary string
 * then passed to the bin2Dec() method.
 */

public class BinaryFormatException extends Exception {
    // Stores the invalid binary string for reference.
    private String binaryString;

    // Constructor that accepts the invalid string.
    public BinaryFormatException(String binaryString) {
        // Call the parent constructor
        super("Invalid binary string: " + binaryString);
        this.binaryString = binaryString;
    }

    // Getter to retrieve the invalid string
    public String getBinaryString() {
        return binaryString;
    }
}