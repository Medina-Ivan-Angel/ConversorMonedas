package conversormonedas;

import javax.swing.*;

/**
 *
 * @author Imed
 */
public class Gui {

    private static boolean flag = true;  //Controla el ciclo while
    static String resultado;             //Resultado final de las conversiones

    public static void main(String[] args) {

        //Mensaje de bienvenida
        JOptionPane.showMessageDialog(null, "Bienvenido al Conversor de Monedas Medina");

        while (flag) {
            //Seleccion Monto
            double monto = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el monto a convertir:", 0));

            //Seleccion de conversion
            Object[] possibilities = {"Peso a Dolar",
                "Peso a Euros",
                "Peso a Libras Esterlinas",
                "Peso a Yen Japones",
                "Peso a Won sul Coreano",
                "Dolar a Peso",
                "Euro a Peso",
                "Libra Esterlina a Peso",
                "Yen Japones a Peso",
                "Won Sul Coreano a Peso",};

            String selection = (String) JOptionPane.showInputDialog(
                    null,
                    "Seleccione el tipo de conversion: ",
                    "Tipo de Conversion",
                    JOptionPane.PLAIN_MESSAGE,
                    null,//Icono
                    possibilities,//opciones
                    "Peso a Dolar");

            //Convertir y mostrar resultados
            Conversor conversor = new Conversor();

            switch (selection) {

                case "Peso a Dolar":
                    resultado = conversor.convertirPesosA(monto, conversor.getDolar());
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado + " dolares.");
                    break;
                case "Peso a Euros":
                    resultado = conversor.convertirPesosA(monto, conversor.getEuro());
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado + " euros.");
                    break;
                case "Peso a Libras Esterlinas":
                    resultado = conversor.convertirPesosA(monto, conversor.getLibraEsterlina());
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado + " libras esterlinas.");
                    break;
                case "Peso a Yen Japones":
                    resultado = conversor.convertirPesosA(monto, conversor.getYen());
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado + " yenes.");
                    break;
                case "Peso a Won sul Coreano":
                    resultado = conversor.convertirPesosA(monto, conversor.getWonSul());
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado + " won sul.");
                    break;
                case "Dolar a Peso":
                    resultado = conversor.convertirAPesos(monto, conversor.getDolar());
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado + " pesos.");
                    break;
                case "Euro a Peso":
                    resultado = conversor.convertirAPesos(monto, conversor.getEuro());
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado + " pesos.");
                    break;
                case "Libra Esterlina a Peso":
                    resultado = conversor.convertirAPesos(monto, conversor.getLibraEsterlina());
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado + " pesos.");
                    break;
                case "Yen Japones a Peso":
                    resultado = conversor.convertirAPesos(monto, conversor.getYen());
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado + " pesos.");
                    break;
                case "Won Sul Coreano a Peso":
                    resultado = conversor.convertirAPesos(monto, conversor.getWonSul());
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado + " pesos.");
                    break;
            }//end_switch

            int opcionFinal = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversion?");

            //Continuar o Salir
            if (opcionFinal == 1 || opcionFinal == 2) {
                flag = false;
            }

        }//end_while

        JOptionPane.showMessageDialog(null, "¡Gracias por utilizar el conversor de monedas Medina!");

    }//end_main

}
