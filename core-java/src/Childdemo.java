
public class Childdemo<Z,S,P> extends demo<Z> {
	private S value;
	private P male;

	public Childdemo(Z data, S value, P male) {
		super(data);
		this.value = value;
		this.male=male;
	}

	public P getMale() {
		return male;
	}

	public void setMale(P male) {
		this.male = male;
	}

	public S getValue() {
		return value;
	}

	public void setValue(S value) {
		this.value = value;
	}
	public static void main(String[] args) {
		Childdemo <String,Integer,Boolean>d=new Childdemo("Hello",10,true);//only String values
		System.out.println(d.getData()+"\t"+d.getValue()+"\t"+d.getMale());
	}

}
