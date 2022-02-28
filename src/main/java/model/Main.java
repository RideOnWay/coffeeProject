package model;

import model.Bebida.nombre;
import model.Vaso.medida;

public class Main {

	public static void main(String[] args) {
		
		Bebida bbd = new Bebida(new Vaso(medida.MINI),nombre.CAFE);
		Bebida bbd1 = new Bebida(new Vaso(medida.MINI),nombre.MOCACHINO);
		
		bbd.getVaso().setMed(medida.MEDIO);
		System.out.println(bbd.getVaso().getMed());
		System.out.println(bbd1.getPrecio());
		
		
	}

}
