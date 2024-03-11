import com.dam2024.calculadora.Calculadora;
import com.dam2024.librerias.Salida;
import javax.swing.*;

public class Main {
    /**
     * metodo main en el que se pide por consola los numeros de la operacion y que tipo de operacion se va a realizar y lo muestra
     * @param args
     */
    public static void main(String[] args) {
    Float retorno=Calculadora.calculadora(Float.parseFloat(JOptionPane.showInputDialog("Introduzca el primer número")),Float.parseFloat(JOptionPane.showInputDialog("Introduzca el segundo número")),Calculadora.RAIZ);
    if(retorno==null)
        Salida.salidaOpt("Hay un problema en la operación",Salida.VENTANA);
    else
        JOptionPane.showMessageDialog(null,"El resultado es: "+retorno);
    }
}