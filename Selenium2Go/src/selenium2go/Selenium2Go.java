/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selenium2go;

import javax.print.attribute.standard.Chromaticity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author truon
 */
public class Selenium2Go {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testGoogleSearchWithAKeyWord();
    }
    
    public static void testGoogleSearchWithAKeyWord() {
        //ta khai báo việc sẽ dùng WEbDriver để điều khiển trình duyệt
        //giống như khai báo chơi với SQLServer vậy
        String webDriverPath = "chromedriver.exe"; //D:\\...\\chromedriver.exe
        //Nói với máy ảo Java sẽ dùng thằng này để kết nối với trình duyệt
        System.setProperty("webdriver.chrome.driver", webDriverPath);
        //Gọi trình duyệt lên
        WebDriver myBrowser = new ChromeDriver();
        //trình duyệt Chrome lúc này chính là được trỏ bởi biến myBrowser
        //mình muốn trình duyệt làm gì, mình chấm
        //gọi Google lên
        myBrowser.get("https://google.com");
        //mỗi tag trong trình duyệt được xem là một Object thuộc class WebElement
        WebElement keyword = myBrowser.findElement(By.name("q"));
        keyword.sendKeys("Ahihi đồ ngốc");
        keyword.submit(); //gõ xong bấm Enter
    }
}
