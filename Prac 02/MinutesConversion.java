import java.util.Scanner;

public class MinutesConversion {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of minutes: ");
        double minutes = input.nextDouble();

        double hours = minutes / 60;
        double days = minutes / (60*24);

        System.out.println(Math.round(minutes) + " minutes equals to " + String.format("%.2f", hours) +
                " hours and equals to " + String.format("%.3f", days) + " days.");

    }
}
