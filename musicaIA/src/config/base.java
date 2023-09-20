package config;
import IALetra.*;
import IAMusica.*;

public class base{


	crearLetra letra = new crearLetra();
	genero musica = new genero();
	
	String pGenero;
	String pClave;
	String gen1;
	String gen2;
	String gen3;
	
	public void generarLetra(String clave) {
		pClave = clave;
		letra.generar(clave);
	}
	
	public void gInstrumental(String genero) {
		pGenero = genero;
		musica.generar(genero);
	}
	
	public void gInstrumentalMultiple(String g1, String g2, String g3) {
		gen1 = g1;
		gen2 = g2;
		gen3 = g3;
		musica.generarMulti(g1, g2, g3);
			
	}
	
}	
