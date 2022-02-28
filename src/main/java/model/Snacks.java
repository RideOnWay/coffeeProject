package model;

public class Snacks implements Producto{
	


	private snackName  skname;
	private int precio ;
	
	public Snacks(snackName skname) {
		
		this.skname = skname;	
		precio =  skname.devprecio;
	}

	public enum snackName{
		FRUTA_SECA(3000),BOCADILLO(500), PAN_ARROZ(2200), ACHIRAZ(2500), 
		GALLETAS_COCO(2500), TORTA_AMAPOLA(2000), TORTA_AREQUIPE(2000), 
		CHICLETS(300), CALENTANOS(300), GALLETAS_UND(300);
		
		public int devprecio;
		
		snackName(int devprecio) {
			this.devprecio = devprecio;
		}

		public int getDevprecio() {
			return devprecio;
		}

		public void setDevprecio(int devprecio) {
			this.devprecio = devprecio;
		}
		
	 }


	@Override
	public String toString() {
		return skname.name();
	}
	
	public snackName getSkname() {
		return skname;
	}

	public void setSkname(snackName skname) {
		this.skname = skname;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	 
	@Override
	public String getName() {
		
		return skname.name();
	}
	
	

}
