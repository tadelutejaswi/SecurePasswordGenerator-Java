import java.security.SecureRandom;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*()-_+=<>?";

        String allChars = upper + lower + numbers + symbols;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password length: ");
        int length = scanner.nextInt();

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(allChars.length());
            password.append(allChars.charAt(index));
        }

        System.out.println("Generated Password: " + password.toString());
    }
}
