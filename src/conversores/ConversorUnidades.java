package conversores;

import javax.swing.JOptionPane;

import convertidorChallenge2Interfaz.CuadroTexto;

public class ConversorUnidades {
	public static void mostrarConversorUnidades() {
		String[] opciones = {"centrimetros a metros", "metros a centimetros"}; 
		String opcionSeleccionada = (String) JOptionPane.showInputDialog(null,"Seleccione una opción:", "Conversor Unidades",JOptionPane.PLAIN_MESSAGE,
				null, opciones,opciones[0]);
		
		if (opcionSeleccionada != null) {
            System.out.println("Opción seleccionada: " + opcionSeleccionada);
		
		
            if (opcionSeleccionada.equals("centrimetros a metros")){
		        	String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad en centímetros:");		    
			        try {
			            double centimetros = Double.parseDouble(input);
			            double metros = centimetros / 100.0;
			            JOptionPane.showMessageDialog(null, centimetros + " centímetros son " + metros + " metros.");
			            CuadroTexto.salida();
			        } catch (NumberFormatException ex) {
			            JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido.");
			        }
		        }
			else if (opcionSeleccionada.equals("metros a centimetros")){
		        double metros = 0.0;
		            String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad en metros:");
		            try {
		                metros = Double.parseDouble(input);
		            } catch (NumberFormatException ex) {
		                JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido.");
		            }
		        double centimetros = metros * 100.0;
		        JOptionPane.showMessageDialog(null, metros + " metros son " + centimetros + " centímetros."); 
		        CuadroTexto.salida();
			}
		
		} else {
			CuadroTexto.finalizado();
        }
		
	}
	

}
