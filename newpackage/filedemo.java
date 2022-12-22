package newpackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class filedemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String fr = "C:\\Users\\Visha\\OneDrive\\Documents\\rent.txt";
		BufferedReader bfr = new BufferedReader(new FileReader(fr));
		String Contents;
		while((Contents = bfr.readLine()) != null) {

		    System.out.println(Contents);
		   }
	}

}
