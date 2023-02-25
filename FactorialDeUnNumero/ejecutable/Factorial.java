package FactorialDeUnNumero.ejecutable;
import javax.swing.JOptionPane;

public class Factorial

{
    public static void main(String[] args)
    {
        int n;
        int factorial;
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Numero para calcular su factorial: "));
        factorial=1;

        for(int i=1;n>=i;i++)
        {
            factorial=factorial*i;
        }
        //salida
        JOptionPane.showMessageDialog(null,"El factorial de "+ n +" es = " +factorial);


    }
}