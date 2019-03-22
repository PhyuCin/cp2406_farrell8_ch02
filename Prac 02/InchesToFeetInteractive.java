import javax.swing.*;

public class InchesToFeetInteractive {
    public static void main(String[] arg){
        final int INCHESINFOOT = 12;
        String stringInchesToConvert = JOptionPane.showInputDialog(null,
                "Enter the number of inches to convert:",
                "Inches to convert",
                JOptionPane.INFORMATION_MESSAGE);
        int inchesToConvert = Integer.parseInt(stringInchesToConvert);
        int feet = inchesToConvert / INCHESINFOOT;
        int inches = inchesToConvert % INCHESINFOOT;
        JOptionPane.showMessageDialog(null,
                "There are " + feet + " feets and " + inches + " inches in " + inchesToConvert + " inches.");

    }
}
