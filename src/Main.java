import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int reversedNumber = reverseNumber(12346);

        System.out.println("Reversed number: " + reversedNumber);

    }

    public static int reverseNumber(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return reversed;
    }
}
