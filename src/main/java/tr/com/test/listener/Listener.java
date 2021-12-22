package tr.com.test.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import tr.com.test.helper.Utility;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Listener implements ITestListener {

//    @Override
//    public void onTestFailure(ITestResult result) {
//
//        String filePath = "test-output"+"\\"+ Utility.getCurrentTimeOfSystem()+"_Screenshots.jpeg";
//        BufferedImage screencapture = null;
//        try {
//            screencapture = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
//            File file = new File(filePath);
//            file.getParentFile().mkdirs();
//            file.createNewFile();
//            ImageIO.write(screencapture, "jpg", file);
//        } catch (AWTException | IOException e) {
//            e.printStackTrace();
//        }
//    }


}
