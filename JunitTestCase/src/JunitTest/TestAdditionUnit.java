package JunitTest;
import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.model.TestTimedOutException;

public class TestAdditionUnit {

	@Test(timeout=5000, expected=TestTimedOutException.class)
	//@Test(timeout=1000)
	public void testadd() throws Exception {
		Thread.sleep(3000);
		AdditionTest a = new AdditionTest();
		int add = a.additionTest();
		
		assertEquals(5,add);
	}

    @Ignore("already tested")//To skip execution
	@Test
	public void demo() {
		System.out.println("Demo test");
	}
	
	@Test
	public void testsub() {
		SubTest s = new SubTest();
		int sub = s.subractionTest();
		
		assertEquals(5,sub);
	}
}
