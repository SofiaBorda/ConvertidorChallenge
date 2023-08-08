package convertidorChallenge2Interfaz;

import javax.swing.JOptionPane;

import conversores.ConversorMoneda;
import conversores.ConversorTemperatura;
import conversores.ConversorUnidades;

public class CuadroTexto {

	    public static void mostrarCuadroDialogo() {
	        String[] opciones = {"Conversor de moneda", "Conversor de temperatura", "Conversor de unidades"};

	        String opcionSeleccionada = (String) JOptionPane.showInputDialog(null,"Selecciona una opción:",
	                "Challenge ALURA", JOptionPane.PLAIN_MESSAGE, null,
	                opciones,opciones[0]);

	        if (opcionSeleccionada != null) {
	            System.out.println("Opción seleccionada: " + opcionSeleccionada);

	            if (opcionSeleccionada.equals("Conversor de moneda")) {
	                ConversorMoneda.mostrarConversorMoneda();
	            } else if (opcionSeleccionada.equals("Conversor de temperatura")) {
	                ConversorTemperatura.mostrarConversorTemperatura();
	            } else if (opcionSeleccionada.equals("Conversor de unidades")) {
	            	ConversorUnidades.mostrarConversorUnidades();
	            } else if (opcionSeleccionada.equals("Cancel")) {
	            	ConversorUnidades.mostrarConversorUnidades();
	            }
	       
	        } else {
	        	JOptionPane.showMessageDialog(null, "Programa Finalizado.");
	        }
	    }  
	    
	    public static void salida() {
			int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas continuar?", "Select an Option", JOptionPane.YES_NO_CANCEL_OPTION);
			switch(respuesta){
				case JOptionPane.YES_OPTION:
					mostrarCuadroDialogo();
					break;
				case JOptionPane.NO_OPTION:
					finalizado();
					break;
				case JOptionPane.CANCEL_OPTION:
					finalizado();
			}
		}
	    
	    public static void finalizado() {
	    	JOptionPane.showMessageDialog(null, "Programa Finalizado.");
	    }
}
