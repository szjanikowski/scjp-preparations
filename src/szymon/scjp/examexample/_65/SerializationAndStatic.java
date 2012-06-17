package szymon.scjp.examexample._65;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



class Traveler implements Serializable {
	static int x1 = 0;
	volatile int x2 = 0;
	transient int x3 = 0;
}

public class SerializationAndStatic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Traveler t = new Traveler();
		t.x1 = 7; t.x2 = 7; t.x3 = 7;
		
		try {
			FileOutputStream fs = new FileOutputStream("traveler.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(t); 
			os.close();
		} catch (Exception e) { e.printStackTrace(); }
		try {
			FileInputStream fis = new FileInputStream("traveler.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			t = (Traveler) ois.readObject(); 
			ois.close();
		} catch (Exception e) { 
			e.printStackTrace(); 
		}

		System.out.println(t.x1 + " " + t.x2 + " " + t.x3);
	}

}
