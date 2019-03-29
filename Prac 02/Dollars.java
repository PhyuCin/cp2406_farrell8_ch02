import java.util.Scanner;

public class Dollars {
    public static void main(String[] args){
        final int TWENTYCENTS = 20;
        final int TENCENTS = 10;
        final int FIVECENTS = 5;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of dollars: ");
        double dollars = input.nextDouble();
        double cents = 100 * dollars;

        double twenties = Math.floor(cents / TWENTYCENTS);
        cents = cents - (twenties * TWENTYCENTS);

        double tens = Math.floor(cents / TENCENTS);
        cents = cents - (tens * TENCENTS);

        double fives = Math.floor(cents / FIVECENTS);
        cents = cents - (fives * FIVECENTS);

        double ones = cents;

        System.out.println("There are " + Math.round(twenties) + " twenty cents, " + Math.round(tens) + " ten cents, " +
                Math.round(fives) + " five cents and " + Math.round(ones) + " one cents in $" + dollars);

    }
}
