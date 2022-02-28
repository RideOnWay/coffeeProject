package model;

public class AlxPorMayor implements Producto{

	

	int precio;
	xMayorName name;
	
	enum xMayorName{
		CAFE_EXCELSO, CAFE_PREMIUN, CAFE_CONSUMO, GALLETAS_X8, GALLETAS_X26, GALLETAS_X60
	}

	@Override
	public int getPrecio() {
		
		return precio;
	}

	@Override
	public void setPrecio(int precio) {
		this.precio=precio;
		
	}

	@Override
	public String getName() {
		
		return name.name();
	}

	public AlxPorMayor(int precio, xMayorName name) {
		
		this.precio = precio;
		this.name = name;
	}
}
