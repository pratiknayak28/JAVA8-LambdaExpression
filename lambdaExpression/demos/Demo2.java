package lambdaExpression.demos;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
	String ename ; 
	int salary;
	int exp ;
	public Employee(String ename, int salary, int exp) {
		super();
		this.ename = ename;
		this.salary = salary;
		this.exp = exp;
	} 
	
	
}

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//complex predicate examples
		
		Employee emp = new Employee("Jon",20000,3) ;
		Employee emp2 = new Employee("Pratik",50000,5) ;
		Employee emp3 = new Employee("Pant",35000,7) ;
		
		//emp - > return name of employee if salary > 50k and exp >= 3 years
		
		Predicate<Employee> pr = a->(a.salary>30000 && a.exp>=3);
		
		if(pr.test(emp)) {
			System.out.println(emp.ename);
		}
		if(pr.test(emp2)) {
			System.out.println(emp2.ename);
		}
		if(pr.test(emp3)) {
			System.out.println(emp3.ename);
		}
		
		
		ArrayList<Employee> al = new ArrayList<Employee>() ; 
		al.add(new Employee("David",40000,1));
		al.add(new Employee("Scott",20000,5));
		al.add(new Employee("Rahul",60000,3));
		
		for(Employee i:al) {
			if(pr.test(i)) {
				System.out.println(i.ename);
			}
		}
	}

}
