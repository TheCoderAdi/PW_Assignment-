import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int testCase, num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the test cases you want: ");
        testCase = sc.nextInt();

        while (testCase-- > 0) {
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            System.out.println("Sum: " + (num1 + num2));
        }
        sc.close();
    }
}
