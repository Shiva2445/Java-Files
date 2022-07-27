import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class AssertFunctions {
@Test
public void Shiva() {
	String s1="shiva";
	String s2="shiva";
	assertEquals(s1,s2);
	assertSame(s1,s2);
	assertNotNull(s1);
	//assertNull(s1);

int a=10;
int b=20;
//assertTrue(a>b);
assertFalse(a>b);
	
	}

}
