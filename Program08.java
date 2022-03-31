
class Singleton {

	private static Singleton single_instance = null;
	public String s;

	private Singleton() {
		s = "Hello I am a string part of Singleton class";
	}

	public static Singleton getInstance() {
		if (single_instance == null)
			single_instance = new Singleton();

		return single_instance;
	}
}


class Program08 {
  
	public static void main(String args[]) {

		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();

		if (x == y && y == z)
			System.out.println("Three objects point to the same memory location on the heap");
		else 
			System.out.println("Three objects DO NOT point to the same memory location on the heap"); 
		
	}
}
