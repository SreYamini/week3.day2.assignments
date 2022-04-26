package week3.day2.assignments;

public class Students {

	public void getStudentInfo(int id) {
	
		System.out.println("The id is "+id);

	}
	
	public void getStudentInfo(int id, String name) {
		
		System.out.println("The id is "+id);
		
		System.out.println("The name is "+name);

	}
	
	public void getStudentInfo(String email,long phonenumber) {
		
		System.out.println("The email is "+email);
		
		System.out.println("The phonenumber is "+phonenumber);

	}
	public static void main(String[] args) {
		
		Students stu = new Students();
		
		stu.getStudentInfo(1);
		stu.getStudentInfo(1, "Sre Yamini");
		stu.getStudentInfo("abc@gmail.com",9876543210l);

	}

}
