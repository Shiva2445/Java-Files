import com.ibm.bank.Accountfactory;
import com.ibm.bank.Bank;
import com.ibm.bank.balException;
import com.ibm.bank.current;
import com.ibm.bank.savings;

public class testAcc {

	public static void main(String[] args) {
		Bank a= Accountfactory.opensavings("polo");
		try {
			a.withdrawl(1000);
		}catch(balException e){
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e);
			
		}
		//a.summary();
		
		//a.deposit(1000);
		//a.summary();
		
		//a.withdrawl(2500);
		//a.summary();
		//savings s=new savings();
			//s.withdrawl(10);
			
		//current c=new current("kumar");
		//c.summary();
	//	c.deposit(15000);
		//c.withdrawl(5000);
		}
	}


