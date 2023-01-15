import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        String lastName = sc.next();
        int rollNumber = sc.nextInt();
        String fieldOfInterest = sc.next();
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Field of interest: " + fieldOfInterest);
        sc.close();
    }
}