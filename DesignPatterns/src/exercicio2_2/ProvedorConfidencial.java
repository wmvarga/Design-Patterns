package exercicio2_2;

/**
 * 
 * @author 81612389 - William Morone Varga
 *
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProvedorConfidencial extends Provedor {

	@Override
	void exibir() {
		
		try{
			BufferedReader reader = new BufferedReader(new FileReader("confidencial.txt"));
			while (reader.ready()) {
				String linha;
				while ((linha = reader.readLine()) != null) {
					System.out.println(linha);
				}
			}
			reader.close();
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}

	}

}
