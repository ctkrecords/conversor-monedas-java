package conversor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class OpcionesConversor extends JFrame implements ActionListener{
	private JComboBox<String> comboConversor;
	private JLabel label1;
	private JButton boton1, botonSalida;
	
	public OpcionesConversor(){
		setLayout(null);
		label1 = new JLabel("Por favor selecciona una opción:");
		label1.setBounds(80, 50, 250, 40);
		add(label1);
		comboConversor = new JComboBox<String>();
		comboConversor.setBounds(20, 90, 350, 40);
		setTitle("Conversor de unidades");
		add(comboConversor);
		comboConversor.addItem("1. Convertir de colón salvadoreño a Dólares");
		comboConversor.addItem("2. Convertir de colón salvadoreño a Euros");
		comboConversor.addItem("3. Convertir de colón salvadoreño a Libras Esterlinas");
		comboConversor.addItem("4. Convertir de colón salvadoreño a Yen Japónes");
		comboConversor.addItem("5. Convertir de colón salvadoreño a Won sul-coreano");
		comboConversor.addItem("6. Convertir de dólares a colón salvadoreño");
		comboConversor.addItem("7. Convertir de euros a colón salvadoreño");
		comboConversor.addItem("8. Convertir de Libras esterlinas a colón salvadoreño");
		comboConversor.addItem("9. Convertir de Yen japónes a colón salvadoreño");
		comboConversor.addItem("10. Convertir de Won a colón salvadoreño");
		boton1 = new JButton("Confirmar");
		boton1.setBounds(83, 160, 100, 30);
		add(boton1);
		botonSalida = new JButton("Salir");
		botonSalida.setBounds(215, 160, 100, 30);
		botonSalida.addActionListener((event) -> System.exit(0));
		add(botonSalida);
		boton1.addActionListener(this);
	}
	
	public String conversorDeMoneda(float d, int opc) {
		float calculoFinal = 0.00f;
		int numOpc = opc;
		String resultado = "";
		switch(numOpc){
				case 1:
					calculoFinal = d*0.11f;
					resultado = calculoFinal + " dólares";
				break;
				case 2:
					calculoFinal = d*0.11f;
					resultado = calculoFinal + " Euros";
				break;
				case 3:
					calculoFinal = d*0.095f;
					resultado = calculoFinal + " Libras esterlinas";
				break;
				case 4: 
					calculoFinal = d*15.52f;
					resultado = calculoFinal + " Yenes";
				break;
				case 5:
					calculoFinal = d*151.77f;
					resultado = calculoFinal + " Wons";
				break;
				case 6:
					calculoFinal = d*8.75f;
					resultado = calculoFinal + " Colones";
				break;
				case 7:
					calculoFinal = d*9.40f;
					resultado = calculoFinal + " Colones";
				break;
				case 8:
					calculoFinal = d*10.65f;
					resultado = calculoFinal + " Colones";
				break;
				case 9:
					calculoFinal = d*0.065f;
					resultado = calculoFinal + " Colones";
				break;
				case 10:
					calculoFinal = d*0.0067f;
					resultado = calculoFinal + " Colones";
				break;
				default:
					System.out.println("Es imposible que entre aquí");
				break;
			}
		return resultado;
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton1) {
			String opc = (String)comboConversor.getSelectedItem();
			int numOpc = Integer.parseInt(opc.substring(0, 1));
			System.out.println("");
			float dinero;
			String resultado;
			dinero = Float.parseFloat(JOptionPane.showInputDialog("Por favor ingresa la cantidad de dinero a convertir: "));
			resultado = conversorDeMoneda(dinero, numOpc);
			JOptionPane.showMessageDialog(null, "El resultado de la conversión solicitada es de: " + resultado);
		}	
	}

	public static void main(String[] args) {
		OpcionesConversor opciones = new OpcionesConversor();
		opciones.setBounds(600, 400, 400, 300);
		opciones.setVisible(true);
		opciones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}




	


}
