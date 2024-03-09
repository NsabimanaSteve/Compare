import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word1 = input.nextLine();
        System.out.println("Enter the second word: ");
        String word2 = input.nextLine();
        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();

        if ((num1 == num2) && word1.equals(word2)) {
            System.out.println("Match with the equality operator.");
        } 
        else if ((num1 == num2) && word1.equalsIgnoreCase(word2)) {
            System.out.println("Match with the equality operator.");

        }else
            System.out.println("Do not match with the equality operator.");
        
        
    }

}
