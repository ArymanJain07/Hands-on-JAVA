package aryman;
interface First{
	public void first_Interface_print ();
	
}
interface Second{
	public void Second_interface_print();
	
}

public class Class_Imp_Two_Inter implements First , Second {
	public void first_Interface_print() {
		System.out.println("first interface");
		
	}
	public void Second_interface_print() {
		System.out.println("second interface");
		
	}
	public static void main(String args[]) {
		Class_Imp_Two_Inter x =new Class_Imp_Two_Inter();
		x.first_Interface_print();
		x.Second_interface_print();
	}

}
