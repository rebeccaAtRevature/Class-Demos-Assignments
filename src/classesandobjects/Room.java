package classesandobjects;

// I want to have a room and I should be able to calculate the floor area of the room. 
// I should also be able to calculate the cost of painting the walls of the rooms

public class Room {
	// Create instance variables and set default values
	// instance variables are variables that exist for every instance of a class
	double floorArea;
	double wallArea;
	
	double calculateWallArea(int numberOfWalls, double heightOfWalls, double widthOfWalls) {
		// Assuming rectangular walls calculate wall area
		double wallArea = numberOfWalls*heightOfWalls*widthOfWalls;
		return wallArea;
	}
	
	double calculateFloorArea(double widthOfWalls) {
		// Assuming square room with walls of equal length, calculate the floor area
		floorArea = widthOfWalls*widthOfWalls;			
		return floorArea;
	}
			
	double predictCostOfPainting(String newColor) {
		// Determine total cost of paint
		
		double unitCostOfPaint;
		
		switch (newColor) {
		case "blue","pink":
			unitCostOfPaint = 2.3;
			break;
		case "green","grey","cream":
			unitCostOfPaint = 2.0;
			break;
		case "RoseGold","maroon":
			unitCostOfPaint = 6.5;
			break;
		case "red","yellow":
			unitCostOfPaint = 2.5;
			break;
		default:
			unitCostOfPaint = 3.0;
			break;
		}
		
		double totalCostOfPaint = unitCostOfPaint*wallArea;
		
		// Send total cost to output
		return totalCostOfPaint;
	}
	
}
