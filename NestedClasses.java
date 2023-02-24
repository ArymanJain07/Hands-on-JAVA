package aryman;
class Outer{ 
	
	
	public void outer_method() {
		int a = 95;
		class Inner {
			public void inner_class() {
				System.out.println("inner class"+a);
			}
			
		}	
		
		Inner in =  new Inner();
		in.inner_class();
		
		
	}
	
}

public class NestedClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer out =new Outer();
		
		out.outer_method();
		
	}

}
