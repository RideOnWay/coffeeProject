package model;

import java.util.ArrayList;

import bebidas.Escuchador;

public class Pedido {
	
	 ArrayList<Bebida> arrayBebida; 
	ArrayList<Producto> arrayProducto;
	
	

	 public Pedido(ArrayList<Bebida> b , ArrayList<Producto> s){
		arrayBebida = b; 
		arrayProducto = s;
		nOPedido++;
	}

	public ArrayList<Bebida> getBebida() {
		return arrayBebida;
	}

	public void setBebida(ArrayList<Bebida> bebida) {
		this.arrayBebida = bebida;
	}

	public ArrayList<Producto> getProducto() {
		return arrayProducto;
	}

	public void setProducto(ArrayList<Producto> snacks) {
		this.arrayProducto = snacks;
	}
	
	public void pedidoList() {
		for(Bebida bbd: arrayBebida) {
			System.out.println(bbd.getNombre());
		}
		
		for(Producto snk: arrayProducto) {
			System.out.println(snk.getName());
		}
		
		System.out.println("la cantida de articulos son " + arrayBebida.size() +" bebidas y  " 
		+ arrayProducto.size()+ " snacks. Pedido No " + nOPedido 
		+ " Precio Total: " + Escuchador.sumTotal);
	}
	
	public static int nOPedido = 100;
	
}
