package conversores;

import javax.swing.JOptionPane;
import convertidorChallenge2Interfaz.CuadroTexto;

public class ConversorMoneda {
	public static void mostrarConversorMoneda() {
		String[] opciones = {"De pesos a dolar", "De dolar a pesos", "De pesos a euros","De euros a pesos"};

        String opcionSeleccionada = (String) JOptionPane.showInputDialog(null,"Elija la moneda a la que deseas convertir tu dinero:",
                "Conversor Monedas", JOptionPane.PLAIN_MESSAGE, null,
                opciones,opciones[0]);
        
        if (opcionSeleccionada != null) {
            System.out.println("Opción seleccionada: " + opcionSeleccionada);

            if (opcionSeleccionada.equals("De pesos a dolar")) {
                conversorPesosDolar();
            } else if (opcionSeleccionada.equals("De dolar a pesos")) {
            	conversorDolarPesos();
            } else if (opcionSeleccionada.equals("De pesos a euros")) {
            	conversorpesosEuros();
            } else if (opcionSeleccionada.equals("De euros a pesos")) {
            	conversorEurosPesos();
            }
        } else {
        	CuadroTexto.finalizado();
        }     
    }
	
	public static double pedirValor() {
		Double valor = null;
		String input = JOptionPane.showInputDialog(null, "Ingresa la cantidad de dinero que deseas convertir:");
		if (input != null) {
            System.out.println("Opción seleccionada: " + input);
			try {
	            valor = Double.parseDouble(input);
	        } catch (NumberFormatException e) {
	            JOptionPane.showMessageDialog(null, "Valor inválido. Ingresa un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
	            return pedirValor();
	        }
	        	
		} else {
			CuadroTexto.finalizado();
        }  
		return valor;
	}

	public static void conversorPesosDolar() {
		double valor = pedirValor();
		double valorFinal = valor / 3500;
		JOptionPane.showMessageDialog(null, valor + " pesos son  " + valorFinal + " dolares.");
		CuadroTexto.salida();
	}
	
	public static void conversorDolarPesos() {
		double valor = pedirValor();
		double valorFinal = valor * 3500;
		JOptionPane.showMessageDialog(null, valor + " dolares son " + valorFinal + " pesos.");
		CuadroTexto.salida();
	}
	
	public static void conversorpesosEuros() {
		double valor = pedirValor();
		double valorFinal = valor * 4300;
		JOptionPane.showMessageDialog(null, valor + " pesos son " + valorFinal + " euros.");
		CuadroTexto.salida();
	}
	
	public static void conversorEurosPesos() {
		double valor = pedirValor();
		double valorFinal = valor * 4300;
		JOptionPane.showMessageDialog(null, valor + " euros son " + valorFinal + " pesos.");
		CuadroTexto.salida();
	}
	
}
