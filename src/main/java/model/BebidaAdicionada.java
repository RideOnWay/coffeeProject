package model;

public class BebidaAdicionada extends Bebida{

	 Adicion adicion;
	int precio;
	
	BebidaAdicionada(Vaso vaso, nombre n,Adicion adicion) {
		super(vaso, n);
		this.adicion = adicion;
	}
	
	enum Adicion{
		AGUARDIENTE, BAYLIS, WISKEY,BRANDY
	}


}
