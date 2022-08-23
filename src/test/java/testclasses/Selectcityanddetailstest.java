package testclasses;

import org.testng.annotations.Test;

public class Selectcityanddetailstest extends BasicTest {
@Test(priority=5)
public void validatecity() {
	sc.selectcity();
}
@Test(priority=6)
public void validatepersonaldetails() {
	sc.personaldetails();
}
}
