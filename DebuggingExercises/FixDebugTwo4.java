import javax.swing.JOptionPane;
public class FixDebugTwo4
{
   public static void main(String[] args)
   {
      String costString;
      double cost;
      final double tax = 0.06;
      costString = JOptionPane.showInputDialog(null, "Enter price of item you are buying",
              "Purchases",
         JOptionPane.INFORMATION_MESSAGE);
      cost = Integer.parseInt(costString);
      JOptionPane.showMessageDialog(null,"With " + tax * 100 +
         "% tax,  purchase  is $" + (cost - cost * tax));
   }
}
