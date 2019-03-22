import javax.swing.*;

public class QuartsToGallonsInterative {
    public static void main(String[] args){
        final int QUARTSINGALLON = 4;
        String stringNumQuartsNeeded = JOptionPane.showInputDialog(null,
                "Enter the number of quarts needed for the job:",
                "Purchases",
                JOptionPane.INFORMATION_MESSAGE);
        int numQuartsNeeded = Integer.parseInt(stringNumQuartsNeeded);
        int quarts = numQuartsNeeded % QUARTSINGALLON;
        int gallons = numQuartsNeeded / QUARTSINGALLON;
        JOptionPane.showMessageDialog(null,"A job that needs " + numQuartsNeeded +
                " quarts required " + gallons + " gallons plus " +
                quarts + " quarts.");
    }
}

