import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String first = sc.next();
            String second = sc.next();
            System.out.println(first + second);
        }
        sc.close();
    }
}
