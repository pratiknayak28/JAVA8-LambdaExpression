package lambdaExpression.demos;

import java.util.function.Function;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// function chaining concept 
		
		// This is achieved using andThen() and compose() function 
		
		// EX- combining predicate and function  
		
		Function<Integer,Integer> fn = i -> (i*2) ; 
		
		Function<Integer,Integer> fn2 = i -> (i*3);
		
		System.out.println(fn.andThen(fn2).apply(4));
		// In case of andThen fn will be executed first and then fn2 will be executed using the value returned by fn
		
		System.out.println(fn.compose(fn2).apply(4));
		
		//In case of compose fn2 will be executed first and then fn will be executed using the value returned by fn2
		
	
		
		

	}

}
