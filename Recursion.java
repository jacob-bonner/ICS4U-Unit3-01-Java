/*
* This program takes the word "recursion" and reverses the order of the letters
* using recursion.
*
* @author  Jacob Bonner
* @version 1.0
* @since   2021-01-04
*/

public class Recursion {
  /**
   * This function will reverse a string that is passed into it using recursion.
   */
  static String reverseString(String someString) {
    if (someString.length() == 0) {
      // Returning the current itteration of the string
      return someString;
    } else {
      // Calling and returning the reverseString function again to continue
      //   reversing the original word
      return reverseString(someString.substring(1)) + someString.charAt(0);
    }
  }

  /**
   * This function prints a string then prints the same string in reverse.
   */
  public static void main(String[] args) {
    // Initializing the original string
    String recursionString = "recursion";

    // Printing the initial string
    System.out.println("The original string is '" + recursionString + "'");

    // Calling the function that will reverse the string
    String newString = reverseString(recursionString);

    // Printing out the newly reversed string
    System.out.println("The newly reversed string is '" + newString + "'");
  }
}
