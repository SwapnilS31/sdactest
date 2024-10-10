package test;
class Employe{
	void getDetails(String name){
		System.out.println("this is "+ name);
	}
	void getDetails(String name,String exp){
		System.out.println("this is "+ name + "and having experience"+ exp);
		
		
	}
	
}
class Manager extends Employe{
	void getDetails(String name){
		System.out.println("this is"+ name );
	}
}

public class Main {
	public static void main(String[] args) {
		Employe emp= new Employe();
		Manager man= new Manager();
		emp.getDetails("yadav");
		emp.getDetails("rahul","developer");
		man.getDetails("manav");
	}

}
