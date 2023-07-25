
package conversormonedas;

import java.text.DecimalFormat;

/**
 *
 * @author Imed
 */
public class Conversor {
    
    //Atributos
    private final double dolar          = 271.04;
    private final double euro           = 292.98;
    private final double libraEsterlina = 347.90;
    private final double yen            = 1.92;
    private final double wonSul         = 0.21;
    
    DecimalFormat formato = new DecimalFormat("#.##"); //Vamos a limitar a dos decimales la salida de las conversiones
    
    //Metodos 
    public String convertirAPesos(double monto, double moneda){
        return formato.format(monto * moneda);
    }
    
    public String convertirPesosA(double monto, double moneda){
        
        return formato.format(monto / moneda);
        
    }
    
    
    //Getters and Setters
    public double getDolar() {
        return dolar;
    }

    public double getEuro() {
        return euro;
    }

    public double getLibraEsterlina() {
        return libraEsterlina;
    }

    public double getYen() {
        return yen;
    }

    public double getWonSul() {
        return wonSul;
    }
}
