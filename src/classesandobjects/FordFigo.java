package classesandobjects;

public class FordFigo {
	
	// declare a variable - instance variable
	int modelNo;
	String color;
	String carType;
	
	String unlockCar() {
		// declare a variable - local variables
		return "FordFigo unlocked";
	}
	String lockCar() {
		return "FordFigo locked";
	}
	String accelerate() {
		return "FordFigo accelerated!";
	}
	String applyBreaks() {
		manualBreakSystem();
		return "Breaks applied";
	}
	String startEngine() {
		return "Engine Started";
	}
	String stopEngine() {
		return "Engine Stopped";
	}
	void manualBreakSystem() {
		System.out.println("Manual Breaks applied");
	}
}
