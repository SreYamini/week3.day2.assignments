package week3.day2.assignments;

public class Desktop implements Hardware,Software {
	
	public void desktopModels() {
		
		System.out.println("The Desktop is desktopModels");

	}

	public void softwareResources() {
		
		System.out.println("The Interface is softwareResources");
		
	}

	public void hardwareResources() {
		
		System.out.println("The Interface is hardwareResources");
		
	}
	
	public static void main(String[] args) {
		
		Desktop desk = new Desktop();
		
		desk.desktopModels();
		desk.hardwareResources();
		desk.softwareResources();

	}

}
