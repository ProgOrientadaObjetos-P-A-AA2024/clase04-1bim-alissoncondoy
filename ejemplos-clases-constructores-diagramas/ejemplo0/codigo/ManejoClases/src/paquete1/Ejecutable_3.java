package paquete1;

/**
 *
 * @author utpl
 */
public class Ejecutable_3 {
    public static void main(String[] args) {
        
        Computadora personal = new Computadora();
        personal.establecerTipoProcesador("Intel vPRo");
        
        System.out.printf("%s - %.2f",
            personal.obtenerTipoProcesador(), personal.obtenerMemoria());
    }
    
}
