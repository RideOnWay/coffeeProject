package model;

public class Vaso {

	private medida med;
	
	public Vaso(medida med){
		this.med = med;
	}

	public enum medida{
		MINI(9),MEDIO(15),GRANDE(20);
		
		private int medida;
		
		 private medida(int m) {
			medida= m;
		}

		 int getMedida() {
			 return medida;
		 }	 
	 }	
	
	public medida getMed() {
		return med;
	}

	public void setMed(medida med) {
		this.med = med;
	}

	
	
}
