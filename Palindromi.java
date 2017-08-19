import java.util.Scanner;

public class Palindromi {
    
    public static String reversed(String text) {
        String res = "";
        int counter = text.length()-1;
        while(counter >= 0) {
            res += text.charAt(counter);
            counter--;
        }
        return res;
    }
    
    public static boolean palindrome(String text) {
        if(text.equals(reversed(text))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
