import javax.swing.*;

public class ChilliToGoProfit {
    public static void main(String[] args) {
        final double COSTTOPRODUCEADULTMEAL = 4.35;
        final double COSTTOPRODUCECHILDRENMEAL = 3.10;
        final int ADULTMEALPRICE = 7;
        final int CHILDRENMEALPRICE = 4;
        String stringAdultMeals = JOptionPane.showInputDialog(null,
                "Enter the number of adult meals:",
                "Adult Meals",
                JOptionPane.INFORMATION_MESSAGE);
        String stringChildrenMeals = JOptionPane.showInputDialog(null,
                "Enter the number of children's meals:",
                "Children's meals",
                JOptionPane.INFORMATION_MESSAGE);

        int adultMeals = Integer.parseInt(stringAdultMeals);
        int childrenMeals = Integer.parseInt(stringChildrenMeals);

        double totalAdultProfit = (ADULTMEALPRICE - COSTTOPRODUCEADULTMEAL) * adultMeals;
        double totalChildrenProfit= (CHILDRENMEALPRICE - COSTTOPRODUCECHILDRENMEAL) * childrenMeals;
        double totalProfit = totalAdultProfit + totalChildrenProfit;

        JOptionPane.showMessageDialog(null, "Total profit of adult meals: $" +
                String.format("%.2f", totalAdultProfit) +
                "\nTotal profit of children's meals: $" + String.format("%.2f", totalChildrenProfit)+
                "\nTotal profit of all meals: $" + String.format("%.2f", totalProfit));
    }

}
