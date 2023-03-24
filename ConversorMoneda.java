package ConversorDeMoneda;

import javax.swing.JOptionPane;

public class ConversorMoneda {

    public static void main(String[] args) {
    	double tasaDolar = 19.85;
        double tasaEuro = 22.67;
        double tasaLibra = 27.80;
        double tasaYen = 0.18;
        double tasaWon = 0.017;
        
        String[] opciones = {"Peso Mexicano", "Dólar", "Euro", "Libra Esterlina", "Yen Japonés", "Won sul-coreano"};
        String monedaOrigen = (String) JOptionPane.showInputDialog(null, "Selecciona la moneda de origen", "Conversor de Moneda", 
        		JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
        String monedaDestino = (String) JOptionPane.showInputDialog(null, "Selecciona la moneda de destino", "Conversor de Moneda", 
        		JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
        
        double cantidad = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce la cantidad a convertir:", "Conversor de Moneda", 
        		JOptionPane.PLAIN_MESSAGE));

        double cantidadMXN = 0;
        switch(monedaOrigen) {
            case "Peso Mexicano":
                cantidadMXN = cantidad;
                break;
            case "Dólar":
                cantidadMXN = cantidad * tasaDolar;
                break;
            case "Euro":
                cantidadMXN = cantidad * tasaEuro;
                break;
            case "Libra Esterlina":
                cantidadMXN = cantidad * tasaLibra;
                break;
            case "Yen Japonés":
                cantidadMXN = cantidad * tasaYen;
                break;
            case "Won sul-coreano":
                cantidadMXN = cantidad * tasaWon;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error: Moneda de origen no válida", "Conversor de Moneda", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
        }
        
        double cantidadDestino = 0;
        switch(monedaDestino) {
            case "Peso Mexicano":
                cantidadDestino = cantidadMXN;
                break;
            case "Dólar":
                cantidadDestino = cantidadMXN / tasaDolar;
                break;
            case "Euro":
                cantidadDestino = cantidadMXN / tasaEuro;
                break;
            case "Libra Esterlina":
                cantidadDestino = cantidadMXN / tasaLibra;
                break;
            case "Yen Japonés":
                cantidadDestino = cantidadMXN / tasaYen;
                break;
            case "Won sul-coreano":
                cantidadDestino = cantidadMXN / tasaWon;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error: Moneda de destino no válida", "Conversor de Moneda", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
        }
        
        String mensaje = String.format("%.2f %s = %.2f %s", cantidad, monedaOrigen, cantidadDestino, monedaDestino);
        JOptionPane.showMessageDialog(null, mensaje, "Conversor de Moneda", JOptionPane.PLAIN_MESSAGE);
    }
}
