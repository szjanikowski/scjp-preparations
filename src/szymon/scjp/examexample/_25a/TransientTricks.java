package szymon.scjp.examexample._25a;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Dog implements Serializable{
	

	private static final long serialVersionUID = 6069133434067172004L;
	
	private transient Collar theCollar;
	private int dogSize;
	public Dog(Collar collar, int size) {
		theCollar = collar;
		dogSize = size;
	}
	public Collar getCollar() { return theCollar; }
	public int getSize() { return dogSize; }
	
	private void writeObject(ObjectOutputStream os) {
		// throws IOException { // 1
		try {
			os.defaultWriteObject(); // 2
			os.writeInt(theCollar.getCollarSize()); // 3
		} catch (Exception e) { e.printStackTrace(); }
	}
	
	private void readObject(ObjectInputStream is) {
		// throws IOException, ClassNotFoundException { // 4
		try {
			is.defaultReadObject(); // 5
			theCollar = new Collar(is.readInt()); // 6
		} catch (Exception e) { e.printStackTrace(); }
	}
}

class Collar{

	
	private int collarSize;
	public Collar(int size) { collarSize = size; }
	public int getCollarSize() { return collarSize; }
}


public class TransientTricks {
	
	public static void main(String[] args) {
		System.out.println("\nMore complex serialization: ");
		Collar c = new Collar(3);
		Dog d = new Dog(c,5);
		
		System.out.println("before: collar size is " + d.getCollar().getCollarSize());
		try {
			FileOutputStream fs = new FileOutputStream("testSer3.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(d);
			os.close();
		} catch (Exception e) { e.printStackTrace(); }
		
		d = null;
		
		try {
			FileInputStream fis = new FileInputStream("testSer3.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			d = (Dog) ois.readObject();
			ois.close();
		} catch (Exception e) { e.printStackTrace(); }
		System.out.println("after: collar size is "	+ d.getCollar().getCollarSize());
	}

}
