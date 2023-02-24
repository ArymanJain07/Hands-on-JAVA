package aryman.inheritance;
class Xiaomi{
	public void company() {
		System.out.println("heyyy this is Xiaomi company");
		
	}
}
class MiPhones extends Xiaomi{
	public void mobile_phone() {
		System.out.println("xiaomi company's phones MI");
		
	}
}
class MiTV extends Xiaomi{
	public void mi_TV() {
		System.out.println("xiaomi comapny tv");
	}
}
class MiBands extends Xiaomi{
	public void wrist_bands() {
		System.out.println("mi company wrist bands");
		
	}
}
public class HierarchicalINheritance {

	public static void main(String[] args) {
		MiPhones m =new MiPhones();
		m.company();
		m.mobile_phone();
		MiTV n =new MiTV();
		n.company();
		n.mi_TV();
		MiBands b =new MiBands();
		b.wrist_bands();
		b.company();

	}

}
