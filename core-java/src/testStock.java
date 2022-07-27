import com.ibm.stock.Broker;
import com.ibm.stock.Exchanger;
import com.ibm.stock.Holder;
import com.ibm.stock.stocksingleton;

public class testStock {
	public static void main(String[] args) {
		//Stock s=new Stock();
		Holder h=stocksingleton.getstock();
		h.view();

		System.out.println();
		Broker b=stocksingleton.getstock();
		b.view();
		b.get();

		System.out.println();
		Exchanger e=stocksingleton.getstock();
		e.view();
		e.get();
		e.set();
		
		System.out.println(h==b);
		System.out.println(b=e);

	}
	}
