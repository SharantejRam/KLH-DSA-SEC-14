import java.util.Scanner;

public class SumEvenPlaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int place = 1;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;

            if (place % 2 == 0) {
                sum = sum + digit;
            }

            num = num / 10;
            place++;
        }

        System.out.println("Sum of digits at even places = " + sum);

        sc.close();
    }
}