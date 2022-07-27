
import com.ibm.shop.product;
import com.ibm.shop.shopException;
import com.ibm.shop.shoppingCart;

public class testShopping {

	public static void main(String[] args) {
		shoppingCart sc=new shoppingCart();
		try {
			sc.addToCart(new product("watch", 10000));
			sc.addToCart(new product("TV1", 51000));

		}
		
		catch(shopException e){
			e.printStackTrace();
		//sc.addToCart(new product("watch", 10000));
		//sc.addToCart(new product("TV", 50000));
		//sc.addToCart(new product("TV1", 51000));
		//sc.checkout();
		
		}}}
