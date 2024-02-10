package com.antoniogarciaprats;

import java.io.File;

public class EjemploStream {

	public static void main(String[] args) {
		
		LecturaEscritura app = new LecturaEscritura();
		File fichero = new File ( "c:\\users\\anton\\Documents\\vocales.txt" );
		app.escribirfichero ( fichero );
		app.contarvocales( fichero );

	}

}
