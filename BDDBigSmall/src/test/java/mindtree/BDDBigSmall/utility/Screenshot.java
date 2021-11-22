package mindtree.BDDBigSmall.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Screenshot extends BaseClass {

	public static String getScreenshotPath(String result) throws IOException {

		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "\\Screenshots\\" + System.currentTimeMillis() + result + ".png";

		FileUtils.copyFile(src, new File(path));
		return path;
	}

}
