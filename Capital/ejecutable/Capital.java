package Capital.ejecutable;


import javax.swing.JOptionPane;
public class Capital 
 {
    public static void main(String[] args) 
    {
        // Declaración de variables
        int meses;
        double c1, c2, c3;
        meses=0;
        // Entrada
        c1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el capital del socio 1: "));
        c2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el capital del socio 2: "));
        c3 = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la inversion: "));

        while(c1 + c2 < c3)
        {
            meses = meses + 1;
            c1 = c1 * 1.03;
            c2 = c2 * 1.04;
            
        }
        JOptionPane.showMessageDialog(null,"MESES DE ESPERA : " +meses);
    }
}