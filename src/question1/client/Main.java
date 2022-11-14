package question1.client;

import question1.services.FloorConstructor;

public class Main {
	public static void main(String[] args) {
		FloorConstructor skyScrapper = new FloorConstructor();
		skyScrapper.takeInput();
		if(skyScrapper.size > 0)
		{
			skyScrapper.floorsOrder();
		}
		else {
			System.out.println("No construction order generated as size = "+skyScrapper.size);
		}
		 
		
	}
}