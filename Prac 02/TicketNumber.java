import javax.swing.*;

public class TicketNumber {
    public static void main(String[] arg) {
        String stringTicketNumber;
        boolean isSixDigits = false;
        int ticketNumber = 0;

        while (!isSixDigits) {
            stringTicketNumber = JOptionPane.showInputDialog("Enter valid ticket number:");

            if (stringTicketNumber.length() != 6) {
                JOptionPane.showMessageDialog(null, "The ticket number must be 6 digits.",
                        "Invalid Ticket Number", JOptionPane.INFORMATION_MESSAGE);
            }

            else {
                try {
                    ticketNumber = Integer.parseInt(stringTicketNumber);
                    isSixDigits = true;

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "The ticket number must be 6 digits.",
                            "Invalid Ticket Number", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }

        int removeLastDigit = ticketNumber/10;
        int lastDigit = ticketNumber%10;

        if (removeLastDigit % 7 == lastDigit){
            JOptionPane.showMessageDialog(null, "True",
                    "Valid Ticket Number", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "False",
                    "Valid Ticket Number", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
