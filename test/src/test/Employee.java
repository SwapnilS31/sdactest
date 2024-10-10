package test;

 class Emp {
   String name;
   int id;
   int salary;
   String add;
   Emp(String name,int id ,int salary,String add){
	   this.name=name;
	   this.id=id;
	   this.salary= salary;
	   this.add=add;
	   
   }
   public void getInfo(){
	   System.out.println("name is "+ name);
	   System.out.println("id is"+ id);
	   System.out.println("salary is " +salary );
	   System.out.println("add is "+ add);
   }
@Override
public String toString() {
	return "emp [name=" + name + ", id=" + id + ", salary=" + salary + ", add=" + add + "]";
}
 
}
public class Employee{
	public static void main(String[] args) {
		Emp ob= new Emp("swapi", 03,100,"mumbai");
		ob.getInfo();
		System.out.println(ob);
		
	}
}