package bebidas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import model.Bebida;
import model.Bebida.nombre;
import model.Pedido;
import model.Producto;
import model.Snacks;
import model.Snacks.snackName;
import model.Vaso;
import model.Vaso.medida;

public class Ejecutor implements ActionListener {

	Vector<Bebida> listBebida = new Vector<>();
	Vector<Snacks> listSnacks = new Vector<>();
	static ArrayList<Bebida>  arrBbd = new ArrayList<>();
	static ArrayList<Producto>  arrSnk = new ArrayList<>();
	Pedido pedido ;
	Vaso vaso;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object fuente = e.getSource();
		
		if (fuente == InterCoffe.botonVasoQ) {
			CuadrePrcio.cuadrePrecio(InterCoffe.list.getSelectedValue());
			actualizar();
			
		}else if (fuente == InterCoffe.botonVasoV) {
			System.out.println("vaaso grande");
		}else if(fuente == InterCoffe.comboBox) {
			itemSelectedCombo();
		}else if(fuente == InterCoffe.snackCombo) {
			seletedSnack() ;
		}else if (fuente == InterCoffe.confirmar) {
			pedido =  new Pedido(arrBbd, arrSnk); 
			pedido.pedidoList() ;
			
		} 
		
	}
	

	void actualizar() {
			
				InterCoffe.model2.removeElementAt(InterCoffe.list.getSelectedIndex());
				InterCoffe.model2.add(InterCoffe.list.getSelectedIndex(),InterCoffe.list.getSelectedValue().getPrecio());
				InterCoffe.model3.removeElementAt(InterCoffe.list.getSelectedIndex());
				InterCoffe.model3.add(InterCoffe.list.getSelectedIndex(),InterCoffe.list.getSelectedValue().getVaso().getMed());
			
	}
	
	ArrayList<Bebida> itemSelectedCombo() {
		if(!InterCoffe.comboBox.getSelectedItem().equals(null)) {
			Bebida aux = (Bebida)InterCoffe.comboBox.getSelectedItem();
			InterCoffe.model.add(0,aux);
			InterCoffe.model3.add(0,aux.getVaso().getMed());
			arrBbd.add(0,aux);
			for(Bebida.nombre g: Bebida.nombre.values()) {
				if(g.name().equals(aux.toString())) {
				        InterCoffe.model2.add(0, g.getDevPrecio());
				        
				}
			}
		}
		return arrBbd;
	}
	
	
	ArrayList<Producto> seletedSnack() {
		if(!InterCoffe.snackCombo.getSelectedItem().equals(null)) {
			InterCoffe.modelSnack.add(0, InterCoffe.snackCombo.getSelectedItem());
			arrSnk.add((Producto)InterCoffe.snackCombo.getSelectedItem());
			for(Snacks.snackName g: Snacks.snackName .values()) {
				if(g.name().equals(InterCoffe.snackCombo.getSelectedItem().toString())) {
				        InterCoffe.modelSPrecio.add(0, g.devprecio);
				}
			}
		}
		return arrSnk;
	}	
	
	Vaso vasoVeinte() {	
		return new Vaso(medida.GRANDE);	
	}
	
	Vaso vasoMedio() {
		return  new Vaso(medida.MEDIO) ;				
	}
	
	public Vaso getVaso() {
		return vaso;
	}

	void llenarVectorBebida() {
		listBebida.add(null);		
		listBebida.add(new Bebida(new Vaso(medida.MINI), nombre.CAFE));
		listBebida.add(new Bebida(new Vaso(medida.MINI), nombre.CAMPESINO));
		listBebida.add(new Bebida(new Vaso(medida.MINI), nombre.TURKO));
		listBebida.add(new Bebida(new Vaso(medida.MEDIO), nombre.CAPUCHINO));
		listBebida.add(new Bebida(new Vaso(medida.MEDIO), nombre.AROMATICA));
		listBebida.add(new Bebida(new Vaso(medida.GRANDE), nombre.MOCACHINO));
		listBebida.add(new Bebida(new Vaso(medida.GRANDE), nombre.MILO));
		listBebida.add(new Bebida(new Vaso(medida.MINI), nombre.LECHE));
		listBebida.add(new Bebida(new Vaso(medida.MEDIO), nombre.CHOCOLISTO));
		
	}
	
	void llenarVectorSnack() {
		listSnacks.add(null);
		listSnacks.add(new Snacks(snackName.ACHIRAZ));
		listSnacks.add(new Snacks(snackName.BOCADILLO));
		listSnacks.add(new Snacks(snackName.CALENTANOS));
		listSnacks.add(new Snacks(snackName.CHICLETS));
		listSnacks.add(new Snacks(snackName.FRUTA_SECA));
		listSnacks.add(new Snacks(snackName.GALLETAS_COCO));
		listSnacks.add(new Snacks(snackName.GALLETAS_UND));
		listSnacks.add(new Snacks(snackName.PAN_ARROZ));
		listSnacks.add(new Snacks(snackName.TORTA_AMAPOLA));
		listSnacks.add(new Snacks(snackName.TORTA_AREQUIPE));
	}

}
