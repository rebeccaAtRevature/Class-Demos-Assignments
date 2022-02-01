package interfacesandabstractclasses;

public class AnimalDemo {

	public static void main(String[] args) {
		Cat iggy = new Cat();
		
		iggy.breathe();
		iggy.mobility();
		
		Snake henry = new Snake();
		
		henry.breathe();
		henry.mobility();
		henry.sound();

	}

}
