// Generics Programs....
public class demo<Z>
{
private Z data;

	public demo(Z data) {
	this.data = data;
}

	public Object getData() {
		return data;
	}

	public void setData(Z data) {
		this.data = data;
	}
	public static void main(String[] args) {
		demo<String> d=new demo("hello");//only String values
		System.out.println(d.getData());
		
		demo<Integer> d1=new demo(500);//only Integer values
		System.out.println(d1.getData());
	}

}
