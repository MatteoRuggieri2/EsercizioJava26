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
		
		// Apro il nuovo file
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
		int character = 0;

        // Leggo ogni carattere del file finché non raggiunge la fine
		while (character != EOF) {
        
        	try {
				character = br.read();  // Mi restituisce il carattere in UNICODE, un numero intero, ovvero 2 byte
			} catch (IOException e) {
				e.printStackTrace();
			} 
        	
        	
        	
        	if ((char) character != LF && (char) character != CR) {
        		if(character != EOF) { System.out.print((char) character); }
			} else {
				System.out.print("\n");
			}
        
		}
        
        
        
        
        // Chiudo il BufferedReader
        try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
