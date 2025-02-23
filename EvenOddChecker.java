import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        int userInput = getIntegerInput();
        System.out.printf("%d is an %s number\n", userInput, checkEvenOrOdd(userInput));
    }

    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        int integer;
        do {
            System.out.print("Enter an integer: ");
            integer = scanner.nextInt();
        } while(!isInt(integer));
        scanner.close();
        return integer;
        
    }

    public static boolean isInt(int num) {
        if (num == (int) num) return true;
         else return false;
        
    }

    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) return "Even";
        return "Odd";
    }
}
