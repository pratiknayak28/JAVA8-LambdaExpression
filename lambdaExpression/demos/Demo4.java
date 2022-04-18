package lambdaExpression.demos;

import java.util.function.Function;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// examples on working of function (predefined functional interface)
		
		Function <Integer,Integer> fn = i->i*i ; 
		
		// function<Type of parameter sent , return type> variable name = variable name -> operation ; 
		
		System.out.println(fn.apply(5));
		System.out.println(fn.apply(10));
		System.out.println(fn.apply(2));
		
		
		System.out.println("--------------------------------------");
		
		// Example - 2 
		// find out length of string 
		Function <String,Integer> fn2 = i->i.length() ;
		
		
		System.out.println(fn2.apply("Pratik"));
		System.out.println(fn2.apply("Romy"));
		
		
		System.out.println("--------------------------------------");
		
		

	}

}
