package model;

public class Bebida implements Producto{

	private Vaso vaso ;
	public  nombre n;
	private int precio ;

	public Bebida(Vaso vaso , nombre n){
		this.vaso =vaso;
		this.n = n; 
		precio = n.devPrecio;
	}
	
	public enum nombre {
		CAFE(1000), CAPUCHINO(3000), AROMATICA(1000), CAMPESINO(1500),TURKO(2000), CHOCOLISTO(2500), MILO(2500), 
		LECHE(3000), MOCACHINO(4000) ;
		
		private int devPrecio;
		
		nombre(int devPrecio){
			this.devPrecio = devPrecio;
		}

		public int getDevPrecio() {
			
			return devPrecio;
		}	
		
	}

	public Vaso getVaso() {
		return vaso;
	}
	
	public void setVaso(Vaso.medida newMed) {
           this.vaso.setMed(newMed);
	}

	
	public int getPrecio() {
	
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	

	public nombre getNombre() {
		return n;
	}

	public void setNombre(nombre n) {
		this.n = n;
	}


	@Override
	public String toString() {
		return n.name();
	}
	
	@Override
	public String getName() {
		
		return n.name();
	}
	
	 

	
	

}
