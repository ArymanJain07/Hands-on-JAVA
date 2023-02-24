package aryman.inheritance;
interface one{
	public void say_Aryman();
	default void say_hmm() {
		System.out.println("hmmm");
		
	}
	
}
interface two{
	public void say_jain();
	
}
interface three extends one, two{
	public void say_great();
}
class SayMyName implements three{
	public void say_Aryman() {
		System.out.println("Aryman ");
		
	}
	public void say_jain() {
		System.out.println("jain");
		
	}
	public void say_great() {
		System.out.println("is great");
		
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		SayMyName a =new SayMyName();
		a.say_Aryman();
		a.say_jain();
		a.say_great();
		a.say_hmm();
	}

}
