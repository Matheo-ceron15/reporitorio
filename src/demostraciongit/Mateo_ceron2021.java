package Ejemplos_semana1;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class AreaDeUnCirculo {
    public static void main(String[] args) {
        NumberFormat formato = new DecimalFormat("#0.00");
        //declaracion de variables
        double area, radio;
        final double pi = 3.1416;
        //inicializacion de variables
        area = 145;
        //uso de variables
        radio = Math.sqrt(area/pi);
        System.out.println("El Radio es igual a: " + formato.format(radio) + "cm");
    }
}