import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        sc.nextLine();  // consume the remaining newline

        for (int i = 0; i < numberOfCases; i++) {
            String line = sc.nextLine();
            StringBuilder encrypted = new StringBuilder();

            // First step: Shift each letter 3 positions to the right in ASCII table
            for (char c : line.toCharArray()) {
                if (Character.isLetter(c)) {
                    c += 3;
                }
                encrypted.append(c);
            }

            // Second step: Reverse the string
            encrypted.reverse();

            // Third step: Move the second half of the string one position to the left in ASCII table
            for (int j = encrypted.length() / 2; j < encrypted.length(); j++) {
                encrypted.setCharAt(j, (char) (encrypted.charAt(j) - 1));
            }

            System.out.println(encrypted);
        }

        sc.close();
    }
}

