package week3.day2.assignments;

public class Automation extends MultipleLangauge implements Language,TestTool{

	

	public void ruby() {
		
		System.out.println("The abstract class MultipleLangauge is ruby");
	}
	
	

	public void Selenium() {
		
		System.out.println("The interface TestTool is Selenium");
		
	}

	public void Java() {
		
		System.out.println("The interface Language is Java");
		
	}
	
public static void main(String[] args) {
		
		Automation auto = new Automation();
		
		auto.ruby();
		auto.python();
		auto.Java();
		auto.Selenium();
		

	}

}
