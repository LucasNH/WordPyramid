/*
WordPyramid.java 
Created by: Lucas Noritomi-Hartwig
Created on: April 1, 2020
Last edited on: April 2, 2020
This program will remove the first and last characters of a string.
The program should then remove the next set of outside characters. 
The program continues in this fashion until it has hit the middle character or 
the middle two characters, completing a Word Pyramid.
*/
package wordpyramid;

import javax.swing.JOptionPane;

public class WordPyramid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Prompting user for input string
        String input = JOptionPane.showInputDialog("Enter a word.");
        System.out.println(trim(input));
    }

    public static String trim(String str) {
        // Recursive function checking length of string and triming if required
        if (str.length() == 1 || str.length() == 2) {
            return str;
        } else {
            System.out.println(str);
            return trim(str.substring(1, str.length() - 1));
        }
    }
}
