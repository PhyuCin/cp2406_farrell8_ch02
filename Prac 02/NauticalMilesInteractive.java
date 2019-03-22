import javax.swing.*;

public class NauticalMilesInteractive {
    public static void main(String[] args){
        final double KMINNAUTICALMILE = 1.852;
        final double MILESINNAUTICALMILE = 1.150779;
        String stringNauticalMiles = JOptionPane.showInputDialog(null,
                "Enter the number of quarts needed for the job:",
                "Purchases",
                JOptionPane.INFORMATION_MESSAGE);
        double nauticalMiles= Double.parseDouble(stringNauticalMiles);
        double kilometers = KMINNAUTICALMILE * nauticalMiles;
        double miles = MILESINNAUTICALMILE * nauticalMiles;

        JOptionPane.showMessageDialog(null,"There are " + kilometers + " kilometers in " +
                nauticalMiles + " nautical miles.\nThere are " + miles + " miles in " + nauticalMiles +
                " nautical miles.");
    }
}
