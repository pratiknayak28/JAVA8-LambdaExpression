package lambdaExpression.demos;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cab cab = ()->System.out.println("This is ola cab");
		cab.bookCab();
		
		// no need to implement the interface directly
		/*
		 * Cab2 cabnew = (source,dest)-> {
		 * System.out.println("The cab will travel from "+source+" to "+dest); };
		 * cabnew.bookCab("HYD","BLR");
		 */
		
		Cab2 cabnew2 = (source,dest)-> {
			return "The total cost from " +source+" to " + dest +" is 5000" ; 
		} ;
		
		String result = cabnew2.bookCab("BLR","HYD");
		System.out.println(result);
	}

}
