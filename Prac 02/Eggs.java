import javax.swing.*;

public class Eggs {
    public static void main(String[] args){
        final int DOZEN = 12;
        final double DOZENPRICE = 3.25;
        final double SINGLEPRICE = 0.45;

        String stringNumOfEggs = JOptionPane.showInputDialog(null,
                "Enter the number of eggs:", "Number of eggs",
                JOptionPane.INFORMATION_MESSAGE);

        int numOfEggs = Integer.parseInt(stringNumOfEggs);
        int dozens = numOfEggs / DOZEN;
        int singles = numOfEggs % DOZEN;

        double totalPrice = dozens * DOZENPRICE + singles * SINGLEPRICE;

        JOptionPane.showMessageDialog(null, "You ordered " +
                numOfEggs + " eggs. That's " + dozens + " dozens at $" + DOZENPRICE +
                " per dozen and " + singles + " loose eggs at " + Math.round(SINGLEPRICE * 100) +
                " cents each for a total of $" + String.format("%.2f", totalPrice) + ".");

    }
}
