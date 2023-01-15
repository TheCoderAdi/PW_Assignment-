import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int mark1, mark2, mark3, totalMark = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks : ");
        mark1 = sc.nextInt();
        mark2 = sc.nextInt();
        mark3 = sc.nextInt();

        totalMark = mark1 + mark2 + mark3;
        float average = totalMark / 3;
        System.out.println("Total marks: " + totalMark);
        System.out.println("Percentage marks: " + average + "%");
        sc.close();
    }
}
