package Seven;
import javax.swing.JOptionPane;

/**
 * Created by jc259968 on 7/08/17.
 */
public class Eggs {
    public static void main(String[] args) {
        String number_eggs;
        double number_eggs_int;
        double number_dozens;
        double number_loose;
        double cost;
        number_eggs = JOptionPane.showInputDialog(null,"How many eggs are you buying", "Purchases",
                JOptionPane.INFORMATION_MESSAGE);
        number_eggs_int = Double.parseDouble(number_eggs);
        number_dozens = Math.round(number_eggs_int/12);
        number_loose = (number_eggs_int%12);
        cost = (number_dozens*3.25)+(number_loose*0.45);
        JOptionPane.showMessageDialog(null,"Your ordered " + number_eggs+ " eggs." + " Thats " + number_dozens + " dozens at $3.25 a dozen and "+ number_loose + " at 45 cents each for a total of $" + cost);
            }
}
