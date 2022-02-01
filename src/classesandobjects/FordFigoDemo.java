package classesandobjects;

public class FordFigoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//derived type
		FordFigo fordFigo; // here, no object is created
		fordFigo = new FordFigo(); // object is created
		
		fordFigo.modelNo = 123456;
		fordFigo.color = "black";
		fordFigo.carType = "hatch back";
		
		System.out.println(fordFigo.unlockCar());
		System.out.println(fordFigo.startEngine());
		System.out.println(fordFigo.accelerate());
		System.out.println(fordFigo.applyBreaks());
		System.out.println(fordFigo.stopEngine());
		System.out.println(fordFigo.lockCar());
		
		
		System.out.println(fordFigo.unlockCar());
		System.out.println(fordFigo.startEngine());
		System.out.println(fordFigo.accelerate());
		System.out.println(fordFigo.applyBreaks());
		System.out.println(fordFigo.stopEngine());
		System.out.println(fordFigo.lockCar());
	}

}
