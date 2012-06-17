package szymon.scjp.examexample._25;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Cat implements Serializable {
	
	private static final long serialVersionUID = 5220382946355958180L; 
	
	private int size = 100;
	public void setSize(int newSize) {
		size = newSize;
	}
	public int getSize() {
		return size;
	}
	
}

class Dog implements Serializable{
	

	private static final long serialVersionUID = 6069133434067172004L;
	
	private Collar theCollar;
	private int dogSize;
	public Dog(Collar collar, int size) {
		theCollar = collar;
		dogSize = size;
	}
	public Collar getCollar() { return theCollar; }
	public int getSize() { return dogSize; }
}

class Collar implements Serializable{

	private static final long serialVersionUID = -7993656970678955304L;
	
	private int collarSize;
	public Collar(int size) { collarSize = size; }
	public int getCollarSize() { return collarSize; }
}


public class SerializationFun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		simpleSerialization();
		moreComplexSerialization();
	}
	
	private static void moreComplexSerialization() {
		System.out.println("\nMore complex serialization: ");
		Collar c = new Collar(3);
		Dog d = new Dog(c,5);
		
		System.out.println("before: collar size is " + d.getCollar().getCollarSize());
		try {
			FileOutputStream fs = new FileOutputStream("testSer2.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(d);
			os.close();
		} catch (Exception e) { e.printStackTrace(); }
		
		d = null;
		
		try {
			FileInputStream fis = new FileInputStream("testSer2.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			d = (Dog) ois.readObject();
			ois.close();
		} catch (Exception e) { e.printStackTrace(); }
		System.out.println("after: collar size is "	+ d.getCollar().getCollarSize());
		
	}
	
	private static void simpleSerialization() {
		System.out.println("\nSimple Serialization example");
		Cat c = new Cat(); // 2
		c.setSize(200);
		System.out.println("Cat size before serialization: " + c.getSize());
		try {
			FileOutputStream fs = new FileOutputStream("testSer.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(c); // 3
			os.close();
		} catch (Exception e) { e.printStackTrace(); }
		try {
			FileInputStream fis = new FileInputStream("testSer.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			c = (Cat) ois.readObject(); // 4
			ois.close();
		} catch (Exception e) { 
			e.printStackTrace(); 
		}
		System.out.println("Cat size after serialization: " + c.getSize());	
	}
}
