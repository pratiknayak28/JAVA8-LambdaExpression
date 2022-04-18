package lambdaExpression.demos;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//EXAMPLE OF CONSUMER
		Consumer<String>  c = s-> System.out.println(s) ; 
		c.accept("Pratik");
		
		
		//EXAMPLE OF SUPPLIER
		Supplier<String> sp = () ->  {return "hi";} ; 
		System.out.println(sp.get());
	}

}
