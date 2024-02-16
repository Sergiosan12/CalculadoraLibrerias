import com.dam2024.librerias.Salida;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
    Float retorno=Calculadora.calculadora(Float.parseFloat(JOptionPane.showInputDialog("Introduzca el primer número")),Float.parseFloat(JOptionPane.showInputDialog("Introduzca el segundo número")),Calculadora.SUMA);
    if(retorno==null)
        Salida.salidaOpt("Hay un problema en la operación",Salida.VENTANA);
    else
        JOptionPane.showMessageDialog(null,"El resultado es: "+retorno);
    }
}