import javax.swing.*;

public class ChilliToGo {
    public static void main(String[] args) {
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

        int totalAdultCost = ADULTMEALPRICE * adultMeals;
        int totalChildrenCost = CHILDRENMEALPRICE * childrenMeals;
        int totalCost = totalAdultCost + totalChildrenCost;

        JOptionPane.showMessageDialog(null, "Total cost of adult meals: $" + totalAdultCost +
                "\nTotal cost of children's meals: $" + totalChildrenCost +
                "\nTotal cost of all meals: $" + totalCost);
    }

}
