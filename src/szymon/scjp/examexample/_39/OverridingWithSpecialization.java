package szymon.scjp.examexample._39;

class Animal { Animal getOne(){ return new Animal(); } }

class Dog extends Animal {
	Dog getOne() {return new Dog(); } 
	//Animal getOne() {return new Dog();}
}

public class OverridingWithSpecialization {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Animal [] animal = { new Animal(), new Dog()  };
		for (Animal a : animal) {
			Animal x = a.getOne();
		}

	}

}
