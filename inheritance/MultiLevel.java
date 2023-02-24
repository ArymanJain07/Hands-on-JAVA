package aryman.inheritance;
class AA{
	public void company() {
		System.out.println("heyyy this is Xiaomi company");
	}
}
class BB extends AA{
	public void mobile_phone() {
		System.out.println("xiaomi company's phones MI");	
	}
}
class EE extends BB{
	public void iphone() {
		System.out.println("apple conmpany mobile phones");
	}
	public void macBook() {
		System.out.println("apple company tablets");
	}
}
class FF extends EE{
	public void display() {
		iphone();
		macBook();
	}
}
class II extends FF{
	public void ipot() {
		System.out.println("apple company musoc player");
	}
	public void display() {
		ipot();	
	}
}
public class MultiLevel {
	public static void main(String[] args) {
			BB c =new BB();
			c.mobile_phone();
			EE e= new EE();
			e.mobile_phone();
		}
}