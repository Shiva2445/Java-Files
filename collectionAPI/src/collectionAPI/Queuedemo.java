package collectionAPI;

import java.util.LinkedList;
import java.util.Queue;

public class Queuedemo {

	public static void main(String[] args) {
		Queue<String>q=new LinkedList<String>();
		q.offer("Shiva");//add
		q.offer("kumar");
		System.out.println(q);

       String z1= q.peek();//fetch
		System.out.println(z1);

		q.poll();//remove
		System.out.println(q);

	       String z2= q.peek();//fetch
			System.out.println(z2);
	}

}
