package ex2;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStock {
	@Test
	public void teststock() {
		ApplicationContext appctx = new ClassPathXmlApplicationContext("ex2ctx.xml");
		Stock s1 = (Stock) appctx.getBean("stk");
		Stock s2 = appctx.getBean(Stock.class);
		System.out.println(s1 == s2);
	}
}