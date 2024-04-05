import javax.swing.*;
/**
 * Clase en la que se instancian los métodos de las operaciones
 */
public class Calculadora {

    /**
     * atributos final que asocian un numero int a una operacion deseada
     */
    final static int SUMA=1;
    final static int RESTA=2;
    final static int MULTIPLICACION=3;
    final static int DIVISION=4;
    final static int RAIZ=5;
    /**
     *
     * @param num1 Primer numero con el que se va a realizar la operación
     * @param num2 Segundo número para la operación
     * @param op  operacion que se va a realizar dependiendo del numero que se meta
     * @return el resultado de la operacion o null en caso de error
     */
    public static Float calculadora(float num1,float num2,Integer op) {
        Float resultado = 0.0f;
        switch (op) {
            case SUMA:
                resultado = num1 + num2;
                break;
            case RESTA:
                resultado = num1 - num2;
                break;
            case MULTIPLICACION:
                resultado = num1 * num2;
                break;
            case DIVISION:
                try {
                    resultado = num1 / num2;
                }catch (ArithmeticException e){
                    JOptionPane.showMessageDialog(null,"No se puede dividir por cero");
                }finally{
                    break;
                }

                /**
                 *
                 */

            case RAIZ:
                resultado=(float)Math.pow(num1,1/num2);
                break;


            /*case RAIZ:
                if(num2==2){
                    resultado=(float)Math.sqrt(num1);
                } else if (num2==3) {
                    resultado=(float)Math.cbrt(num2);
                }else
                    return null;
                break;
            */
            default:
                resultado=null;
        }
        return resultado;
    }
}
