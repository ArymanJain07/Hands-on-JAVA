package aryman;

public class Garbagecollection {
	public static void main(String[] args) throws InterruptedException {
		Garbagecollection t1 = new Garbagecollection();
		Garbagecollection t2 = new Garbagecollection();
		t1=null;
		System.gc();
		
		t2=null;
		Runtime.getRuntime().gc();
	}
	
	protected void finalize() throws Throwable{
		System.out.println("Garbage");
		System.out.println("Object garbege sad"+this);
		
	}
}
