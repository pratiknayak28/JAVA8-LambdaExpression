package lambdaExpression.demos;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employ {
	String ename ; 
	int salary ;
	String gender ;
	
	public Employ(String ename, int salary, String gender) {
		super();
		this.ename = ename;
		this.salary = salary;
		this.gender = gender;
	}
	
}

public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employ> emp = new ArrayList<>() ; 
		emp.add(new Employ("Pratik",50000,"M")) ; 
		emp.add(new Employ("Dinesh",60000,"M")) ; 
		emp.add(new Employ("Kuki",40000,"F")) ; 
		
		Function<Employ,Integer> fn  = i->(i.salary*10)/100;
		
		Predicate <Integer> pr = j -> j >= 5000 ;
		
		Consumer <Employ> cm = k -> System.out.println(k.ename) ;
		
		
		for(Employ e:emp) {
			
			if(pr.test(fn.apply(e))) {
				cm.accept(e);
			}
		}
		
		
		

	}

}
