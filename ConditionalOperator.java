import java.util.Scanner;

public class ConditionalOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is " + result);
    }
}