package aryman.inheritance;
class Apple1 extends SmartPhone{
	public void iphone() {
		System.out.println("heiii i m an ipone");
		
	}
}
class Nokia extends SmartPhone{
	public void nokia3310() {
		System.out.println("hii i am a nokia 3310");
		
	}
}

class SmartPhone{
	public void iphone1() {
		System.out.println("i am ihpjodkfnjk");
		
	}
	public static void main(String args[]) {
		SmartPhone phonename = new Apple1();
		phonename.iphone1();
		
		
	}
}
