package arrays;

import classesandobjects.Room;

public class RoomArrayDemo {

	public static void main(String[] args) {
		
		// create an array of room references
		Room[] myRooms = new Room[3]; 
		
		// make each of the references point to a room object
		myRooms[0] = new Room(); 
		myRooms[1] = new Room();
		myRooms[2] = new Room();
		myRooms[3] = new Room();
		
		// Initialize an array of room objects
		Room[] allRooms = {new Room(), new Room(), new Room(), new Room()};
	
	}

}
