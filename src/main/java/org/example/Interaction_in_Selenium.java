package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Interaction_in_Selenium {

    static WebDriver driver;


    static void interactWithTextBox() throws InterruptedException {
        System.out.println("1.Welcome to the interactWithTextBox.");
        driver.get("https://the-internet.herokuapp.com/login");
        WebElement Username = driver.findElement(By.cssSelector("input#username"));
        Username.sendKeys("JoyBaidya");
        System.out.println("Entered the text value is : " + Username.getAttribute("value"));
        Thread.sleep(1000);
        System.out.println("the Username Taxt is cleared");
        Username.clear();
        System.out.println("the text is Empty : " + Username.getAttribute("value"));
        Thread.sleep(1000);
        }



    static void interactWithButton() throws InterruptedException {
        System.out.println("2.Welcome to the interactWithTextBox.");
        driver.get("https://www.google.com/");
        try {
            WebElement Button = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
            Thread.sleep(2000);
            Button.click();
            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println("BUTTON TYPE ERROR: "+e.getMessage());
        }

    }

    static void interactWithRadioButtons() throws InterruptedException {
    System.out.println("Welcome to the interactWithRadioButtons.");
     driver.get("https://demo.guru99.com/telecom/addcustomer.php");
        try {
            WebElement RadioButtons = driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[1]/label"));
            Thread.sleep(1000);
            RadioButtons.click();
           // System.out.println("RadioButtons selected: " + RadioButtons.isSelected());
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("RadioButtons error is:"+e.getMessage());
        }
    }


    static void interactWithCheckBox() throws InterruptedException {
    System.out.println("Welcome to the interactWithCheckBox.");
    driver.get("https://the-internet.herokuapp.com/checkboxes");

        //WebElement CheckBox = driver.findElement(By.xpath("//input[1]"));
         WebElement CheckBox = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/input[1]"));
        Thread.sleep(2000);
        CheckBox.click();
        System.out.println("Checkbox selected: " + CheckBox.isSelected());

        Thread.sleep(2000);

    }


    static void interactWithDropDown() throws InterruptedException {
    System.out.println("Welcome to the interactWithDropDown.");
    driver.get("https://the-internet.herokuapp.com/dropdown");
        Select DropDown = new Select(driver.findElement(By.id("dropdown")));
        Thread.sleep(2000);
        DropDown.selectByVisibleText("Option 1");
        Thread.sleep(2000);
        DropDown.selectByValue("2");
        Thread.sleep(2000);
        DropDown.selectByIndex(1);
        Thread.sleep(2000);
        DropDown.selectByIndex(2);
        Thread.sleep(2000);
    }

    static void interactWithLinks() throws InterruptedException {
    System.out.println("Welcome to the interactWithLinks.");
    driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(2000);
    WebElement  Links = driver.findElement(By.linkText("Redirect Link"));
                Links.click();
        Thread.sleep(2000);
    }


    static void interactWithImage() throws InterruptedException {
    System.out.println("Welcome to the interactWithImage.");
    driver.get("https://demo.guru99.com/");

        // WebElement Image = driver.findElement(By.xpath("//img[@alt='Guru99 Demo Sites']"));
        // WebElement Image = driver.findElement(By.xpath("//img[@src='/logo.png']"));
        try {
            WebElement Image = driver.findElement(By.xpath("//img[@role='presentation']"));
            Thread.sleep(2000);
            String imageUrl = Image.getAttribute("src");
            System.out.println("Image source: " + imageUrl);

            // Click the image (if clickable)
            Image.click();
            // Pause for demonstration
            Thread.sleep(2000);
        } catch (Exception e) {
            throw new RuntimeException(e);

        }


    }

    static void interactWithTables(){
    System.out.println("Welcome to the interactWithTables.");
        driver.get("https://the-internet.herokuapp.com/tables");
        WebElement Tables = driver.findElement(By.id("table1"));
        List<WebElement> rows = Tables.findElements(By.tagName("tr"));
        for (WebElement Row : rows) {
            List<WebElement> cols = Row.findElements(By.tagName("td"));
            for (WebElement col : cols) {
                System.out.print(col.getText() + "\t");
            }
            System.out.println();
        }

    }


   //don't clear Understands
    static void interactWithFrames() throws InterruptedException {
    System.out.println("Welcome to the interactWithFrames.");
        driver.get("https://the-internet.herokuapp.com/iframe");
        Thread.sleep(2000);
        driver.switchTo().frame("mce_0_ifr");
        Thread.sleep(2000);
        WebElement editor = driver.findElement(By.id("tinymce"));
        editor.clear();
        Thread.sleep(2000);
        editor.sendKeys("Hello, Frame!");
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        WebElement title = driver.findElement(By.xpath("//h3"));
        Thread.sleep(2000);
        System.out.println(title.getText());
    }

    static void interactWithAlerts() throws InterruptedException {
    System.out.println("Welcome to the interactWithAlerts.");
    driver.get("https://the-internet.herokuapp.com/javascript_alerts");


      //fast Alerts
       /* WebElement alertButton = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
        alertButton.click();

        Alert alert = driver.switchTo().alert();
        Thread.sleep(200);
        System.out.println(alert.getText());
        Thread.sleep(200);
        alert.accept();
        //alert.dismiss();
        Thread.sleep(200);

        / Verify the result text
        WebElement result = driver.findElement(By.id("result"));
        System.out.println("Result message: " + result.getText());
        //alert.accept();
        //alert.dismiss();
      */



        //2nd Alerts
      /* WebElement confirm = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
         confirm.click();

        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println(alert.getText());
        Thread.sleep(2000);
        alert.accept();
        //alert.dismiss();
        Thread.sleep(2000);

        // Verify the result text
        WebElement result = driver.findElement(By.id("result"));
        System.out.println("Result message: " + result.getText());
        //alert.accept();
        //alert.dismiss();
    */



        //3rd Alerts test send need
        WebElement prompt = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
         prompt.click();

        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println(alert.getText());
        Thread.sleep(2000);
        alert.sendKeys("my name is joy");

        alert.accept();
        //alert.dismiss();
        Thread.sleep(2000);

        // Verify the result text
        WebElement result = driver.findElement(By.id("result"));
        System.out.println("Result message: " + result.getText());

        //alert.accept();
        //alert.dismiss();


    }





    static void interactWithWindowsAndTabs(){
    System.out.println("Welcome to the interactWithWindowsAndTabs.");


    }

    static void interactWithHiddenElements(){
    System.out.println("Welcome to the interactWithHiddenElements.");


    }

    static void hoverOverElement(){
    System.out.println("Welcome to the hoverOverElement.");


    }

    static void dragAndDrop(){
    System.out.println("Welcome to the dragAndDrop.");


    }
    static void scrollPage(){
    System.out.println("Welcome to the scrollPage.");


    }

    static void JavaScriptClick(){
    System.out.println("Welcome to the JavaScriptClick.");


    }


    static void doubleClick(){
    System.out.println("Welcome to the doubleClick.");


    }
    static void rightClick(){
    System.out.println("Welcome to the rightClick.");


    }
    static void handleSpecialKeys(){
    System.out.println("Welcome to the handleSpecialKeys.");


    }

    static void uploadFile(){
    System.out.println("Welcome to the uploadFile.");


    }

    static void fatchingCssProperties(){
    System.out.println("Welcome to the fatchingCssProperties.");


    }
    static void gettingSizeAndPosition(){
    System.out.println("Welcome to the gettingSizeAndPosition.");


    }
    static void handingDynamicElements(){
    System.out.println("Welcome to the handingDynamicElements.");


    }
    static void captureScreenshot(){
    System.out.println("Welcome to the captureScreenshot.");


    }



public static void main(String[] args) throws InterruptedException {

    System.setProperty("webDriver.chrome.driver", "src/main/resources/chromedriver");
    driver = new ChromeDriver();
    driver.manage().window().maximize();

    Thread.sleep(2000);

     try{
          //interactWithTextBox();
          //interactWithButton();
          //interactWithRadioButtons();
          //interactWithCheckBox();
          //interactWithDropDown();
          //interactWithLinks();
          // interactWithImage();
          // interactWithTables();
          // interactWithFrames();
          interactWithAlerts();
          //interactWithWindowsAndTabs();
          //interactWithHiddenElements();

          //hoverOverElement();
          //dragAndDrop();
          //scrollPage();
          //JavaScriptClick();
          //doubleClick();
          //rightClick();
          //handleSpecialKeys();
          //uploadFile();
          //fatchingCssProperties();
          //gettingSizeAndPosition();
          //handingDynamicElements();
          //captureScreenshot();
         System.out.println("The Code Run completed");

     } catch (Exception e) {
         System.out.println("Error occurred during this test filed: " + e.getMessage());
     } finally {
         driver.quit();
     }

}

}