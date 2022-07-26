package collectionAPI;

import java.util.Locale;
import java.util.ResourceBundle;

public class localdemo {

	public static void main(String[] args) {
		//ResourceBundle b=ResourceBundle.getBundle("mgs");
		Locale h=new Locale(" en");
				ResourceBundle b=ResourceBundle.getBundle("mgs",h);

		System.out.println(b.getString("greeting"));
	}

}
