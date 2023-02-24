package aryman;
class Outter{
	private static void outtermethod() {
		System.out.println("inside outer method");
		
	}
 static class StaticNestedClass {

		public static void main(String[] args) {
			System.out.println("inside inner method");
			outtermethod();

		}
	}	
}



