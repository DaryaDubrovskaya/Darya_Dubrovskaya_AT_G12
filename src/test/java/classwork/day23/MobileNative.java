package classwork.day23;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class MobileNative {

    public static void main(String[] args) throws URISyntaxException, MalformedURLException {
        String apkPath = new File("src/test/resources/hello_app.apk").getAbsolutePath();
        UiAutomator2Options options = new UiAutomator2Options()
                .setApp(apkPath)
                .setDeviceName("Emulator")
                .setAppPackage("school.etys.mobile.hello")
                .setAppActivity("school.etys.mobile.hello.MainActivity");

        AndroidDriver driver = new AndroidDriver(new URI("http://localhost:4723").toURL(), options);

        System.out.println(driver.getBatteryInfo().getLevel());

        driver.quit();
    }
}
