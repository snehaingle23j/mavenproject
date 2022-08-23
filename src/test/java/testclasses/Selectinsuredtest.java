package testclasses;

import org.testng.annotations.Test;

public class Selectinsuredtest extends BasicTest {

	@Test(priority=3)
	public void selectinsuredandcontinue() {
		si.selectinsured();
	}
}
