package lambdaExpression.demos;

import java.util.function.Predicate;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Join 2 predicates using and , or , negate
		
		//p1-> check if number is even 
		//p2 - > check if number is >= 50 or not 
		
		int[] arr = {15,20,25,30,35,50,60,62,64,65} ;
		
		Predicate<Integer> pr1 = i->(i%2==0) ;
		
		Predicate<Integer> pr2 = j->(j>=50);
		
		for(int x:arr) {
			//pr2.test(x) && pr1.test(x) old method
			
			//and method for joining 2 predicate
			if(pr1.and(pr2).test(x)) {
				System.out.println(x);
			}
			
			System.out.println("------------------------------------------------");
			
			//or method for joining 2 predicates
			if(pr1.or(pr2).test(x)) {
				System.out.println(x);
			}
			
			System.out.println("------------------------------------------------");
			// negate method to get the opposite of the true case here it will print all the odd numbers 
			if(pr1.negate().test(x)) {
				System.out.println(x);
			}
		}
		
		

	}

}
