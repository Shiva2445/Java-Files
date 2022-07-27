public class person implements Cloneable {
private String name;
private int age;
public person() {
	this("ananomuous", -1);
}
public person(String pname, int page) {
	name=pname;
	age=page;
}
public void print() {
	System.out.println("Name:"+name+ "Age:"+age);
}
	@Override
public String toString() {
	return "Name:"+name+ "Age:"+age;
}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof person) {
			person p=(person) obj;
			if(p.name.equals(this.name)&&p.age==(this.age))
				return true;
		}
		return false;
			
		}
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		person p=new person("Shiva", 23);
		System.out.println(p.hashCode());
		System.out.println(p);
		//p.print();

	
	person p2=new person("Shiva",23) ;
	System.out.println(p.equals(p2));
	person pc=(person) p.clone();
	System.out.println(pc);
	//p2.print();
	}
	
	}

