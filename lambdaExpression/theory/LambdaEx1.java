package lambdaExpression.theory;

public class LambdaEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Lambda expression is used to bring in functional features in java and also used in code optimization (reducing the number of lines of code)
		//Lambda expression is an anonymous function 
		//It doesn't have name of method (nameless function) , doesn't have any return type , doesn't have a access modifier
		
		

	}
	public void  m1() {
		System.out.println("welcome");
	}
	/*
	 * ()-> { System.out.println("welcome"); };
	 */
	public void m2(int a , int b) {
		System.out.println(a+b);
	}
	/*
	 * (int a , int b) -> { // no need to mention the type of the variable as well [(a,b) ->] would have worked as well 
	 * System.out.println(a+b); };
	 */
	public int m3(int a) {
		return a*a ; 
	}
	/*
	 * a->{ return a*a ; }; // if one argument is there , there is no need of paranthesis
	 */

}
