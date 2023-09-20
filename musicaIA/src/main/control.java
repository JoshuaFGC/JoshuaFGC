package main;

import config.base;

public class control extends base{
	
	public void letra(String clave) {
		generarLetra(clave);
	}

	public void musica(String genero) {
		gInstrumental(genero);
	}
	
	public void tresGeneros(String g1, String g2, String g3) {
		gInstrumentalMultiple(g1, g2, g3);
		
	}
	
}
