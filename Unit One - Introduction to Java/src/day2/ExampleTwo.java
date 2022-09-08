package day2;

/**
 * Example about Escape Sequences
 * 
 * Naming Conventions:
 * folders (packages): all lower case with no spaces
 * Classes: UpperCare on first letter of each word (pascal case) 
 * method/functions (variables): all camelCase all lower case except the first letter of each word except the first word
 * 
 * Constants: ALL upper case _ to distingush words NUM_STUDENTS
 */
public class ExampleTwo {
    public static void main(String[] args) {
        // We must escape the " inside the round brackets because " quotes have meaning in Java
        // \ backslash is used to escape characters
        System.out.println("Computer Science is the \"Best\" Course Ever");

        // there are a small subset of characters that can be escaped.
        //BUT the AP Exam will only test you on 3 of them \\ \" \n (only 1 question)

        // \" writes " in string
        // \\ writes backslash in string

        // To display a backslash you must escape it \\

        System.out.println("This is \\\\a test.");

        System.out.println("ABCD\nEFGHIJK");

        // \n makes new line (hits enter)

    }
}