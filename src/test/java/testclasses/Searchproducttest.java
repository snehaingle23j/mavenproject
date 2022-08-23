package testclasses;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.testng.Assert;
import org.testng.annotations.Test;

import utility.Readdataproperties;

public class Searchproducttest extends BasicTest{
@Test(priority=2)
public void selectproduct() {
	sp.clickonproduct();
}
@Test(priority=1)
public void fetchtitle() {
sp.gettitlepage();

}
}

