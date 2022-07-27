import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class personReflection {
	public static void main(String[] args) throws Exception{
		//person p=new person("john",20);
		//Class c=p.getClass();
		Class c=Class.forName("person");
System.out.println(c.getName());

System.out.println("------------------------");

Constructor[] cons=c.getConstructors();
for(Constructor z:cons) {
System.out.println(z);}

System.out.println("------------------------");

Method methods[]=c.getMethods();
for(Method m:methods) {
System.out.println(m);}

System.out.println("------------------------");

Method personmethods[]=c.getDeclaredMethods();
for(Method personm:personmethods) {
System.out.println(personm);}

System.out.println("------------------------");

Field f[]=c.getDeclaredFields();
for(Field fields:f) {
System.out.println(fields);}
}

}
