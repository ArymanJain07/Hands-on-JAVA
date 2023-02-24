package aryman;



class In1{
	interface In2{
		public void hell();
	}
	
	
}
class Hii implements In1.In2{
	public void hell() {
		System.out.println("heelloo there!!!");
		
	}

}

class Interfaces {
	
	public static void main(String[] args) {
		Hii a = new Hii();
		a.hell();
		// TODO Auto-generated method stub

	}

}
