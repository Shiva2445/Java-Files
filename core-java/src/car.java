public class car {
private String model;
private String[] features;

public car(String model, String... features) {
	this.model = model;
	this.features = features;
}
public void specs() {
	System.out.println("Features of "+model);
	for(String f:features)
		System.out.println("-"+f);
}
public static void main(String[] args) {
	//String []arg={"keyless","electric"};

	car alto=new car("Suzuki","keyless","electric");
	car kia=new car("KIA","keyless","electric");

	alto.specs();
	kia.specs();
}

}
