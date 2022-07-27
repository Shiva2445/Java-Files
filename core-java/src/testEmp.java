import com.ibm.emp.Executives;
import com.ibm.emp.emp;
import com.ibm.emp.manager;

public class testEmp {

	public static void main(String[] args) {
		emp e1=new emp("a",1000);
		e1.payslip();
		
		emp e2=new emp("b",2000);
		e2.payslip();

		Executives e3=new Executives("Shiva",3000,4000);
		e3.payslip();
		System.out.println(e3.getsalary());
	
		manager m=new manager("Shiva",5000,6000);
		m.payslip();
		System.out.println(m.getsalary());
		//showsalary(e3);

	}//showsalary(m);

}