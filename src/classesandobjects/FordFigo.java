package classesandobjects;

public class FordFigo {
	
	// declare a variable - instance variable
	int modelNo;
	String color;
	String carType;
	static String modelName;
	
	static {
		modelName = "FordFigo";
	}
	
	String unlockCar() {
		// declare a variable - local variables
		return modelName + " unlocked";
	}
	String lockCar() {
		return modelName + " locked";
	}
	String accelerate() {
		return modelName + " accelerated!";
	}
	String applyBreaks() {
		manualBreakSystem();
		return modelName + " breaks applied!";
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
