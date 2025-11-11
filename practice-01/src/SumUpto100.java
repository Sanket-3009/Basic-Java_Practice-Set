
import java.util.Scanner;

public class SumUpto100 {
    //The "Sum Until 100" Loop Write a program that uses a while loop to continuously ask the user to enter a number. The loop should keep adding the numbers to a running total and stop only when the total sum is greater than 100.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum =0;

        while (sum < 100){
            System.out.print("Enter number to make sum upto 100- ");
            int temp = sc.nextInt();
            sum += temp;
        }
        System.out.println("Current sum is: " + sum);
    }
}
