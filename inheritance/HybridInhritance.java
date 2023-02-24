package aryman.inheritance;
class A{
	public void company() {
		System.out.println("heyyy this is Xiaomi company");
		
	}
}
class B extends A{
	public void mobile_phone() {
		System.out.println("xiaomi company's phones MI");
		
	}
}
class E extends B {
	
	public void iphone() {
		System.out.println("apple conmpany mobile phones");
	}
	public void macBook() {
		System.out.println("apple company tablets");
			
	}
	
}
class F extends E{
	public void display() {
		iphone();
		macBook();
	}
}
class I extends F{
	public void ipot() {
		System.out.println("apple company musoc player");
	}
	public void display() {
		ipot();
		
	}
}
class C extends A{
	public void mi_TV() {
		System.out.println("xiaomi comapny tv");
	}
}
class G extends C {
	public void hii() {
		System.out.println("hiii this is G");
	}
}
class H extends C{
	public void holla() {
		System.out.println("hii this is H");
		
	}
}
class D extends A{
	public void wrist_bands() {
		System.out.println("mi company wrist bands");
		
	}
}
public class HybridInhritance {

	public static void main(String[] args) {
		I i = new I();
		i.display();
		try {
			i.company();
		}catch(Exception e) {
			System.out.println("hii this is exception");
		}

	}

}
