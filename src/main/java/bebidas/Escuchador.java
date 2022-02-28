package bebidas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import model.Bebida;

public class Escuchador implements ActionListener,ListSelectionListener{

	ArrayList<JLabel> nuevo = new ArrayList<>();
	ArrayList<Bebida> listBebida = new ArrayList<>();

	public static int sumTotal;
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object fuente = e.getSource();
		if(fuente == InterCoffe.botonTotal) {
			 sumaTotales();
		}else if(fuente == InterCoffe.botonBorrar) {
			borrarRegistro();
		}else if(fuente == InterCoffe.list){
			System.out.println("copo");
		}
	}
	
	void changeColor() {
		
		//System.out.println(InterCoffe.list.getSelectedIndex());
		InterCoffe.list.setSelectionBackground(Color.YELLOW);
		for(int i = 0; i < InterCoffe.model.size() ; i++ ) {
			
			if(InterCoffe.list.getSelectedValue()  == InterCoffe.model.elementAt(i)) {
				
				InterCoffe.list_1.setBackground(Color.WHITE);
				InterCoffe.medVaso.setBackground(Color.WHITE);
				
			}
		}
	}


	int sumarListModel() {
		int aux =InterCoffe.model2.getSize();
		int sum = 0;
		for(int i=0 ;i<aux;i++) {
		sum = sum + InterCoffe.model2.get(i);
		}
		return sum;
	}
	
	int sumarSPrecio() {
		int aux =InterCoffe.modelSPrecio.getSize();
		int sum = 0;
		for(int i=0 ;i<aux;i++) {
		sum = sum + InterCoffe.modelSPrecio.get(i);
		}
		return  sum;
	}
	
	void borrarRegistro() {
		
		System.out.println(InterCoffe.list.getSelectedIndex());
		int aux = InterCoffe.list.getSelectedIndex();
		
		if(aux >= 0 && InterCoffe.list.getSelectedValue() == InterCoffe.model.getElementAt(aux)) {
			InterCoffe.model.removeElementAt(aux);
			InterCoffe.model2.removeElementAt(aux);
			InterCoffe.model3.removeElementAt(aux);
			Ejecutor.arrBbd.remove(aux);
		}

		System.out.println(InterCoffe.listSnack.getSelectedIndex());
		int aux2 = InterCoffe.listSnack.getSelectedIndex();	
		
		if(aux2 >= 0) {
				InterCoffe.modelSnack.removeElementAt(aux2);
				InterCoffe.modelSPrecio.removeElementAt(aux2);
				Ejecutor.arrSnk.remove(aux2);
		}
		
	}
	
	
	void sumaTotales() {
		
		sumTotal = sumarListModel() + sumarSPrecio();
		InterCoffe.sumaTotal.setText("" + sumTotal);
		InterCoffe.sumaBebida.setText("" + sumarListModel());
		InterCoffe.sumaSnack.setText("" + sumarSPrecio());
	}
	
	
	
	static void hora() {
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	InterCoffe.labelHora.setText(dtf.format(LocalDateTime.now()));
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		changeColor();
		System.out.println("valueChanged");
	}
	

}
