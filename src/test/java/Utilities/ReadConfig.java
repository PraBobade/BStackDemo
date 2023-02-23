package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
    Properties pro;

    public ReadConfig() {
        File src = new File("./Configuration/config.properties");
        try {
            FileInputStream fis = new FileInputStream(src);
            pro = new Properties();
            pro.load(fis);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public String getUrl(){
        return pro.getProperty("baseURL");
    }
    public String getChromeDriverPath(){
        return pro.getProperty("Chrome");
    }
    public String getIEDriverPath(){
        return pro.getProperty("InternetExplorer");
    }
    public String getEdgeDriverPath(){
        return pro.getProperty("Edge");
    }
    public String getFireFoxDriverPath(){
        return pro.getProperty("FireFox");
    }
    public String GetBrowser(){
        return pro.getProperty("BrowserName");
    }
    public String Mail(){
        return pro.getProperty("mail");
    }
    public String phone(){
        return pro.getProperty("mobile");
    }
}
