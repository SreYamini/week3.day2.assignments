package week3.day2.assignments;

public class College extends University{

	@Override
	public void ug() {
		
		System.out.println("The abstract class University is ug");
		
	}
	
	public static void main(String[] args) {
		
		College col = new College();
		
		col.ug();
		pg();

	}

}
