package aryman.inheritance;
class Apple{
	public void iphone() {
		System.out.println("apple conmpany mobile phones");
	}
	public void macBook() {
		System.out.println("apple company tablets");
		
	}
}
class Iphone extends Apple{
	public void display() {
		iphone();
		macBook();
	}
}

public class SingleInheritance {
	public static void main (String[]args) {
		Iphone phone =new Iphone();
		phone.display();
	}
}
	
