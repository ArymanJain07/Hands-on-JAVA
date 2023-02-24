package aryman;
class Aryman{
	int eid ;
	int salary;
	static String ceo;
	public void show() {
		System.out.println(eid+";"+salary+";"+ceo);
		
	}
	public Aryman () {
		eid = 1;
		salary=223;
		ceo= " navya";
		
		
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		Aryman obj = new Aryman();
		
		
		
		Aryman obj2 = new Aryman();
		
	
		
		obj.show();
		obj2.show();
	}

}
