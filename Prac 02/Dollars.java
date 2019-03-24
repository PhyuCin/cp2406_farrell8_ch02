import java.util.Scanner;

public class Dollars {
    public static void main(String[] args){
        final int TWENTYCENTS = 20;
        final int TENCENTS = 10;
        final int FIVECENTS = 5;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of dollars: ");
        int dollars = input.nextInt();
        int cents = 100 * dollars;

        int twenties = cents / TWENTYCENTS;
        cents = cents - (twenties * TWENTYCENTS);

        int tens = cents / TENCENTS;
        cents = cents - (tens * TENCENTS);

        int fives = cents / FIVECENTS;
        cents = cents - (fives * FIVECENTS);

        int ones = cents;

        System.out.println("There are " + twenties + " twenty cents, " + tens + " ten cents, " + fives +
                " five cents and " + ones + " one cents in $" + dollars);

    }
}
