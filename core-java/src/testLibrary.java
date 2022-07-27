import com.ibm.bank.balException;
import com.ibm.lib.Book;
import com.ibm.lib.LibException;
import com.ibm.lib.member;

public class testLibrary {

	public static void main(String[] args) {
		Book b1=new Book("abc ");
		member m1=new member("shiva ");
		//b1.status();
		//m1.status();
		try {
			b1.issued(m1);		}
		catch(LibException e)
		{
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());

		}
		//b1.issued(m1);
		//b1.status();
		//m1.status();
		

		//b1.returned(m1);
		//b1.status();
		//m1.status();
		}
	}


