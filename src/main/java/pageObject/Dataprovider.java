package pageObject;

import org.testng.annotations.DataProvider;

public class Dataprovider {

	@DataProvider(name = "dataLogin")
	public Object[][] getData() {
		Object[][] data = new Object[1][2];
		data[0][0] = "dsfgdf";
		data[0][1] = "dfgdg";

		//data[1][0] = "restricted";
		//data[1][1] = "fghf454";
		//data[1][2] = "fsfs@gmail.com";
		return data;
	}
}
