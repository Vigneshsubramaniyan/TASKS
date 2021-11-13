package StepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before(order = 1)
	public void sample() {
		System.out.println("Thillai arasu");
	}

	@After(order = 1)
	public void sample1() {
		System.out.println("After scenario");
	}

	@Before(order = 2)
	public void sample2() {
		System.out.println("Greens technology");
	}

	@After(order = 2)
	public void sample3() {
		System.out.println("After scenario3");
	}

	@Before(order = 3)
	public void sample4() {
		System.out.println("Chennai Omr");
	}

	@After(order = 3)
	public void sample5() {
		System.out.println("After scenario5");
	}

}
