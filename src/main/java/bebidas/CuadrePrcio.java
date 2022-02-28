package bebidas;

import model.*;
import model.Bebida.nombre;

public class CuadrePrcio {
	


	public static Bebida cuadrePrecio(Bebida bebda) {
		
		if(bebda.getNombre() == nombre.CAFE ) {
			bebda.setPrecio(1500);
			bebda.setVaso(Vaso.medida.MEDIO);
		}else if(bebda.getNombre() == nombre.CAMPESINO ) {
			bebda.setPrecio(2000);
			bebda.setVaso(Vaso.medida.MEDIO);
		}else if(bebda.getNombre() == nombre.CHOCOLISTO ){
			bebda.setPrecio(2000);
			bebda.setVaso(Vaso.medida.MEDIO);
		}else if(bebda.getNombre() == nombre.TURKO ) {
			bebda.setPrecio(3000);
			bebda.setVaso(Vaso.medida.MEDIO);
		}else if(bebda.getNombre() == nombre.LECHE ) {
			bebda.setPrecio(2000);
			bebda.setVaso(Vaso.medida.MEDIO);
		}
		
		return bebda;
	}
	
	
	
}
