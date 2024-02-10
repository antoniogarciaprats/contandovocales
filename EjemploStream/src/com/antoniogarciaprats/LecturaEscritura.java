package com.antoniogarciaprats;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class LecturaEscritura {
	
	public void escribirfichero ( File f ) {
		
		try {
			
			FileWriter writer = new FileWriter( f );
			
			for ( int i=0; i<100; i++)
				writer.write(generarletra());
			
			writer.close();
			
		} catch ( IOException e ) {
			System.out.println ("Algo ha ido mal al escribir en el fichero");
		}
		
	}
	
	public void contarvocales ( File f ) {
		
		try {
			
			int vocales = 0;
			FileReader reader = new FileReader ( f );
			int c = reader.read();
			
			while ( c != -1 ) {
				char ch = (char) c;
				if ( ch == 'a' || ch == 'e'  || ch == 'i' || ch == 'o' || ch == 'u' )
					vocales++;
				
				c = reader.read();
			}
			
			reader.close();
			System.out.println ("Número de vocales encontradas: " + vocales );
			
			
		} catch ( IOException e ) {
			System.out.println ("Algo ha ido mal al escribir en el fichero");
		}
		
	}
	
	private char generarletra () {
		
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
		
	}

}
