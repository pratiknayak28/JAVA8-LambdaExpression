package lambdaExpression.demos;

import java.util.function.Predicate;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// learning the usage of predicate 
		
		// lambda expression example 1
		
		Predicate<Integer> p  =i ->  (i > 10);
		
		// invoke the lambda expression 
		// predicate functional interface contains test function 
		
		System.out.println(p.test(20));
		System.out.println(p.test(10));
		System.out.println(p.test(5));
		
		
		//check the length of given string to be > than 4 , example 2
		
		Predicate<String> t = i -> (i.length()>4) ; 
		
		System.out.println(t.test("Pratik"));  
		System.out.println(t.test("Neha"));  
		
		
		// invoking the lambda expression for array 
		// Print array elements whose size is > 4 
		
		String name[] = {"Neha","Pratik","Gudlu","romys","nikki"} ; 
		
		for(String i:name) {
			if(t.test(i)) {
				System.out.println(i);
			}
		}

	}

}
