package wsb.po.dwa;

import java.util.Scanner;

public class PalindromeCheck {
    public static boolean isPalindrome(String word) {
        word = word.toLowerCase();
        System.out.println(word.contentEquals(new StringBuilder(word).reverse()));
        System.out.println(word == ((new StringBuilder(word).reverse()).toString()));
        return word.contentEquals(new StringBuilder(word).reverse());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj słowo: ");
        String word = scanner.nextLine();
        scanner.close();

        System.out.println(isPalindrome(word) ? "To palindrom!" : "To nie jest palindrom.");
    }
}

