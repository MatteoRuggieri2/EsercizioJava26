package esercizi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderBufferedReader {
	
	static final char CR = '\r'; // x'0D' - Carriage Return
	static final char LF = '\n'; // x'0A' - Line Feed
	static final int EOF = -1;

	public static void main(String[] args) {
		ReaderBufferedReader rbr = new ReaderBufferedReader();
		rbr.run();

	}

	private void run() {
		File file = new File("src/text_files/words.txt");
		BufferedReader br = null;
		int character = 0;
		boolean lastWasCR = false;

		try {
			
			// Apro il nuovo file
			br = new BufferedReader(new FileReader(file));
		    character = br.read(); // Mi restituisce il carattere in UNICODE, un numero intero, ovvero 2 byte
		   
		    while (character != EOF) { // Leggo ogni carattere del file finché non raggiunge la fine
		        
		    	if (character == CR) {
		            System.out.print("\n");
		            lastWasCR = true;
		        } else if (character == LF) {
		            if (!lastWasCR) System.out.print("\n");
		            lastWasCR = false;
		        } else {
		            System.out.print((char) character);
		            lastWasCR = false;
		        }
		        
		    	character = br.read();
		    }
		    
		} catch (IOException e) {
		    e.printStackTrace();
		}
        
        // Chiudo il BufferedReader
        try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
        
	}

}
