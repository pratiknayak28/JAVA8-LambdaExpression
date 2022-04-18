package lambdaExpression.demos;

import java.util.ArrayList;
import java.util.function.Function;

class Emp {
	
	String ename ;
	int salary ;
	
	public Emp(String ename, int salary) {
		super();
		this.ename = ename;
		this.salary = salary;
	} 
	
}

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Emp> arrl = new ArrayList<Emp>() ; 
		arrl.add(new Emp("Ramesh",50000)) ; 
		arrl.add(new Emp("David",30000)) ; 
		arrl.add(new Emp("John",70000)) ; 
		
		Function<Emp,Integer> fn = i -> {
			int sal = i.salary ; 
			if(sal >= 10000 && sal <= 40000) {
				return sal*10/100 ; 
			} else {
				return sal*5/100  ;
			}
		};
		
		for(Emp e : arrl) {
			System.out.println(fn.apply(e));
		}
		

	}

}
