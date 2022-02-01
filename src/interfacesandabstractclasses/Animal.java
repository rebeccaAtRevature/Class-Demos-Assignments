package interfacesandabstractclasses;

// if the class has atleast one abstract method the class in turn becomes abstract
// We cannot create an object of abstract class
// abstract methods are incomplete methods
// abstract classes are meant to be inherited by classes
abstract public class Animal {

	void breathe() {
		// all animals have breathing functionality
		System.out.println("Animal breathes");
	}
	
	// abstract methods don't have a body
	// abstract methods are declared and not defined here
	abstract void mobility();
	// mobility is a function expected for all animals but 
	// it does not make sense to write it until I know what animal I am working with

}
