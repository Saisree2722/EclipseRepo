package suiteDemo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({JunitTest1.class,JunitTest2.class,JunitTest3.class})
public class SuiteDemo {
	
}
