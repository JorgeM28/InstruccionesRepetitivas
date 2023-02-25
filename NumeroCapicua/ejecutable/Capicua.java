package NumeroCapicua.ejecutable;
import javax.swing.JOptionPane;

public class Capicua
{

    public static void main(String[] args) 
    {
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));

        if (capicua(n)) 
        {
            JOptionPane.showMessageDialog(null, n + " es capicúa");
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, n + " no es capicúa");
        }
    }
    public static boolean capicua(int n) 
    {

        int temp = n;
        int reverse = 0;

        while (temp != 0) 
        {
            int lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;
            temp = temp / 10;
        }
        return n == reverse;
    }
}