
public class testmusic {
	public static void main(String[] args) {
		music m=new music("DSP");
		jouner j=new jouner("ROCK");
		
		music m1=new music("Sidsriram");
		jouner j1=new jouner("Melody");
		
		System.out.println(m.getCat()+ " is catagery of "+j.getName());
		System.out.println(m1.getCat()+ " is catagery of "+j1.getName());

	}

}
